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
public class OZUnesiNekretninu implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        Nekretnina nekretnina = (Nekretnina) podaci;

        nekretnina = Kontroler.getInstance().unesiNekretninu(nekretnina);
        odgovor.setPodaci(nekretnina);
        odgovor.setStatus(StatusOperacije.OK);
        
        return odgovor;
    }

}
