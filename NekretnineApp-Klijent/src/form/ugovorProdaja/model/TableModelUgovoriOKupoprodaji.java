/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.ugovorProdaja.model;

import domain.Nekretnina;
import domain.UgovorOKupoprodajiNekretnine;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class TableModelUgovoriOKupoprodaji extends AbstractTableModel {

    private List<UgovorOKupoprodajiNekretnine> ugovori;
    String[] kolone = new String[]{"ID Ugovora", "Datum sklapanja", "Mesto sklapanja", "Prodajna cena", "Klijent", "Adresa", "Tip", "Vlasnik", "Agent"};

    public TableModelUgovoriOKupoprodaji(List<UgovorOKupoprodajiNekretnine> ugovori) {
        this.ugovori = ugovori;
    }

    @Override
    public int getRowCount() {
        return getUgovori().size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UgovorOKupoprodajiNekretnine ugovor = getUgovori().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ugovor.getIdUgovoraOKupoprodaji();
            case 1:
                return ugovor.getDatumSklapanja();
            case 2:
                return ugovor.getMestoSklapanja();
            case 3:
                return ugovor.getProdajnaCena();
            case 4:
                return ugovor.getKlijent().getIme() + " " + ugovor.getKlijent().getPrezime();
            case 5:
                return ugovor.getNekretnina().getAdresa() + " ," + ugovor.getNekretnina().getGrad().getNazivGrada();
            case 6:
                return ugovor.getNekretnina().getTip();
            case 7:
                return ugovor.getNekretnina().getVlasnik().getIme() + " " + ugovor.getNekretnina().getVlasnik().getPrezime();
            case 8:
                return ugovor.getAgent().getIme() + " " + ugovor.getAgent().getPrezime();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    /**
     * @return the ugovori
     */
    public List<UgovorOKupoprodajiNekretnine> getUgovori() {
        return ugovori;
    }

    /**
     * @param ugovori the ugovori to set
     */
    public void setUgovori(List<UgovorOKupoprodajiNekretnine> ugovori) {
        this.ugovori = ugovori;

        fireTableDataChanged();
    }

    public void sortiraj(String po) {
        if (po.equals("Rastuce")) {
            ugovori.sort(Comparator.comparing(UgovorOKupoprodajiNekretnine::getProdajnaCena));
        } else {
            ugovori.sort(Comparator.comparing(UgovorOKupoprodajiNekretnine::getProdajnaCena).reversed());
        }

        fireTableDataChanged();
    }

}
