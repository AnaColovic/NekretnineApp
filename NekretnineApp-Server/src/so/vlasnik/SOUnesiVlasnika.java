/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.vlasnik;

import domain.OpstaDomenskaKlasa;
import domain.Vlasnik;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOUnesiVlasnika extends OpstaSistemskaOperacija{
    private Vlasnik vlasnik;

    @Override
    protected void validacija(Object obj) throws Exception {
        if(!(obj instanceof Vlasnik)){
            throw new Exception("Objekat nije validan");
        }
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        vlasnik = (Vlasnik) brokerBaze.unesi((OpstaDomenskaKlasa) obj);
        System.out.println(vlasnik +" NAKON BAZE");
    }

    /**
     * @return the vlasnik
     */
    public Vlasnik getVlasnik() {
        return vlasnik;
    }
    
    
    
}
