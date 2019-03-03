/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.Vlasnik;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZIzmeniVlasnika implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        Vlasnik v = (Vlasnik) podaci;

        v = Kontroler.getInstance().izmeniVlasnika(v);
        odgovor.setPodaci(v);
        odgovor.setStatus(StatusOperacije.OK);
        
        return odgovor;
    }

}
