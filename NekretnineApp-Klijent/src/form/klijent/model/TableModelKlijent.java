/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.klijent.model;

import domain.Klijent;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class TableModelKlijent extends AbstractTableModel{
    private List<Klijent> klijenti;
    String[] kolone = new String[]{"ID Klijenta","Ime","Prezime","JMBG","Datum rodjenja","Broj telefona","Email","Adresa"};

    public TableModelKlijent(List<Klijent> klijenti) {
        this.klijenti = klijenti;
    }

    @Override
    public int getRowCount() {
        return getKlijenti().size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Klijent klijent = getKlijenti().get(rowIndex);
        switch(columnIndex){
            case 0: return klijent.getIdKlijent();
            case 1: return klijent.getIme();
            case 2: return klijent.getPrezime();
            case 3: return klijent.getJmbg();
            case 4: return klijent.getDatumRodjenja();
            case 5: return klijent.getBrTelefona();
            case 6: return klijent.getEmail();
            case 7: return klijent.getAdresa();
            default: return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    /**
     * @return the klijenti
     */
    public List<Klijent> getKlijenti() {
        return klijenti;
    }

    /**
     * @param klijenti the klijenti to set
     */
    public void setKlijenti(List<Klijent> klijenti) {
        this.klijenti = klijenti;
        
        fireTableDataChanged();
    }
    
    public void dodajKlijenta(Klijent k){
        klijenti.add(k);
        
        fireTableDataChanged();
    }
    
}
