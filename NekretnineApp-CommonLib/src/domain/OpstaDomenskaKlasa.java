/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface OpstaDomenskaKlasa extends Serializable{

    String vratiVrednostiAtributa();

    String postaviVrednostiAtributa();

    String vratiImeKlase();

    String vratiUslovZaNadjiSlog();

    default String vratiUslovZaNadjiSlogove(){return "";}
    
    String vratiImeKolone(int kolona);

    OpstaDomenskaKlasa napuni(ResultSet rs) throws Exception;
    
    OpstaDomenskaKlasa postaviID(ResultSet rs) throws Exception;
    
    List<OpstaDomenskaKlasa> vratiListu(ResultSet rs) throws Exception;
    
    String vratiImenaKolona();
    
    default String vratiSpajanje(){return "";}
    
    default String vratiUslovZaSortiranje(){return "";}
    
    default String vratiUslovZaNadjiSlogSaSpajanjem(){return vratiUslovZaNadjiSlog();}
}
