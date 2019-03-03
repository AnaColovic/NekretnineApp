/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrator
 */
public abstract class Nekretnina implements OpstaDomenskaKlasa{
    protected Long idNekretnina;
    protected TipNekretnine tip;
    protected double brojSoba;
    protected double povrsina;
    protected String adresa;
    protected int sprat;
    protected String opis;
    protected Vlasnik vlasnik;
    protected Grad grad;
    protected StatusNekretnine status;

    public Nekretnina() {
        brojSoba = 0;
        povrsina = 0;
        sprat = 0;
        status = StatusNekretnine.U_PONUDI;
    }

    public Nekretnina(Long idNekretnina, TipNekretnine tip, double brojSoba, double povrsina, String adresa, int sprat, String opis, Vlasnik vlasnik, Grad grad, StatusNekretnine status) {
        this.idNekretnina = idNekretnina;
        this.tip = tip;
        this.brojSoba = brojSoba;
        this.povrsina = povrsina;
        this.adresa = adresa;
        this.sprat = sprat;
        this.opis = opis;
        this.vlasnik = vlasnik;
        this.grad = grad;
        this.status = status;
    }

    /**
     * @return the idNekretnina
     */
    public Long getIdNekretnina() {
        return idNekretnina;
    }

    /**
     * @param idNekretnina the idNekretnina to set
     */
    public void setIdNekretnina(Long idNekretnina) {
        this.idNekretnina = idNekretnina;
    }

    /**
     * @return the tip
     */
    public TipNekretnine getTip() {
        return tip;
    }

    /**
     * @param tip the tip to set
     */
    public void setTip(TipNekretnine tip) {
        this.tip = tip;
    }

    /**
     * @return the brojSoba
     */
    public double getBrojSoba() {
        return brojSoba;
    }

    /**
     * @param brojSoba the brojSoba to set
     */
    public void setBrojSoba(double brojSoba) {
        this.brojSoba = brojSoba;
    }

    /**
     * @return the povrsina
     */
    public double getPovrsina() {
        return povrsina;
    }

    /**
     * @param povrsina the povrsina to set
     */
    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
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

    /**
     * @return the sprat
     */
    public int getSprat() {
        return sprat;
    }

    /**
     * @param sprat the sprat to set
     */
    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    /**
     * @return the opis
     */
    public String getOpis() {
        return opis;
    }

    /**
     * @param opis the opis to set
     */
    public void setOpis(String opis) {
        this.opis = opis;
    }

    /**
     * @return the vlasnik
     */
    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    /**
     * @param vlasnik the vlasnik to set
     */
    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    /**
     * @return the grad
     */
    public Grad getGrad() {
        return grad;
    }

    /**
     * @param grad the grad to set
     */
    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    
    @Override
    public String vratiImeKlase() {
        return "Nekretnina";
    }

    /**
     * @return the status
     */
    public StatusNekretnine getStatus() {
        return status;
    }
   

    /**
     * @param status the status to set
     */
    public void setStatus(StatusNekretnine status) {
        this.status = status;
    }

    @Override
    public String vratiSpajanje() {
        return " n INNER JOIN Vlasnik v on n.vlasnik_id=v.idVlasnik INNER JOIN Grad g on n.grad_id=g.idGrad ";
    }

    @Override
    public String vratiUslovZaNadjiSlog() {
        return " WHERE n.idNekretnina=" + idNekretnina;
    }

    @Override
    public String vratiUslovZaNadjiSlogSaSpajanjem() {
        return " WHERE idNekretnina=" + idNekretnina;
    }
    
    
    
    
}
