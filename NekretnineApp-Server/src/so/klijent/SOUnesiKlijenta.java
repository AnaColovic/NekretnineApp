/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.klijent;

import domain.Klijent;
import domain.OpstaDomenskaKlasa;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOUnesiKlijenta extends OpstaSistemskaOperacija {
    private Klijent klijent;

    @Override
    protected void validacija(Object obj) throws Exception {
        if (!(obj instanceof Klijent)) {
            throw new Exception("Objekat nije validan");
        }
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        klijent = (Klijent) brokerBaze.unesi((OpstaDomenskaKlasa) obj);
    }

    /**
     * @return the klijent
     */
    public Klijent getKlijent() {
        return klijent;
    }
    
    

}
