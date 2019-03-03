/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.model;

import domain.Agent;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class TableModelPrijavljeniKorisnici extends AbstractTableModel {

    private List<Agent> prijavljeniAgenti;
    String[] kolone = new String[]{"Ime", "Prezime", "Korisnicko ime", "Email"};

    public TableModelPrijavljeniKorisnici() {
        prijavljeniAgenti = new LinkedList<>();
    }

    @Override
    public int getRowCount() {
        return getPrijavljeniAgenti().size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Agent agent = getPrijavljeniAgenti().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return agent.getIme();
            case 1:
                return agent.getPrezime();
            case 2:
                return agent.getKorisnickoIme();
            case 3:
                return agent.getEmail();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public void dodajAgenta(Agent agent) {
        getPrijavljeniAgenti().add(agent);

        fireTableDataChanged();
    }

    public void obrisiAgenta(Agent agent) {
        getPrijavljeniAgenti().remove(agent);

        fireTableDataChanged();       
    }

    /**
     * @param prijavljeniAgenti the prijavljeniAgenti to set
     */
    public void setPrijavljeniAgenti(List<Agent> prijavljeniAgenti) {
        this.prijavljeniAgenti = prijavljeniAgenti;
         
}

    /**
     * @return the prijavljeniAgenti
     */
    public List<Agent> getPrijavljeniAgenti() {
        return prijavljeniAgenti;
    }
}
