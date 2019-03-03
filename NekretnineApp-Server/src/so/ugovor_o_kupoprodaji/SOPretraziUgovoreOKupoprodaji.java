/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ugovor_o_kupoprodaji;

import domain.OpstaDomenskaKlasa;
import domain.UgovorOKupoprodajiNekretnine;
import java.util.List;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOPretraziUgovoreOKupoprodaji extends OpstaSistemskaOperacija{
    private List<OpstaDomenskaKlasa> ugovori;

    @Override
    protected void validacija(Object obj) throws Exception {
        if(!(obj instanceof UgovorOKupoprodajiNekretnine)) throw new Exception("Objekat nije validan");
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        ugovori = brokerBaze.vratiSveSaUslovom((OpstaDomenskaKlasa) obj);
    }

    /**
     * @return the ugovori
     */
    public List<OpstaDomenskaKlasa> getUgovori() {
        return ugovori;
    }
    
    
    
}
