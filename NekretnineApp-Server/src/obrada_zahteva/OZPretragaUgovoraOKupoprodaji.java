/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.OpstaDomenskaKlasa;
import domain.UgovorOKupoprodajiNekretnine;
import java.util.List;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZPretragaUgovoraOKupoprodaji implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        UgovorOKupoprodajiNekretnine u1 = (UgovorOKupoprodajiNekretnine) podaci;

        List<OpstaDomenskaKlasa> ugovoriKupoprodaja = Kontroler.getInstance().pretraziUgovoreOKupoprodaji(u1);
        odgovor.setPodaci(ugovoriKupoprodaja);
        odgovor.setStatus(StatusOperacije.OK);
        
        return odgovor;
    }

}
