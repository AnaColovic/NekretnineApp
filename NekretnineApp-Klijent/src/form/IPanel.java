/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import domain.OpstaDomenskaKlasa;

/**
 *
 * @author Administrator
 */
public interface IPanel {
    void popuniPolja(OpstaDomenskaKlasa odk);
    OpstaDomenskaKlasa preuzmiPolja() throws Exception;
    void isprazniPolja();
    default void dekorisiPanel(){}
    void postaviVidljivostPoljima(boolean signal);
    void popuniPodatke();
    //void postaviOsluskivac();
}
