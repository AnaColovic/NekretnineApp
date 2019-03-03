/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.nekretnina;

import domain.Nekretnina;
import domain.OpstaDomenskaKlasa;
import java.util.List;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOPretraziNekretnine extends OpstaSistemskaOperacija{
    private List<OpstaDomenskaKlasa> nekretnine;

    @Override
    protected void validacija(Object obj) throws Exception {
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        nekretnine = brokerBaze.vratiSveSaUslovom((OpstaDomenskaKlasa) obj);
    }

    /**
     * @return the nekretnine
     */
    public List<OpstaDomenskaKlasa> getNekretnine() {
        return nekretnine;
    }
    
    
    
}
