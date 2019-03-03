/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.vlasnik;

import domain.OpstaDomenskaKlasa;
import domain.Vlasnik;
import java.util.List;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOVratiSveVlasnike extends OpstaSistemskaOperacija{
    private List<OpstaDomenskaKlasa> vlasnici;

    @Override
    protected void validacija(Object obj) throws Exception {
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        vlasnici = brokerBaze.vratiSve((Vlasnik)obj);
    }

    /**
     * @return the vlasnici
     */
    public List<OpstaDomenskaKlasa> getVlasnici() {
        return vlasnici;
    }
    
    
    
}
