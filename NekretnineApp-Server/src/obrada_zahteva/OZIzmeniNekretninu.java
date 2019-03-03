/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.Nekretnina;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZIzmeniNekretninu implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        Nekretnina n = (Nekretnina) podaci;

        n = Kontroler.getInstance().izmeniNekretninu(n);
        odgovor.setPodaci(n);
        odgovor.setStatus(StatusOperacije.OK);
        return odgovor;
    }

}
