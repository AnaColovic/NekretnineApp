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
public class Klijent implements OpstaDomenskaKlasa {

    private Long idKlijent;
    private String ime;
    private String prezime;
    private String jmbg;
    private Date datumRodjenja;
    private String brTelefona;
    private String email;
    private String adresa;

    public Klijent() {
    }

    public Klijent(Long idKlijent, String ime, String prezime, String jmbg, Date datumRodjenja, String brTelefona, String email, String adresa) {
        this.idKlijent = idKlijent;
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.datumRodjenja = datumRodjenja;
        this.brTelefona = brTelefona;
        this.email = email;
        this.adresa = adresa;
    }

    /**
     * @return the idKlijent
     */
    public Long getIdKlijent() {
        return idKlijent;
    }

    /**
     * @param idKlijent the idKlijent to set
     */
    public void setIdKlijent(Long idKlijent) {
        this.idKlijent = idKlijent;
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
     * @return the jmbg
     */
    public String getJmbg() {
        return jmbg;
    }

    /**
     * @param jmbg the jmbg to set
     */
    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the adresa
     */
    public String getAdresa() {
        return adresa;
    }

    /**
     * @param adresa the adresa to set
     */
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String vratiVrednostiAtributa() {
        return idKlijent + ", " + (ime == null ? null : "'" + ime + "'") + ", " + (prezime == null ? null : "'" + prezime + "'") + ", " + (jmbg == null ? null : "'" + jmbg + "'") + ", '" + datumRodjenja + "', " + (brTelefona == null ? null : "'" + brTelefona + "'") + ", " + (email == null ? null : "'" + email + "'") + ", " + (adresa == null ? null : "'" + adresa + "'");

    }

    @Override
    public String postaviVrednostiAtributa() {
        return "idKlijent=" + idKlijent + ", ime=" + (ime == null ? null : "'" + ime + "'") + ", prezime=" + (prezime == null ? null : "'" + prezime + "'") + ", jmbg=" + (jmbg == null ? null : "'" + jmbg + "'") + ", datum_rodjenja='" + datumRodjenja + "', broj_telefona=" + (brTelefona == null ? null : "'" + brTelefona + "'") + ", email=" + (email == null ? null : "'" + email + "'") + ", adresa=" + (adresa == null ? null : "'" + adresa + "'");
    }

    @Override
    public String vratiImeKlase() {
        return "Klijent";
    }

    @Override
    public String vratiUslovZaNadjiSlog() {
        return " WHERE idKlijent=" + idKlijent;
    }

    @Override
    public String vratiUslovZaNadjiSlogove() {
        return " WHERE ime LIKE '" + ime + "%' AND prezime LIKE '" + prezime + "%' ";
    }

    @Override
    public String vratiImeKolone(int kolona) {
        String[] kolone = new String[]{"idKlijent","ime","prezime","jmbg","datum_rodjenja","broj_telefona","email","adresa"};
        return kolone[kolona];
    }

    @Override
    public OpstaDomenskaKlasa napuni(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpstaDomenskaKlasa postaviID(ResultSet rs) throws Exception {
        if (rs.next()) {
            idKlijent = rs.getLong(1);
        } else {
            throw new Exception("IDKlijent nije validan");
        }
        return this;
    }

    @Override
    public List<OpstaDomenskaKlasa> vratiListu(ResultSet rs) throws Exception {
        List<OpstaDomenskaKlasa> klijenti = new LinkedList<>();
        while(rs.next()){
            long id = rs.getLong("idKlijent");
            String ime = rs.getString("ime");
            String prezime = rs.getString("prezime");
            String email = rs.getString("email");
            String adresa = rs.getString("adresa");
            Date datumRodjenja = rs.getDate("datum_rodjenja");
            String brojTelefona = rs.getString("broj_telefona");
            String jmbg = rs.getString("jmbg");
            Klijent klijent = new Klijent(id, ime, prezime, jmbg, datumRodjenja, brojTelefona, email, adresa);
            
            klijenti.add(klijent);
        }
        return klijenti;
    }

    @Override
    public String vratiImenaKolona() {
        return " (idKlijent, ime, prezime, jmbg, datum_rodjenja, broj_telefona, email, adresa) ";
    }

    @Override
    public String vratiUslovZaSortiranje() {
        return " ORDER BY prezime ASC";
    }
    
    

}
