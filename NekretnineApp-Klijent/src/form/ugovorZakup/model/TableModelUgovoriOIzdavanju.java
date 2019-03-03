/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.ugovorZakup.model;

import form.ugovorProdaja.model.*;
import domain.Nekretnina;
import domain.UgovorOKupoprodajiNekretnine;
import domain.UgovorOZakupuNekretnine;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class TableModelUgovoriOIzdavanju extends AbstractTableModel {

    private List<UgovorOZakupuNekretnine> ugovori;
    String[] kolone = new String[]{"ID Ugovora", "Datum sklapanja", "Mesto sklapanja", "Datum od", "Datum do", "Klijent", "Adresa", "Tip", "Vlasnik", "Agent"};

    public TableModelUgovoriOIzdavanju(List<UgovorOZakupuNekretnine> ugovori) {
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
        UgovorOZakupuNekretnine ugovor = getUgovori().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return ugovor.getIdUgovoraOZakupu();
            case 1:
                return ugovor.getDatumSklapanja();
            case 2:
                return ugovor.getMestoSklapanja();
            case 3:
                return ugovor.getDatumOd();
            case 4:
                return ugovor.getDatumDo();
            case 5:
                return ugovor.getKlijent().getIme() + " " + ugovor.getKlijent().getPrezime();
            case 6:
                return ugovor.getNekretnina().getAdresa() + " ," + ugovor.getNekretnina().getGrad().getNazivGrada();
            case 7:
                return ugovor.getNekretnina().getTip();
            case 8:
                return ugovor.getNekretnina().getVlasnik().getIme() + " " + ugovor.getNekretnina().getVlasnik().getPrezime();
            case 9:
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
    public List<UgovorOZakupuNekretnine> getUgovori() {
        return ugovori;
    }

    /**
     * @param ugovori the ugovori to set
     */
    public void setUgovori(List<UgovorOZakupuNekretnine> ugovori) {
        this.ugovori = ugovori;

        fireTableDataChanged();
    }

}
