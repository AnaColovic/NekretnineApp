/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class UgovorOKupoprodajiNekretnine implements OpstaDomenskaKlasa {

    private Long idUgovoraOKupoprodaji;
    private Date datumSklapanja;
    private String mestoSklapanja;
    private Date datumIsplate;
    private BigDecimal prodajnaCena;
    private String nacinPlacanja;
    private NekretninaZaProdaju nekretnina;
    private Klijent klijent;
    private Agent agent;

    public UgovorOKupoprodajiNekretnine() {
        prodajnaCena = new BigDecimal(0);
    }

    public UgovorOKupoprodajiNekretnine(Long idUgovoraOKupoprodaji, Date datumSklapanja, String mestoSklapanja, Date datumIsplate, BigDecimal prodajnaCena, String nacinPlacanja, NekretninaZaProdaju nekretnina, Klijent klijent, Agent agent) {
        this.idUgovoraOKupoprodaji = idUgovoraOKupoprodaji;
        this.datumSklapanja = datumSklapanja;
        this.mestoSklapanja = mestoSklapanja;
        this.datumIsplate = datumIsplate;
        this.prodajnaCena = prodajnaCena;
        this.nacinPlacanja = nacinPlacanja;
        this.nekretnina = nekretnina;
        this.klijent = klijent;
        this.agent = agent;
    }

    /**
     * @return the idUgovoraOKupoprodaji
     */
    public Long getIdUgovoraOKupoprodaji() {
        return idUgovoraOKupoprodaji;
    }

    /**
     * @param idUgovoraOKupoprodaji the idUgovoraOKupoprodaji to set
     */
    public void setIdUgovoraOKupoprodaji(Long idUgovoraOKupoprodaji) {
        this.idUgovoraOKupoprodaji = idUgovoraOKupoprodaji;
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
     * @return the datumIsplate
     */
    public Date getDatumIsplate() {
        return datumIsplate;
    }

    /**
     * @param datumIsplate the datumIsplate to set
     */
    public void setDatumIsplate(Date datumIsplate) {
        this.datumIsplate = datumIsplate;
    }

    /**
     * @return the prodajnaCena
     */
    public BigDecimal getProdajnaCena() {
        return prodajnaCena;
    }

    /**
     * @param prodajnaCena the prodajnaCena to set
     */
    public void setProdajnaCena(BigDecimal prodajnaCena) {
        this.prodajnaCena = prodajnaCena;
    }

    /**
     * @return the nacinPlacanja
     */
    public String getNacinPlacanja() {
        return nacinPlacanja;
    }

    /**
     * @param nacinPlacanja the nacinPlacanja to set
     */
    public void setNacinPlacanja(String nacinPlacanja) {
        this.nacinPlacanja = nacinPlacanja;
    }

    /**
     * @return the nekretnina
     */
    public NekretninaZaProdaju getNekretnina() {
        return nekretnina;
    }

    /**
     * @param nekretnina the nekretnina to set
     */
    public void setNekretnina(NekretninaZaProdaju nekretnina) {
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
        return idUgovoraOKupoprodaji + ", '" + datumSklapanja + "', " + (mestoSklapanja == null ? null : "'" + mestoSklapanja + "'") + ", '" + datumIsplate + "', " + prodajnaCena + ", " + (nacinPlacanja == null ? null : "'" + nacinPlacanja + "'") + ", " + nekretnina.getIdNekretnina() + ", " + klijent.getIdKlijent() + ", " + agent.getIdAgenta();
    }

    @Override
    public String postaviVrednostiAtributa() {
        return "idUgovorOKupoprodaji=" + idUgovoraOKupoprodaji + ", datum_sklapanja='" + datumSklapanja + "', mesto_sklapanja=" + (mestoSklapanja == null ? null : "'" + mestoSklapanja + "'") + ", datum_isplate='" + datumIsplate + "', prodajna_cena=" + prodajnaCena + ", nacin_placanja=" + (nacinPlacanja == null ? null : "'" + nacinPlacanja + "'") + ", id_nekretnina=" + nekretnina.getIdNekretnina() + ", id_klijent=" + klijent.getIdKlijent() + ", id_agent=" + agent.getIdAgenta();
    }

    @Override
    public String vratiImeKlase() {
        return "ugovor_o_kupoprodaji";
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
            idUgovoraOKupoprodaji = rs.getLong(1);
        } else {
            throw new Exception("ID Ugovora o zakupu nije validan");
        }
        return this;
    }

    @Override
    public List<OpstaDomenskaKlasa> vratiListu(ResultSet rs) throws Exception {
        List<OpstaDomenskaKlasa> ugovori = new LinkedList<>();
        while (rs.next()) {
            long idUgovor = rs.getLong("u.idUgovorOKupoprodaji");
            Date datum_Sklapanja = rs.getDate("u.datum_sklapanja");
            String mesto_Sklapanja = rs.getString("u.mesto_sklapanja");
            Date datum_isplate = rs.getDate("u.datum_isplate");
            BigDecimal prodajna_cena = rs.getBigDecimal("u.prodajna_cena");
            String nacin_placanja = rs.getString("u.nacin_placanja");

            NekretninaZaProdaju nek = new NekretninaZaProdaju();
            nek.setIdNekretnina(rs.getLong("n.idNekretnina"));
            nek.setAdresa(rs.getString("n.adresa"));
            nek.setBrojSoba(rs.getInt("n.broj_soba"));
            nek.setCena(rs.getBigDecimal("n.cena"));
            nek.setOpis(rs.getString("n.opis"));
            nek.setPovrsina(rs.getInt("n.povrsina"));
            nek.setSprat(rs.getInt("n.sprat"));
            nek.setTip(TipNekretnine.valueOf(rs.getString("n.tip")));
            nek.setStatus(StatusNekretnine.valueOf(rs.getString("n.status")));
            nek.setUknjizen(rs.getBoolean("n.uknjizen"));
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

            UgovorOKupoprodajiNekretnine ugovor = new UgovorOKupoprodajiNekretnine(idUgovor, datum_Sklapanja, mesto_Sklapanja, datum_isplate, prodajna_cena, nacin_placanja, nek, klijent, agent);

            ugovori.add(ugovor);
        }
        return ugovori;
    }

    @Override
    public String vratiImenaKolona() {
        return "(idUgovorOKupoprodaji, datum_sklapanja, mesto_sklapanja, datum_isplate, prodajna_cena, nacin_placanja, id_nekretnina, id_klijent, id_agent)";
    }

    @Override
    public String vratiUslovZaSortiranje() {
        return " ORDER BY prodajna_cena ASC";
    }

    @Override
    public String vratiSpajanje() {
        return " u INNER JOIN Klijent k on u.id_klijent = k.idKlijent INNER JOIN Agent a on u.id_agent = a.idAgent INNER JOIN Nekretnina n on u.id_nekretnina = n.idNekretnina INNER JOIN Vlasnik v on n.vlasnik_id=v.idVlasnik INNER JOIN Grad g on n.grad_id=g.idGrad ";

    }

    @Override
    public String vratiUslovZaNadjiSlogove() {
        String uslov = "";
        if (nekretnina != null) {
            uslov += " WHERE g.idGrad=" + nekretnina.getGrad().getIdGrad();
            if (!prodajnaCena.equals(new BigDecimal(0))) {
                uslov += " AND u.prodajna_cena<=" + prodajnaCena;
            }
        }
        if (klijent != null) {
                if (klijent.getIme()!=null) {
                    uslov += " AND k.ime LIKE '" + klijent.getIme() + "%'";
                }
                if (klijent.getPrezime()!=null) {
                    uslov += " AND k.prezime LIKE '" + klijent.getPrezime() + "%'";
                }
            }

        return uslov;

    }

}
