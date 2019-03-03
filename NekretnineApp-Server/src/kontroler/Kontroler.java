/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domain.Agent;
import domain.Grad;
import domain.Klijent;
import domain.Nekretnina;
import domain.OpstaDomenskaKlasa;
import domain.UgovorOKupoprodajiNekretnine;
import domain.UgovorOZakupuNekretnine;
import domain.Vlasnik;
import form.FrmMain;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import niti.KlijentskaNit;
import operacija.StatusOperacije;
import skladiste.baza.BrokerBaze;
import skladiste.baza.IBrokerBaze;
import so.OpstaSistemskaOperacija;
import so.agent.SOPrijavljivanjeAgenta;
import so.grad.SOVratiSveGradove;
import so.klijent.SOIzmeniKlijenta;
import so.klijent.SOPretraziKlijente;
import so.klijent.SOUnesiKlijenta;
import so.klijent.SOVratiSveKlijente;
import so.nekretnina.SOIzmeniNekretninu;
import so.nekretnina.SOPretraziNekretnine;
import so.vlasnik.SOIzmeniVlasnika;
import so.nekretnina.SOUnesiNekretninu;
import so.nekretnina.SOVratiNekretninu;
import so.ugovor_o_kupoprodaji.SOPretraziUgovoreOKupoprodaji;
import so.ugovor_o_kupoprodaji.SOUnesiUgovorOKupoprodaji;
import so.ugovor_o_zakupu.SOPretraziUgovoreOZakupu;
import so.ugovor_o_zakupu.SOUnesiUgovorOZakupuNekretnine;
import so.vlasnik.SOPretraziVlasnike;
import so.vlasnik.SOUnesiVlasnika;
import so.vlasnik.SOVratiSveVlasnike;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class Kontroler {
    private static Kontroler instance;
    private List<KlijentskaNit> prijavljeniAgenti;
    private FrmMain forma;
    IBrokerBaze brokerBaze;
    
    public static Kontroler getInstance(){
        if(instance == null) instance = new Kontroler();
        return instance;
    }
    
    private Kontroler(){
        prijavljeniAgenti = new LinkedList<>();
        brokerBaze = new BrokerBaze();
    }

    /**
     * @return the prijavljeniAgenti
     */
    public List<KlijentskaNit> getPrijavljeniAgenti() {
        return prijavljeniAgenti;
    }

    /**
     * @return the forma
     */
    public FrmMain getForma() {
        return forma;
    }

    /**
     * @param forma the forma to set
     */
    public void setForma(FrmMain forma) {
        this.forma = forma;
    }
    
    public OpstaDomenskaKlasa logIn(Agent agent) throws Exception{
        OpstaSistemskaOperacija oso = new SOPrijavljivanjeAgenta();
        oso.opsteIzvrsenje(agent);
        return ((SOPrijavljivanjeAgenta)oso).getAgent();
    }
    
    public OpstaDomenskaKlasa unesiVlasnika(Vlasnik vlasnik) throws Exception{
        OpstaSistemskaOperacija oso = new SOUnesiVlasnika();
        oso.opsteIzvrsenje(vlasnik);
        return ((SOUnesiVlasnika)oso).getVlasnik();
    }
    
//    public void dodajPrijavljenogAgenta(KlijentskaNit nitA){
//        prijavljeniAgenti.add(nitA);
//    }
    
    public void odjaviKorisnika(KlijentskaNit nitA){
        nitA.zaustavi();
        prijavljeniAgenti.remove(nitA);
        System.out.println("OBRISAN AGENT");
    }

    public List<OpstaDomenskaKlasa> vratiSveVlasnike() throws Exception {
        OpstaSistemskaOperacija oso = new SOVratiSveVlasnike();
        oso.opsteIzvrsenje(new Vlasnik());
        return ((SOVratiSveVlasnike)oso).getVlasnici();
    }
    
    public List<OpstaDomenskaKlasa> vratiSveGradove()throws Exception{
        OpstaSistemskaOperacija oso = new SOVratiSveGradove();
        oso.opsteIzvrsenje(new Grad());
        return ((SOVratiSveGradove)oso).getGradovi();
    }

    public Vlasnik izmeniVlasnika(Vlasnik v) throws Exception {
        OpstaSistemskaOperacija oso = new SOIzmeniVlasnika();
        oso.opsteIzvrsenje(v);
        
        return v;
    }
    
    public Nekretnina unesiNekretninu(Nekretnina nekretnina) throws Exception{
        OpstaSistemskaOperacija oso = new SOUnesiNekretninu();
        oso.opsteIzvrsenje(nekretnina);
        return ((SOUnesiNekretninu)oso).getNekretnina();
    }
    
    public Nekretnina izmeniNekretninu(Nekretnina nekretnina)throws Exception{
        OpstaSistemskaOperacija oso = new SOIzmeniNekretninu();
        oso.opsteIzvrsenje(nekretnina);
        return nekretnina;
    }
    
    public Klijent unesiKlijenta(Klijent klijent) throws Exception{
        OpstaSistemskaOperacija oso = new SOUnesiKlijenta();
        oso.opsteIzvrsenje(klijent);
        
        return ((SOUnesiKlijenta)oso).getKlijent();
    }

    public List<OpstaDomenskaKlasa> pretraziNekretnine(Nekretnina nek) throws Exception {
        OpstaSistemskaOperacija oso = new SOPretraziNekretnine();
        oso.opsteIzvrsenje(nek);
        
        return ((SOPretraziNekretnine)oso).getNekretnine();
    }
    
    public Nekretnina vratiNekretninu(Nekretnina n) throws Exception{
        OpstaSistemskaOperacija oso = new SOVratiNekretninu();
        oso.opsteIzvrsenje(n);
        
        return ((SOVratiNekretninu)oso).getNekretnina();
    }
    
    public List<OpstaDomenskaKlasa> pretraziKlijente(Klijent klijent) throws Exception{
        OpstaSistemskaOperacija oso = new SOPretraziKlijente();
        oso.opsteIzvrsenje(klijent);
        
        return ((SOPretraziKlijente)oso).getKlijenti();
    }
    
    public Klijent izmeniKlijenta(Klijent klijent) throws Exception{
        OpstaSistemskaOperacija oso = new SOIzmeniKlijenta();
        oso.opsteIzvrsenje(klijent);
        
        return klijent;
    }
    
    public UgovorOZakupuNekretnine unesiUgovorOZakupu(UgovorOZakupuNekretnine ugovor)throws Exception{
        OpstaSistemskaOperacija oso = new SOUnesiUgovorOZakupuNekretnine();
        oso.opsteIzvrsenje(ugovor);
        
        return ((SOUnesiUgovorOZakupuNekretnine)oso).getUgovor();
    }
    
    public UgovorOKupoprodajiNekretnine unesiUgovorOKupoprodaji(UgovorOKupoprodajiNekretnine ugovor)throws Exception{
        OpstaSistemskaOperacija oso = new SOUnesiUgovorOKupoprodaji();
        oso.opsteIzvrsenje(ugovor);
        
        return ((SOUnesiUgovorOKupoprodaji)oso).getUgovor();
    }
    
    public List<OpstaDomenskaKlasa> pretraziUgovoreOKupoprodaji(UgovorOKupoprodajiNekretnine ugovor)throws Exception{
        OpstaSistemskaOperacija oso = new SOPretraziUgovoreOKupoprodaji();
        oso.opsteIzvrsenje(ugovor);
        
        return ((SOPretraziUgovoreOKupoprodaji)oso).getUgovori();
    }
    
    public List<OpstaDomenskaKlasa> pretraziUgovoreOZakupu(UgovorOZakupuNekretnine ugovor)throws Exception{
        OpstaSistemskaOperacija oso = new SOPretraziUgovoreOZakupu();
        oso.opsteIzvrsenje(ugovor);
        
        return ((SOPretraziUgovoreOZakupu)oso).getUgovori();
    } 
    
    public List<OpstaDomenskaKlasa> pretraziVlasnike(Vlasnik vlasnik) throws Exception{
        OpstaSistemskaOperacija oso = new SOPretraziVlasnike();
        oso.opsteIzvrsenje(vlasnik);
        
        return ((SOPretraziVlasnike)oso).getVlasnici();
    }
    
    public List<OpstaDomenskaKlasa> vratiSveKlijente()throws Exception{
        OpstaSistemskaOperacija oso = new SOVratiSveKlijente();
        oso.opsteIzvrsenje(new Klijent());
        
        return ((SOVratiSveKlijente)oso).getKlijenti();
                
    }

    public void ugasiNiti() {
        for(KlijentskaNit nit : prijavljeniAgenti){
            nit.zaustavi();
        }
    }
    
}
