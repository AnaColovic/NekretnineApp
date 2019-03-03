/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.Klijent;
import domain.OpstaDomenskaKlasa;
import java.util.List;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZPretragaKlijenata implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        Klijent k = (Klijent) podaci;

        List<OpstaDomenskaKlasa> klijenti = Kontroler.getInstance().pretraziKlijente(k);
        odgovor.setPodaci(klijenti);
        odgovor.setStatus(StatusOperacije.OK);
        
        return odgovor;
    }

}
