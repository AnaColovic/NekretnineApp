/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.UgovorOKupoprodajiNekretnine;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZUnesiUgovorOKupoprodaji implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        UgovorOKupoprodajiNekretnine ugovorOKupoprodaji = (UgovorOKupoprodajiNekretnine) podaci;

        ugovorOKupoprodaji = Kontroler.getInstance().unesiUgovorOKupoprodaji(ugovorOKupoprodaji);
        odgovor.setPodaci(ugovorOKupoprodaji);
        odgovor.setStatus(StatusOperacije.OK);
        return odgovor;
    }

}
