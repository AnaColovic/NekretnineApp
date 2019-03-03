/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class NekretninaZaProdaju extends Nekretnina {

    private boolean uknjizen;
    private BigDecimal cena;

    public NekretninaZaProdaju() {
        super();
        uknjizen = false;
        cena = new BigDecimal(0);
    }

    public NekretninaZaProdaju(boolean uknjizen, BigDecimal cena, Long idNekretnina, TipNekretnine tip, double brojSoba, double povrsina, String adresa, int sprat, String opis, Vlasnik vlasnik, Grad grad, StatusNekretnine status) {
        super(idNekretnina, tip, brojSoba, povrsina, adresa, sprat, opis, vlasnik, grad, status);
        this.uknjizen = uknjizen;
        this.cena = cena;
    }

    /**
     * @return the uknjizen
     */
    public boolean isUknjizen() {
        return uknjizen;
    }

    /**
     * @param uknjizen the uknjizen to set
     */
    public void setUknjizen(boolean uknjizen) {
        this.uknjizen = uknjizen;
    }

    /**
     * @return the cena
     */
    public BigDecimal getCena() {
        return cena;
    }

    /**
     * @param cena the cena to set
     */
    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    @Override
    public String vratiVrednostiAtributa() {
        return idNekretnina + ", " + (tip == null ? null : "'" + tip + "'") + ", " + brojSoba + ", " + povrsina + ", " + (adresa == null ? null : "'" + adresa + "'") + ", " + sprat + ", " + (opis == null ? null : "'" + opis + "'") + ", " + vlasnik.getIdVlasnik() + ", " + grad.getIdGrad() + ", " + uknjizen + ", " + cena + ", 'ZA_PRODAJU', '" + status + "'";

    }

    @Override
    public String postaviVrednostiAtributa() {
        return "idNekretnina=" + idNekretnina + ", tip=" + (tip == null ? null : "'" + tip + "'") + ", broj_soba=" + brojSoba + ", povrsina=" + povrsina + ", adresa=" + (adresa == null ? null : "'" + adresa + "'") + ", sprat=" + sprat + ", opis=" + (opis == null ? null : "'" + opis + "'") + ", vlasnik_id=" + vlasnik.getIdVlasnik() + ", grad_id=" + grad.getIdGrad() + ", uknjizen=" + uknjizen + ", cena=" + cena + ", namena='ZA_PRODAJU', status='" + status + "'";

    }

    @Override
    public String vratiUslovZaNadjiSlogove() {
        if (vlasnik != null) {
            return "WHERE n.namena = 'ZA_PRODAJU' AND v.idVlasnik = " + vlasnik.getIdVlasnik();
        }
        if (grad == null) {
            return " WHERE n.namena='ZA_PRODAJU' AND n.status='" + StatusNekretnine.U_PONUDI.toString() + "'";
        }
        return " WHERE n.grad_id=" + grad.getIdGrad() + " AND n.tip='" + tip + "' AND n.namena='ZA_PRODAJU' AND n.status='" + StatusNekretnine.U_PONUDI.toString() + "'";

    }

    @Override
    public String vratiImeKolone(int kolona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpstaDomenskaKlasa napuni(ResultSet rs) throws Exception {
        NekretninaZaProdaju nek = new NekretninaZaProdaju();

        if (rs.next()) {
            nek.setIdNekretnina(rs.getLong("n.idNekretnina"));
            nek.setAdresa(rs.getString("n.adresa"));
            nek.setBrojSoba(rs.getInt("n.broj_soba"));
            nek.setCena(rs.getBigDecimal("n.cena"));
            nek.setUknjizen(rs.getBoolean("n.uknjizen"));
            nek.setOpis(rs.getString("n.opis"));
            nek.setPovrsina(rs.getInt("n.povrsina"));
            nek.setSprat(rs.getInt("n.sprat"));
            nek.setTip(TipNekretnine.valueOf(rs.getString("n.tip")));
            nek.setStatus(StatusNekretnine.valueOf(rs.getString("n.status")));
            Grad grad = new Grad();
            grad.setIdGrad(rs.getLong("g.idGrad"));
            grad.setNazivGrada(rs.getString("g.naziv"));
            nek.setGrad(grad);
            Vlasnik vlasnik = new Vlasnik();
            vlasnik.setBrTelefona(rs.getString("v.broj_telefona"));
            vlasnik.setDatumRodjenja(rs.getDate("v.datum_rodjenja"));
            vlasnik.setIdVlasnik(rs.getLong("v.idVlasnik"));
            vlasnik.setIme(rs.getString("v.ime"));
            vlasnik.setPrezime(rs.getString("v.prezime"));
            nek.setVlasnik(vlasnik);

        } else {
            throw new Exception("Sistem ne moze da pronadje podatke o nekretnini");
        }
        return nek;
    }

    @Override
    public OpstaDomenskaKlasa postaviID(ResultSet rs) throws Exception {
        if (rs.next()) {
            idNekretnina = rs.getLong(1);
        } else {
            throw new Exception("IDNekretnina nije validan");
        }
        return this;
    }

    @Override
    public List<OpstaDomenskaKlasa> vratiListu(ResultSet rs) throws Exception {
        List<OpstaDomenskaKlasa> nekretnine = new LinkedList<>();
        while (rs.next()) {
            NekretninaZaProdaju nek = new NekretninaZaProdaju();
            nek.setIdNekretnina(rs.getLong("n.idNekretnina"));
            nek.setAdresa(rs.getString("n.adresa"));
            nek.setBrojSoba(rs.getInt("n.broj_soba"));
            nek.setCena(rs.getBigDecimal("n.cena"));
            nek.setUknjizen(rs.getBoolean("n.uknjizen"));
            nek.setOpis(rs.getString("n.opis"));
            nek.setPovrsina(rs.getInt("n.povrsina"));
            nek.setSprat(rs.getInt("n.sprat"));
            nek.setTip(TipNekretnine.valueOf(rs.getString("n.tip")));
            nek.setStatus(StatusNekretnine.valueOf(rs.getString("n.status")));
            Grad grad = new Grad();
            grad.setIdGrad(rs.getLong("g.idGrad"));
            grad.setNazivGrada(rs.getString("g.naziv"));
            nek.setGrad(grad);
            Vlasnik vlasnik = new Vlasnik();
            vlasnik.setBrTelefona(rs.getString("v.broj_telefona"));
            vlasnik.setDatumRodjenja(rs.getDate("v.datum_rodjenja"));
            vlasnik.setIdVlasnik(rs.getLong("v.idVlasnik"));
            vlasnik.setIme(rs.getString("v.ime"));
            vlasnik.setPrezime(rs.getString("v.prezime"));
            nek.setVlasnik(vlasnik);

            nekretnine.add(nek);
        }
        return nekretnine;
    }

    @Override
    public String vratiImenaKolona() {
        return " (idNekretnina, tip, broj_soba, povrsina, adresa, sprat, opis, vlasnik_id, grad_id, uknjizen, cena, namena, status) ";

    }

    @Override
    public String vratiUslovZaSortiranje() {
        return " ORDER BY n.cena ASC";
    }

}
