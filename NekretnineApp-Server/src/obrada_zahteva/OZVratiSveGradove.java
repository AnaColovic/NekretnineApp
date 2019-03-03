/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.OpstaDomenskaKlasa;
import java.util.List;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZVratiSveGradove implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        List<OpstaDomenskaKlasa> gradovi = Kontroler.getInstance().vratiSveGradove();
        System.out.println(gradovi);

        odgovor.setPodaci(gradovi);
        odgovor.setStatus(StatusOperacije.OK);
        return odgovor;
    }

}
