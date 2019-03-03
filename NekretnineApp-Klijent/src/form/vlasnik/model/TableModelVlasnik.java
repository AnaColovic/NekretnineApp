/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.vlasnik.model;

import form.klijent.model.*;
import domain.Klijent;
import domain.Vlasnik;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class TableModelVlasnik extends AbstractTableModel {

    private List<Vlasnik> vlasnici;
    String[] kolone = new String[]{"ID Klijenta", "Ime", "Prezime", "Datum rodjenja", "Broj telefona"};

    public TableModelVlasnik(List<Vlasnik> vlasnici) {
        this.vlasnici = vlasnici;
    }

    @Override
    public int getRowCount() {
        return vlasnici.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vlasnik vlasnik = getVlasnici().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return vlasnik.getIdVlasnik();
            case 1:
                return vlasnik.getIme();
            case 2:
                return vlasnik.getPrezime();
            case 3:
                return vlasnik.getDatumRodjenja();
            case 4:
                return vlasnik.getBrTelefona();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    /**
     * @return the vlasnici
     */
    public List<Vlasnik> getVlasnici() {
        return vlasnici;
    }

    /**
     * @param vlasnici the vlasnici to set
     */
    public void setVlasnici(List<Vlasnik> vlasnici) {
        this.vlasnici = vlasnici;
        
        fireTableDataChanged();
    }
    
    

}
