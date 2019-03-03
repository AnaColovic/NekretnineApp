/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.ugovor_o_zakupu;

import domain.OpstaDomenskaKlasa;
import domain.UgovorOZakupuNekretnine;
import java.util.List;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOPretraziUgovoreOZakupu extends OpstaSistemskaOperacija{
    private List<OpstaDomenskaKlasa> ugovori;

    @Override
    protected void validacija(Object obj) throws Exception {
        if(!(obj instanceof UgovorOZakupuNekretnine)) throw new Exception("Objekat nije validan");
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
