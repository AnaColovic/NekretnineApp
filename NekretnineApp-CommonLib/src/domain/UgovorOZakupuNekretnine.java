package domain;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class UgovorOZakupuNekretnine implements OpstaDomenskaKlasa {

    private Long idUgovoraOZakupu;
    private Date datumSklapanja;
    private String mestoSklapanja;
    private Date datumOd;
    private Date datumDo;
    private BigDecimal ukupnoZaUplatu;
    private NekretninaZaIzdavanje nekretnina;
    private Klijent klijent;
    private Agent agent;

    public UgovorOZakupuNekretnine() {
    }

    public UgovorOZakupuNekretnine(Long idUgovoraOZakupu, Date datumSklapanja, String mestoSklapanja, Date datumOd, Date datumDo, BigDecimal ukupnoZaUplatu, NekretninaZaIzdavanje nekretnina, Klijent klijent, Agent agent) {
        this.idUgovoraOZakupu = idUgovoraOZakupu;
        this.datumSklapanja = datumSklapanja;
        this.mestoSklapanja = mestoSklapanja;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.ukupnoZaUplatu = ukupnoZaUplatu;
        this.nekretnina = nekretnina;
        this.klijent = klijent;
        this.agent = agent;

    }

    /**
     * @return the idUgovoraOZakupu
     */
    public Long getIdUgovoraOZakupu() {
        return idUgovoraOZakupu;
    }

    /**
     * @param idUgovoraOZakupu the idUgovoraOZakupu to set
     */
    public void setIdUgovoraOZakupu(Long idUgovoraOZakupu) {
        this.idUgovoraOZakupu = idUgovoraOZakupu;
    }

    /**
     * @return the datumSklapanja
     */
    public Date getDatumSklapanja() {
        return datumSklapanja;
    }

    /**
     * @param datumSklapanja the datumSklapanja to set
     */
    public void setDatumSklapanja(Date datumSklapanja) {
        this.datumSklapanja = datumSklapanja;
    }

    /**
     * @return the mestoSklapanja
     */
    public String getMestoSklapanja() {
        return mestoSklapanja;
    }

    /**
     * @param mestoSklapanja the mestoSklapanja to set
     */
    public void setMestoSklapanja(String mestoSklapanja) {
        this.mestoSklapanja = mestoSklapanja;
    }

    /**
     * @return the datumOd
     */
    public Date getDatumOd() {
        return datumOd;
    }

    /**
     * @param datumOd the datumOd to set
     */
    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    /**
     * @return the datumDo
     */
    public Date getDatumDo() {
        return datumDo;
    }

    /**
     * @param datumDo the datumDo to set
     */
    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }

    /**
     * @return the ukupnoZaUplatu
     */
    public BigDecimal getUkupnoZaUplatu() {
        return ukupnoZaUplatu;
    }

    /**
     * @param ukupnoZaUplatu the ukupnoZaUplatu to set
     */
    public void setUkupnoZaUplatu(BigDecimal ukupnoZaUplatu) {
        this.ukupnoZaUplatu = ukupnoZaUplatu;
    }

    /**
     * @return the nekretnina
     */
    public NekretninaZaIzdavanje getNekretnina() {
        return nekretnina;
    }

    /**
     * @param nekretnina the nekretnina to set
     */
    public void setNekretnina(NekretninaZaIzdavanje nekretnina) {
        this.nekretnina = nekretnina;
    }

    /**
     * @return the klijent
     */
    public Klijent getKlijent() {
        return klijent;
    }

    /**
     * @param klijent the klijent to set
     */
    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    /**
     * @return the agent
     */
    public Agent getAgent() {
        return agent;
    }

    /**
     * @param agent the agent to set
     */
    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    @Override
    public String vratiVrednostiAtributa() {
        return idUgovoraOZakupu + ", '" + datumSklapanja + "', " + (mestoSklapanja == null ? null : "'" + mestoSklapanja + "'") + ", '" + datumOd + "', '" + datumDo + "', " + ukupnoZaUplatu + ", " + nekretnina.getIdNekretnina() + ", " + klijent.getIdKlijent() + ", " + agent.getIdAgenta();
    }

    @Override
    public String postaviVrednostiAtributa() {
        return "idUgovoraOZakupu=" + idUgovoraOZakupu + ", datum_sklapanja='" + datumSklapanja + "', mesto_sklapanja=" + (mestoSklapanja == null ? null : "'" + mestoSklapanja + "'") + ", datum_od='" + datumOd + "', datum_do='" + datumDo + "', ukupno_za_uplatu=" + ukupnoZaUplatu + ", id_nekretnina=" + nekretnina.getIdNekretnina() + ", id_klijent=" + klijent.getIdKlijent() + ", id_agent=" + agent.getIdAgenta();
    }

    @Override
    public String vratiImeKlase() {
        return "Ugovor_o_zakupu";
    }

    @Override
    public String vratiUslovZaNadjiSlog() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String vratiImeKolone(int kolona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpstaDomenskaKlasa napuni(ResultSet rs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public OpstaDomenskaKlasa postaviID(ResultSet rs) throws Exception {
        if (rs.next()) {
            idUgovoraOZakupu = rs.getLong(1);
        } else {
            throw new Exception("ID Ugovora o zakupu nije validan");
        }
        return this;
    }

    @Override
    public List<OpstaDomenskaKlasa> vratiListu(ResultSet rs) throws Exception {
        List<OpstaDomenskaKlasa> ugovori = new LinkedList<>();
        while (rs.next()) {
            long idUgovor = rs.getLong("u.idUgovoraOZakupu");
            Date datum_Sklapanja = rs.getDate("u.datum_sklapanja");
            String mesto_Sklapanja = rs.getString("u.mesto_sklapanja");
            Date datum_Od = rs.getDate("u.datum_od");
            Date datum_Do = rs.getDate("u.datum_do");
            BigDecimal ukupno_Za_Uplatu = rs.getBigDecimal("u.ukupno_za_uplatu");

            NekretninaZaIzdavanje nek = new NekretninaZaIzdavanje();
            nek.setIdNekretnina(rs.getLong("n.idNekretnina"));
            nek.setAdresa(rs.getString("n.adresa"));
            nek.setBrojSoba(rs.getInt("n.broj_soba"));
            nek.setIznosKirije(rs.getBigDecimal("n.iznos_kirije"));
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

            long id = rs.getLong("k.idKlijent");
            String ime = rs.getString("k.ime");
            String prezime = rs.getString("k.prezime");
            String email = rs.getString("k.email");
            String adresa = rs.getString("k.adresa");
            Date datumRodjenja = rs.getDate("k.datum_rodjenja");
            String brojTelefona = rs.getString("k.broj_telefona");
            String jmbg = rs.getString("k.jmbg");
            Klijent klijent = new Klijent(id, ime, prezime, jmbg, datumRodjenja, brojTelefona, email, adresa);

            String imeAgent = rs.getString("a.ime");
            String prezimeAgent = rs.getString("a.prezime");
            Agent agent = new Agent();
            agent.setIme(imeAgent);
            agent.setPrezime(prezimeAgent);

            UgovorOZakupuNekretnine ugovor = new UgovorOZakupuNekretnine(idUgovor, datum_Sklapanja, mesto_Sklapanja, datum_Od, datum_Do, ukupno_Za_Uplatu, nek, klijent, agent);

            ugovori.add(ugovor);
        }
        return ugovori;
    }

    @Override
    public String vratiImenaKolona() {
        return "(idUgovoraOZakupu, datum_sklapanja, mesto_sklapanja, datum_od, datum_do, ukupno_za_uplatu, id_nekretnina, id_klijent, id_agent)";
    }

    @Override
    public String vratiUslovZaSortiranje() {
        return "";
    }

    @Override
    public String vratiSpajanje() {
        return " u INNER JOIN Klijent k on u.id_klijent = k.idKlijent INNER JOIN Agent a on u.id_agent = a.idAgent INNER JOIN Nekretnina n on u.id_nekretnina = n.idNekretnina INNER JOIN Vlasnik v on n.vlasnik_id=v.idVlasnik INNER JOIN Grad g on n.grad_id=g.idGrad ";
    }

    @Override
    public String toString() {
        return "Datum od: " + datumOd + ", Datum do: " + datumDo + ", ID nek: " + nekretnina.getIdNekretnina();
    }

    @Override
    public String vratiUslovZaNadjiSlogove() {
        String uslov = "";
        if (nekretnina != null) {
            uslov += " WHERE g.idGrad=" + nekretnina.getGrad().getIdGrad();
        }
        if (datumOd != null) {
                uslov+=" AND '" + datumOd + "' BETWEEN u.datum_od AND u.datum_do";
                //uslov += " AND u.datum_od<='" + sdf.parse(d) + "' AND u.datum_do>='" + sdf.parse(d) + "'";
        }
        if (klijent != null) {
            if (klijent.getIme() != null) {
                uslov += " AND k.ime LIKE '" + klijent.getIme() + "%'";
            }
            if (klijent.getPrezime() != null) {
                uslov += " AND k.prezime LIKE '" + klijent.getPrezime() + "%'";
            }
        }
        return uslov;

    }
}
