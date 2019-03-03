/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.nekretnina;

import domain.Nekretnina;
import domain.OpstaDomenskaKlasa;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOVratiNekretninu extends OpstaSistemskaOperacija{
    private Nekretnina nekretnina;

    @Override
    protected void validacija(Object obj) throws Exception {
        if(!(obj instanceof Nekretnina)) throw new Exception("Objekat nije validan");
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        nekretnina = (Nekretnina) brokerBaze.vratiJednu((OpstaDomenskaKlasa) obj);
    }

    /**
     * @return the nekretnina
     */
    public Nekretnina getNekretnina() {
        return nekretnina;
    }
    
    
    
}
