/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.nekretnina;

import domain.Nekretnina;
import domain.NekretninaZaIzdavanje;
import domain.NekretninaZaProdaju;
import domain.OpstaDomenskaKlasa;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOIzmeniNekretninu extends OpstaSistemskaOperacija {

    @Override
    protected void validacija(Object obj) throws Exception {
        if (obj instanceof NekretninaZaIzdavanje) {
            System.out.println("NEKRETNINA ZA IZDAVANJE");
        } else if (obj instanceof NekretninaZaProdaju) {
            System.out.println("NEKRETNINA ZA PRODAJU");
        } else {
            throw new Exception("Objekat nije validan");
        }
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        brokerBaze.izmeni((OpstaDomenskaKlasa) obj);
    }

    
    

}
