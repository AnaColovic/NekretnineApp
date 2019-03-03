/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import com.sun.javafx.geom.AreaOp;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import operacija.Operacija;
import operacija.StatusOperacije;
import transfer.OdgovorServera;
import transfer.ZahtevKlijenta;

/**
 *
 * @author Administrator
 */
public class FabrikaZahteva {

    private static FabrikaZahteva instance;
    private Map<Integer, IOBradaZahteva> zahtevi;

    public FabrikaZahteva() {
        zahtevi = new HashMap<>();
        zahtevi.put(Operacija.OPERACIJA_PRIJAVLJIVANJE_AGENTA, new OZPrijavljivanjeAgenta());
        zahtevi.put(Operacija.OPERACIJA_UNESI_VLASNIKA, new OZUnesiVlasnika());
        zahtevi.put(Operacija.OPERACIJA_VRATI_SVE_VLASNIKE, new OZVratiSveVlasnike());
        zahtevi.put(Operacija.OPERACIJA_VRATI_SVE_GRADOVE, new OZVratiSveGradove());
        zahtevi.put(Operacija.OPERACIJA_IZMENI_VLASNIKA, new OZIzmeniVlasnika());
        zahtevi.put(Operacija.OPERACIJA_UNESI_NEKRETNINU, new OZUnesiNekretninu());
        zahtevi.put(Operacija.OPERACIJA_IZMENI_NEKRETNINU, new OZIzmeniNekretninu());
        zahtevi.put(Operacija.OPERACIJA_UNESI_KLIJENTA, new OZUnesiKlijenta());
        zahtevi.put(Operacija.OPERACIJA_PRETRAZI_NEKRETNINE, new OZPretragaNekretnina());
        zahtevi.put(Operacija.OPERACIJA_VRATI_NEKRETNINU, new OZVratiNekretninu());
        zahtevi.put(Operacija.OPERACIJA_PRETRAZI_KLIJENTE, new OZPretragaKlijenata());
        zahtevi.put(Operacija.OPERACIJA_IZMENI_KLIJENTA, new OZIzmeniKlijenta());
        zahtevi.put(Operacija.OPERACIJA_UNESI_UGOVOR_O_ZAKUPU, new OZUnesiUgovorOZakupu());
        zahtevi.put(Operacija.OPERACIJA_UNESI_UGOVOR_O_KUPOPRODAJI, new OZUnesiUgovorOKupoprodaji());
        zahtevi.put(Operacija.OPERACIJA_PRETRAZI_UGOVORE_O_KUPOPRODAJI, new OZPretragaUgovoraOKupoprodaji());
        zahtevi.put(Operacija.OPERACIJA_PRETRAZI_UGOVORE_O_ZAKUPU, new OZPretragaUgovoraOZakupu());
        zahtevi.put(Operacija.OPERACIJA_PRETRAZI_VLASNIKE, new OZPretragaVlasnika());
        zahtevi.put(Operacija.OPERACIJA_ODJAVI_SE, new OZOdjavljivanjeAgenta());
        zahtevi.put(Operacija.OPERACIJA_VRATI_SVE_KLIJENTE, new OZVratiSveKlijente());
                
    }

    public OdgovorServera izvrsiZahtev(ZahtevKlijenta zahtev) {
        OdgovorServera odgovor = new OdgovorServera();
        try {
            odgovor = zahtevi.get(zahtev.getOperacija()).izvrsi(zahtev.getPodaci());
        } catch (Exception ex) {
            odgovor.setGreska(ex);
            odgovor.setStatus(StatusOperacije.ERROR);
        }
        return odgovor;
    }

    public static FabrikaZahteva getInstance() {
        if (instance == null) {
            instance = new FabrikaZahteva();
        }
        return instance;
    }
}
