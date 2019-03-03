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
import domain.UgovorOKupoprodajiNekretnine;
import domain.UgovorOZakupuNekretnine;
import domain.Vlasnik;
import java.util.List;
import komunikacija.Komunikacija;
import operacija.Operacija;
import operacija.StatusOperacije;
import sesija.Sesija;
import transfer.OdgovorServera;
import transfer.ZahtevKlijenta;

/**
 *
 * @author Administrator
 */
public class Kontroler {

    private static Kontroler instance;

    public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    public void logIn(Agent agent) throws Exception {

        ZahtevKlijenta zahtev = new ZahtevKlijenta(agent, Operacija.OPERACIJA_PRIJAVLJIVANJE_AGENTA);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        if (odgovor.getStatus() == StatusOperacije.OK) {
            Sesija.getInstance().setPrijavljeniAgent((Agent) odgovor.getPodaci());
        } else {
            throw (Exception) odgovor.getGreska();
        }
    }

    public Vlasnik unosVlasnika(Vlasnik vlasnik) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(vlasnik, Operacija.OPERACIJA_UNESI_VLASNIKA);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        System.out.println("Odgovor sa klijentske strane: " + odgovor);
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (Vlasnik) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public List<Vlasnik> vratiSveVlasnike() throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(null, Operacija.OPERACIJA_VRATI_SVE_VLASNIKE);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        System.out.println("Odgovor: " + odgovor);
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (List<Vlasnik>) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public List<Grad> vratiSveGradove() throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(null, Operacija.OPERACIJA_VRATI_SVE_GRADOVE);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        System.out.println(odgovor);
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (List<Grad>) odgovor.getPodaci();
        }

        throw (Exception) odgovor.getGreska();
    }

    public Vlasnik izmenaVlasnika(Vlasnik vlasnik) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(vlasnik, Operacija.OPERACIJA_IZMENI_VLASNIKA);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        System.out.println("Odgovor sa klijentske strane: " + odgovor);
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (Vlasnik) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public Nekretnina unosNekretnine(Nekretnina nekretnina) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(nekretnina, Operacija.OPERACIJA_UNESI_NEKRETNINU);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        System.out.println("Odgovor sa klijentske strane: " + odgovor);
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (Nekretnina) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public Nekretnina izmenaNekretnine(Nekretnina nekretnina) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(nekretnina, Operacija.OPERACIJA_IZMENI_NEKRETNINU);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        System.out.println("Odgovor sa klijentske strane: " + odgovor);
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (Nekretnina) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public Klijent izmenaKlijenta(Klijent klijent) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(klijent, Operacija.OPERACIJA_IZMENI_KLIJENTA);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (Klijent) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public Klijent unosKlijenta(Klijent klijent) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(klijent, Operacija.OPERACIJA_UNESI_KLIJENTA);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        System.out.println("Odgovor sa klijentske strane: " + odgovor);
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (Klijent) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public List<Nekretnina> pretraziNekretnine(Nekretnina nekretnina) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(nekretnina, Operacija.OPERACIJA_PRETRAZI_NEKRETNINE);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        System.out.println("Odgovor sa klijentske strane: " + odgovor);
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (List<Nekretnina>) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public Nekretnina vratiNekretninu(Nekretnina nekretnina) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(nekretnina, Operacija.OPERACIJA_VRATI_NEKRETNINU);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (Nekretnina) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public List<Klijent> pretraziKlijente(Klijent klijent) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(klijent, Operacija.OPERACIJA_PRETRAZI_KLIJENTE);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (List<Klijent>) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public UgovorOZakupuNekretnine unesiUgovorOZakupu(UgovorOZakupuNekretnine ugovor) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(ugovor, Operacija.OPERACIJA_UNESI_UGOVOR_O_ZAKUPU);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (UgovorOZakupuNekretnine) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public UgovorOKupoprodajiNekretnine unesiUgovorOKupoprodaji(UgovorOKupoprodajiNekretnine ugovor) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(ugovor, Operacija.OPERACIJA_UNESI_UGOVOR_O_KUPOPRODAJI);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (UgovorOKupoprodajiNekretnine) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public List<UgovorOKupoprodajiNekretnine> pretraziUgovoreOKupoprodaji(UgovorOKupoprodajiNekretnine ugovor) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(ugovor, Operacija.OPERACIJA_PRETRAZI_UGOVORE_O_KUPOPRODAJI);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (List<UgovorOKupoprodajiNekretnine>) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public List<UgovorOZakupuNekretnine> pretraziUgovoreOZakupu(UgovorOZakupuNekretnine ugovor) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(ugovor, Operacija.OPERACIJA_PRETRAZI_UGOVORE_O_ZAKUPU);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (List<UgovorOZakupuNekretnine>) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }

    public List<Vlasnik> pretraziVlasnike(Vlasnik vlasnik) throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(vlasnik, Operacija.OPERACIJA_PRETRAZI_VLASNIKE);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (List<Vlasnik>) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }
    
    public String odjaviSe(Agent agent) throws Exception{
        ZahtevKlijenta zahtev = new ZahtevKlijenta(agent, Operacija.OPERACIJA_ODJAVI_SE);
        Komunikacija.getInstance().posaljiZahtev(zahtev);
        
        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        if(odgovor.getStatus() == StatusOperacije.OK){
            return (String) odgovor.getPodaci();
        }
        throw (Exception)odgovor.getGreska();
    }
    
    public List<Klijent> vratiSveKlijente() throws Exception {
        ZahtevKlijenta zahtev = new ZahtevKlijenta(null, Operacija.OPERACIJA_VRATI_SVE_KLIJENTE);
        Komunikacija.getInstance().posaljiZahtev(zahtev);

        OdgovorServera odgovor = Komunikacija.getInstance().primiOdgovor();
        System.out.println("Odgovor: " + odgovor);
        if (odgovor.getStatus() == StatusOperacije.OK) {
            return (List<Klijent>) odgovor.getPodaci();
        }
        throw (Exception) odgovor.getGreska();
    }
    
    public void gasenjeAplikacije(){
        ZahtevKlijenta zahtev = new ZahtevKlijenta(true, Operacija.OPERACIJA_ODJAVI_SE);
        System.out.println(zahtev);
        Komunikacija.getInstance().posaljiZahtev(zahtev);
    }
}
