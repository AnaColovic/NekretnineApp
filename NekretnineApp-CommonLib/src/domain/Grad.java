/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Grad implements OpstaDomenskaKlasa{
    private Long idGrad;
    private String nazivGrada;

    public Grad() {
    }

    public Grad(Long idGrad, String nazivGrada) {
        this.idGrad = idGrad;
        this.nazivGrada = nazivGrada;
    }

    /**
     * @return the idGrad
     */
    public Long getIdGrad() {
        return idGrad;
    }

    /**
     * @param idGrad the idGrad to set
     */
    public void setIdGrad(Long idGrad) {
        this.idGrad = idGrad;
    }

    /**
     * @return the nazivGrada
     */
    public String getNazivGrada() {
        return nazivGrada;
    }

    /**
     * @param nazivGrada the nazivGrada to set
     */
    public void setNazivGrada(String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

    @Override
    public String toString() {
        return nazivGrada;
    }

    @Override
    public String vratiVrednostiAtributa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String postaviVrednostiAtributa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiImeKlase() {
        return "Grad";
    }

    @Override
    public String vratiUslovZaNadjiSlog() {
        return " WHERE idGrad=" + idGrad;
    }

    @Override
    public String vratiImeKolone(int kolona) {
        String[] kolone = new String[]{"idGrad","naziv"};
        return kolone[kolona];
    }

    @Override
    public OpstaDomenskaKlasa napuni(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpstaDomenskaKlasa postaviID(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OpstaDomenskaKlasa> vratiListu(ResultSet rs) throws Exception {
        List<OpstaDomenskaKlasa> gradovi = new LinkedList<>();
        while(rs.next()){
            Grad g = new Grad(rs.getLong("idGrad"), rs.getString("naziv"));
            gradovi.add(g);
        }
        
        return gradovi;
    }

    @Override
    public String vratiImenaKolona() {
        return " (idGrad, naziv) ";
    }

    @Override
    public String vratiUslovZaSortiranje() {
        return " ORDER BY naziv ASC";
    }
    
    
    
    
}
