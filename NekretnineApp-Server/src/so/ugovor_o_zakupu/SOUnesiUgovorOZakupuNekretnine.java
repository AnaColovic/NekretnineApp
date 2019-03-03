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
public class SOUnesiUgovorOZakupuNekretnine extends OpstaSistemskaOperacija {

    private UgovorOZakupuNekretnine ugovor1;

    @Override
    protected void validacija(Object obj) throws Exception {
        if (!(obj instanceof UgovorOZakupuNekretnine)) {
            throw new Exception("Objekat nije validan");
        }
        List<OpstaDomenskaKlasa> ugovori = brokerBaze.vratiSve((UgovorOZakupuNekretnine) obj);
        for (OpstaDomenskaKlasa u : ugovori) {
            UgovorOZakupuNekretnine ugovor = (UgovorOZakupuNekretnine) u;
            if (ugovor.getNekretnina().getIdNekretnina().equals(((UgovorOZakupuNekretnine) obj).getNekretnina().getIdNekretnina())) {
                if ((((((UgovorOZakupuNekretnine) obj).getDatumOd().before(ugovor.getDatumDo()) && ((UgovorOZakupuNekretnine) obj).getDatumOd().after(ugovor.getDatumOd()))
                        || ((UgovorOZakupuNekretnine) obj).getDatumDo().before(ugovor.getDatumDo()) && ((UgovorOZakupuNekretnine) obj).getDatumDo().after(ugovor.getDatumOd())))) {
                    throw new Exception("Nekretnina je vec iznajmljena u zeljenom periodu");

                }

            }
        }

    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        ugovor1 = (UgovorOZakupuNekretnine) brokerBaze.unesi((OpstaDomenskaKlasa) obj);
    }

    /**
     * @return the ugovor
     */
    public UgovorOZakupuNekretnine getUgovor() {
        return ugovor1;
    }

}
