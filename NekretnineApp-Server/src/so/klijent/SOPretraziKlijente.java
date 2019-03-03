/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.klijent;

import domain.Klijent;
import domain.OpstaDomenskaKlasa;
import java.util.List;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOPretraziKlijente extends OpstaSistemskaOperacija {
    private List<OpstaDomenskaKlasa> klijenti;

    @Override
    protected void validacija(Object obj) throws Exception {
        if (!(obj instanceof Klijent)) {
            throw new Exception("Objekat nije validan");
        }
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        klijenti = brokerBaze.vratiSveSaUslovom((OpstaDomenskaKlasa) obj);
    }

    /**
     * @return the klijenti
     */
    public List<OpstaDomenskaKlasa> getKlijenti() {
        return klijenti;
    }
    
    

}
