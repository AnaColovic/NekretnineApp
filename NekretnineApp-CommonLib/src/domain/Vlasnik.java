/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Vlasnik implements OpstaDomenskaKlasa {

    private Long idVlasnik;
    private String ime;
    private String prezime;
    private Date datumRodjenja;
    private String brTelefona;

    public Vlasnik() {
    }

    public Vlasnik(Long idVlasnik, String ime, String prezime, Date datumRodjenja, String brTelefona) {
        this.idVlasnik = idVlasnik;
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.brTelefona = brTelefona;
    }

    /**
     * @return the idVlasnik
     */
    public Long getIdVlasnik() {
        return idVlasnik;
    }

    /**
     * @param idVlasnik the idVlasnik to set
     */
    public void setIdVlasnik(Long idVlasnik) {
        this.idVlasnik = idVlasnik;
    }

    /**
     * @return the ime
     */
    public String getIme() {
        return ime;
    }

    /**
     * @param ime the ime to set
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     * @return the prezime
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * @param prezime the prezime to set
     */
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    /**
     * @return the datumRodjenja
     */
    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    /**
     * @param datumRodjenja the datumRodjenja to set
     */
    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    /**
     * @return the brTelefona
     */
    public String getBrTelefona() {
        return brTelefona;
    }

    /**
     * @param brTelefona the brTelefona to set
     */
    public void setBrTelefona(String brTelefona) {
        this.brTelefona = brTelefona;
    }

    @Override
    public String toString() {
        return prezime + " " + ime;
    }

    @Override
    public String vratiVrednostiAtributa() {
        return idVlasnik + ", " + (ime == null ? null : "'" + ime + "'") + ", " + (prezime == null ? null : "'" + prezime + "'") + ", '" + datumRodjenja + "', " + (brTelefona == null ? null : "'" + brTelefona + "'");

    }

    @Override
    public String postaviVrednostiAtributa() {
        return "idVlasnik=" + idVlasnik + ", ime=" + (ime == null ? null : "'" + ime + "'") + ", prezime=" + (prezime == null ? null : "'" + prezime + "'") + ", datum_rodjenja='" + datumRodjenja + "', broj_telefona=" + (brTelefona == null ? null : "'" + brTelefona + "'");

    }

    @Override
    public String vratiImeKlase() {
        return "Vlasnik";
    }

    @Override
    public String vratiUslovZaNadjiSlog() {
        return " WHERE idVlasnik =" + idVlasnik;
    }


    @Override
    public String vratiImeKolone(int kolona) {
        String kolone[] = new String[]{"idVlasnik", "ime", "prezime", "datum_rodjenja", "broj_telefona"};
        return kolone[kolona];
    }

    @Override
    public OpstaDomenskaKlasa napuni(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpstaDomenskaKlasa postaviID(ResultSet rs) throws Exception {
        if (rs.next()) {
            idVlasnik = rs.getLong(1);
        } else {
            throw new Exception("IDVlasnik nije validan");
        }
        return this;
    }

    @Override
    public List<OpstaDomenskaKlasa> vratiListu(ResultSet rs) throws Exception {
        List<OpstaDomenskaKlasa> vlasnici = new LinkedList<>();
        while(rs.next()){
            Vlasnik v = new Vlasnik(rs.getLong("idVlasnik"), rs.getString("ime"), rs.getString("prezime"), rs.getDate("datum_rodjenja"), rs.getString("broj_telefona"));
            vlasnici.add(v);
        }
        return vlasnici;
    }

    @Override
    public String vratiImenaKolona() {
        return " (idVlasnik, ime, prezime, datum_rodjenja, broj_telefona) ";
    }

    @Override
    public String vratiUslovZaSortiranje() {
        return " ORDER BY prezime ASC";
    }

    @Override
    public String vratiUslovZaNadjiSlogove() {
        return " WHERE ime LIKE '" + ime + "%' AND prezime LIKE '" + prezime + "%' ";
    }
    
    

}
