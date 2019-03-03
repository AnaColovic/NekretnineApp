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
public class OZUnesiVlasnika implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        Vlasnik vlasnik = (Vlasnik) podaci;

        System.out.println(vlasnik);

        vlasnik = (Vlasnik) Kontroler.getInstance().unesiVlasnika(vlasnik);
        odgovor.setPodaci(vlasnik);
        odgovor.setStatus(StatusOperacije.OK);
        return odgovor;
    }

}
