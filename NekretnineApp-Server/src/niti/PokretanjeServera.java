/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import kontroler.Kontroler;
import form.FrmMain;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import operacija.StatusOperacije;
import transfer.OdgovorServera;
import util.PodesavanjeKonekcije;

/**
 *
 * @author Administrator
 */
public class PokretanjeServera extends Thread {

    ServerSocket serverSocket;
    boolean signal;
   // List<KlijentskaNit> aktivneNiti;

    public PokretanjeServera() {
        //aktivneNiti = new LinkedList<>();
        signal = true;
    }

    @Override
    public void run() {
        int port = Integer.parseInt(PodesavanjeKonekcije.getInstance().getProperty("port"));
        try {
            serverSocket = new ServerSocket(port);
            Kontroler.getInstance().getForma().postaviStatus("Server je pokrenut na portu " + port, true);
            while (signal) {
                Socket socket = serverSocket.accept();
                KlijentskaNit nitKlijenta = new KlijentskaNit(socket);
                nitKlijenta.start();
                Kontroler.getInstance().getPrijavljeniAgenti().add(nitKlijenta);
            }
        } catch (IOException ex) {
            Kontroler.getInstance().getForma().postaviStatus("Server nije pokrenut", false);
        }
    }

    public void zaustaviServer() {
        signal = false;
        try {
            serverSocket.close();
        } catch (IOException ex) {
            System.out.println("GASI SE SERVER");
           // Logger.getLogger(PokretanjeServera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
