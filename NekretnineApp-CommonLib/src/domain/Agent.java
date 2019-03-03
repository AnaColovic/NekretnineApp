/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class Agent implements OpstaDomenskaKlasa {

    private Long idAgenta;
    private String ime;
    private String prezime;
    private String korisnickoIme;
    private String sifra;
    private String email;

    public Agent() {
    }

    public Agent(Long idAgenta, String ime, String prezime, String korisnickoIme, String sifra, String email) {
        this.idAgenta = idAgenta;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
        this.email = email;
    }

    /**
     * @return the idAgenta
     */
    public Long getIdAgenta() {
        return idAgenta;
    }

    /**
     * @param idAgenta the idAgenta to set
     */
    public void setIdAgenta(Long idAgenta) {
        this.idAgenta = idAgenta;
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
     * @return the korisnickoIme
     */
    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    /**
     * @param korisnickoIme the korisnickoIme to set
     */
    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    /**
     * @return the sifra
     */
    public String getSifra() {
        return sifra;
    }

    /**
     * @param sifra the sifra to set
     */
    public void setSifra(String sifra) {
        this.sifra = sifra;
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

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public String vratiImeKlase() {
        return "Agent";
    }

    @Override
    public String vratiVrednostiAtributa() {
        return idAgenta + ", " + (ime == null ? null : "'" + ime + "'") + ", " + (prezime == null ? null : "'" + prezime + "'") + ", " + (korisnickoIme == null ? null : "'" + korisnickoIme + "'") + ", " + (sifra == null ? null : "'" + sifra + "'") + ", " + (email == null ? null : "'" + email + "'");
    }

    @Override
    public String postaviVrednostiAtributa() {
        return "idAgent=" + idAgenta + ", ime=" + (ime == null ? null : "'" + ime + "'") + ", prezime=" + (prezime == null ? null : "'" + prezime + "'") + ", username=" + (korisnickoIme == null ? null : "'" + korisnickoIme + "'") + ", password=" + (sifra == null ? null : "'" + sifra + "'") + ", email=" + (email == null ? null : "'" + email + "'");
    }

    @Override
    public String vratiUslovZaNadjiSlogove() {
        return " WHERE username='" + korisnickoIme + "' AND password='" + sifra + "'";
    }

    @Override
    public String vratiUslovZaNadjiSlog() {
        return " WHERE username='" + korisnickoIme + "' AND password='" + sifra + "'";
    }

    @Override
    public String vratiImeKolone(int kolona) {
        String[] kolone = {"idAgent", "ime", "prezime", "username", "password", "email"};
        return kolone[kolona];
    }

    @Override
    public OpstaDomenskaKlasa napuni(ResultSet rs) throws Exception {
        if (rs.next()) {
            return new Agent(rs.getLong("idAgent"), rs.getString("ime"), rs.getString("prezime"), rs.getString("username"), rs.getString("password"), rs.getString("email"));
        } else {
            throw new Exception("Ne postoji korisnik sa unetim podacima");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agent other = (Agent) obj;
        if (!Objects.equals(this.idAgenta, other.idAgenta)) {
            return false;
        }
        return true;
    }

    @Override
    public OpstaDomenskaKlasa postaviID(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OpstaDomenskaKlasa> vratiListu(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiImenaKolona() {
        return " (idAgent, ime, prezime, username, password, email) ";
    }


    
    
    
}
