/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladiste.baza;

import domain.OpstaDomenskaKlasa;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IBrokerBaze {
    OpstaDomenskaKlasa vratiJednu(OpstaDomenskaKlasa odk) throws Exception;
    List<OpstaDomenskaKlasa> vratiSveSaUslovom(OpstaDomenskaKlasa odk) throws Exception;
    OpstaDomenskaKlasa unesi(OpstaDomenskaKlasa odk) throws Exception;
    void izmeni(OpstaDomenskaKlasa odk) throws Exception;
    List<OpstaDomenskaKlasa> vratiSve(OpstaDomenskaKlasa odk) throws Exception;
}
