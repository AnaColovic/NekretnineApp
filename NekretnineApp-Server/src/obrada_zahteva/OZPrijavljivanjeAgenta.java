/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import kontroler.Kontroler;
import domain.Agent;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class OZPrijavljivanjeAgenta implements IOBradaZahteva {

    @Override
    public OdgovorServera izvrsi(Object podaci) throws Exception {
        OdgovorServera odgovor = new OdgovorServera();
        Agent agent = (Agent) podaci;

        agent = (Agent) Kontroler.getInstance().logIn(agent);
        Kontroler.getInstance().getForma().dodajPrijavljenogAgenta(agent);
        System.out.println(agent);
        odgovor.setPodaci(agent);
        odgovor.setStatus(StatusOperacije.OK);

        return odgovor;
    }

}
