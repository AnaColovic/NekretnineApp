/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ugovor_o_kupoprodaji;

import domain.Nekretnina;
import domain.OpstaDomenskaKlasa;
import domain.StatusNekretnine;
import domain.UgovorOKupoprodajiNekretnine;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOUnesiUgovorOKupoprodaji extends OpstaSistemskaOperacija {
    private UgovorOKupoprodajiNekretnine ugovor;

    @Override
    protected void validacija(Object obj) throws Exception {
        if (!(obj instanceof UgovorOKupoprodajiNekretnine)) {
            throw new Exception("Objekat nije validan");
        }
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        ugovor = (UgovorOKupoprodajiNekretnine) brokerBaze.unesi((OpstaDomenskaKlasa) obj);
        Nekretnina nekretnina = ugovor.getNekretnina();
        nekretnina.setStatus(StatusNekretnine.NIJE_U_PONUDI);
        brokerBaze.izmeni(nekretnina);
    }

    /**
     * @return the ugovor
     */
    public UgovorOKupoprodajiNekretnine getUgovor() {
        return ugovor;
    }
    

}
