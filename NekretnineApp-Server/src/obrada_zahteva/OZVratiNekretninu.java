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
public class OZVratiNekretninu implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        Nekretnina n1 = (Nekretnina) podaci;

        n1 = Kontroler.getInstance().vratiNekretninu(n1);
        odgovor.setPodaci(n1);
        odgovor.setStatus(StatusOperacije.OK);
        return odgovor;
    }

}
