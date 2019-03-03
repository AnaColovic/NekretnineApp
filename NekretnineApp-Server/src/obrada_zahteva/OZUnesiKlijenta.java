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
public class OZUnesiKlijenta implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        Klijent klijent = (Klijent) podaci;

        klijent = Kontroler.getInstance().unesiKlijenta(klijent);
        odgovor.setPodaci(klijent);
        odgovor.setStatus(StatusOperacije.OK);
        return odgovor;
    }

}
