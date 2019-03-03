/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.Nekretnina;
import domain.OpstaDomenskaKlasa;
import java.util.List;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZPretragaNekretnina implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        Nekretnina nek = (Nekretnina) podaci;

        List<OpstaDomenskaKlasa> nekretnine = Kontroler.getInstance().pretraziNekretnine(nek);
        odgovor.setPodaci(nekretnine);
        odgovor.setStatus(StatusOperacije.OK);
        return odgovor;
    }

}
