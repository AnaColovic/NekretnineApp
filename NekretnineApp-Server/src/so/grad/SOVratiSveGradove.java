/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.grad;

import domain.Grad;
import domain.OpstaDomenskaKlasa;
import java.util.List;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOVratiSveGradove extends OpstaSistemskaOperacija{
    private List<OpstaDomenskaKlasa> gradovi;

    @Override
    protected void validacija(Object obj) throws Exception {
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        gradovi = brokerBaze.vratiSve((Grad) obj);
    }

    /**
     * @return the gradovi
     */
    public List<OpstaDomenskaKlasa> getGradovi() {
        return gradovi;
    }
    
    
    
}
