/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.OpstaDomenskaKlasa;
import domain.UgovorOZakupuNekretnine;
import java.util.List;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZPretragaUgovoraOZakupu implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        UgovorOZakupuNekretnine ugovor = (UgovorOZakupuNekretnine)podaci;

        List<OpstaDomenskaKlasa> ug = Kontroler.getInstance().pretraziUgovoreOZakupu(ugovor);
        odgovor.setPodaci(ug);
        odgovor.setStatus(StatusOperacije.OK);
        
        return odgovor;
    }

}
