/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.klijent;

import domain.OpstaDomenskaKlasa;
import java.util.List;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOVratiSveKlijente extends OpstaSistemskaOperacija{
    private List<OpstaDomenskaKlasa> klijenti;

    @Override
    protected void validacija(Object obj) throws Exception {
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        klijenti = brokerBaze.vratiSve((OpstaDomenskaKlasa) obj);
    }

    /**
     * @return the klijenti
     */
    public List<OpstaDomenskaKlasa> getKlijenti() {
        return klijenti;
    }
    
    
    
}
