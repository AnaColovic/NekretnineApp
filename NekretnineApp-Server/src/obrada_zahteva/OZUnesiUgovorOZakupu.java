/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.UgovorOZakupuNekretnine;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZUnesiUgovorOZakupu implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        UgovorOZakupuNekretnine ugovorOZakupu = (UgovorOZakupuNekretnine) podaci;

        ugovorOZakupu = Kontroler.getInstance().unesiUgovorOZakupu(ugovorOZakupu);
        odgovor.setPodaci(ugovorOZakupu);
        odgovor.setStatus(StatusOperacije.OK);
        
        return odgovor;
    }

}
