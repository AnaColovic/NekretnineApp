/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import kontroler.Kontroler;
import domain.Agent;
import domain.Klijent;
import domain.Nekretnina;
import domain.OpstaDomenskaKlasa;
import domain.UgovorOKupoprodajiNekretnine;
import domain.UgovorOZakupuNekretnine;
import domain.Vlasnik;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import obrada_zahteva.FabrikaZahteva;
import operacija.Operacija;
import operacija.StatusOperacije;
import transfer.OdgovorServera;
import transfer.ZahtevKlijenta;

/**
 *
 * @author Administrator
 */
public class KlijentskaNit extends Thread {

    private Socket socket;
    boolean signal;
    private Agent agent;

    public KlijentskaNit(Socket socket) {
        signal = true;
        this.socket = socket;
    }

    @Override
    public void run() {
        while (signal) {
            ZahtevKlijenta zahtev = primiZahtev();
            OdgovorServera odgovor = FabrikaZahteva.getInstance().izvrsiZahtev(zahtev);

            if (odgovor.getPodaci()!= null && odgovor.getPodaci().equals(false)) {
                Kontroler.getInstance().getPrijavljeniAgenti().remove(this);
                break;
            } else {
                System.out.println(odgovor);
                posaljiOdgovor(odgovor);
            }
        }

        System.out.println("PREKIDA SE KLIJENTSKA NIT");
    }

    /**
     * @return the socket
     */
    public Socket getSocket() {
        return socket;
    }

    public void zaustavi() {

        signal = false;
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(KlijentskaNit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void posaljiOdgovor(OdgovorServera odgovor) {
        try {
            ObjectOutputStream outSocket = new ObjectOutputStream(socket.getOutputStream());
            outSocket.writeObject(odgovor);

        } catch (IOException ex) {
            Logger.getLogger(KlijentskaNit.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ZahtevKlijenta primiZahtev() {
        ZahtevKlijenta zahtev = new ZahtevKlijenta();
        try {
            ObjectInputStream inSocket = new ObjectInputStream(socket.getInputStream());
            zahtev = (ZahtevKlijenta) inSocket.readObject();

        } catch (IOException ex) {
            System.out.println("NE MOZE SE PRIMITI ZAHTEV, GASI SE NIT");
            //Logger.getLogger(KlijentskaNit.class.getName()).log(Level.SEVERE, null, ex);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KlijentskaNit.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return zahtev;
    }

    /**
     * @return the agent
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * @param agent the agent to set
     */
    public void setAgent(Agent agent) {
        this.agent = agent;
    }

}
