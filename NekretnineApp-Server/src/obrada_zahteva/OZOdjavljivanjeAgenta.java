/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.Agent;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZOdjavljivanjeAgenta implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        if (podaci.equals(true)) {
            odgovor.setPodaci(false);
        } else {
            System.out.println("Odjavljuje se agent");
            Kontroler.getInstance().getForma().odjaviPrijavljenogAgenta((Agent) podaci);

            odgovor.setPodaci("Odjavljeni ste sa sistema");
            odgovor.setStatus(StatusOperacije.OK);

        }
        return odgovor;
    }
}
