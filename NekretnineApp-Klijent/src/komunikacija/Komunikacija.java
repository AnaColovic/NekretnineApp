/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import kontroler.Kontroler;
import form.FrmLogIn;
import java.awt.Window;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import transfer.OdgovorServera;
import transfer.ZahtevKlijenta;
import util.PodesavanjeKonekcije;

/**
 *
 * @author Administrator
 */
public class Komunikacija {

    private static Komunikacija instance;
    private Socket socket;

    private Komunikacija() {
        int port = Integer.parseInt(PodesavanjeKonekcije.getInstance().getProperty("port"));
        String adresa = PodesavanjeKonekcije.getInstance().getProperty("adresa");
        try {
            socket = new Socket(adresa, port);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Server nije pokrenut", "ERROR",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
           // Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Komunikacija getInstance() {
        if (instance == null) {
            instance = new Komunikacija();
        }
        return instance;
    }

    public void posaljiZahtev(ZahtevKlijenta zahtev) {
        try {
            ObjectOutputStream outSocket = new ObjectOutputStream(getSocket().getOutputStream());
            outSocket.writeObject(zahtev);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Server vise nije pokrenut", "ERROR",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            //Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public OdgovorServera primiOdgovor() {
        OdgovorServera odgovor = new OdgovorServera();
        try {
            ObjectInputStream inSocket = new ObjectInputStream(getSocket().getInputStream());
            odgovor = (OdgovorServera) inSocket.readObject();

        } catch (IOException ex) {
            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Komunikacija.class.getName()).log(Level.SEVERE, null, ex);
        }
        return odgovor;
    }

    /**
     * @return the socket
     */
    public Socket getSocket() {
        return socket;
    }

    /**
     * @param socket the socket to set
     */
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
