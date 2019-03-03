/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.Klijent;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZIzmeniKlijenta implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        Klijent k1 = (Klijent) podaci;

        k1 = Kontroler.getInstance().izmeniKlijenta(k1);
        odgovor.setPodaci(k1);
        odgovor.setStatus(StatusOperacije.OK);
        return odgovor;
    }

}
