/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.nekretnina.model;

import domain.NamenaNekretnine;
import domain.Nekretnina;
import domain.NekretninaZaIzdavanje;
import domain.NekretninaZaProdaju;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class TableModelNekretnina extends AbstractTableModel {

    private List<Nekretnina> nekretnine;
    String[] kolone = new String[]{"ID Nekretnine", "Grad", "Tip Nekretnine", "Broj soba", "Povrsina", "Sprat", "Adresa", "Status", "Iznos kirije", "Cena", "Uknjizen", "Vlasnik"};
    NamenaNekretnine namena;

    public TableModelNekretnina(List<Nekretnina> nekretnine, NamenaNekretnine namena) {
        this.nekretnine = nekretnine;
        this.namena = namena;
    }

    @Override
    public int getRowCount() {
        return getNekretnine().size();
    }

    @Override
    public int getColumnCount() {
        if (namena == NamenaNekretnine.ZA_IZDAVANJE) {
            return kolone.length - 2;
        } else {
            return kolone.length - 1;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Nekretnina nekretnina;
        if (namena == NamenaNekretnine.ZA_IZDAVANJE) {
            nekretnina = (NekretninaZaIzdavanje) getNekretnine().get(rowIndex);
        } else {
            nekretnina = (NekretninaZaProdaju) getNekretnine().get(rowIndex);
        }
        switch (columnIndex) {
            case 0:
                return nekretnina.getIdNekretnina();
            case 1:
                return nekretnina.getGrad();
            case 2:
                return nekretnina.getTip().toString();
            case 3:
                return nekretnina.getBrojSoba();
            case 4:
                return nekretnina.getPovrsina();
            case 5:
                return nekretnina.getSprat();
            case 6:
                return nekretnina.getAdresa();
            case 7:
                return nekretnina.getStatus();
            case 8:
                if (nekretnina instanceof NekretninaZaIzdavanje) {
                    return ((NekretninaZaIzdavanje) nekretnina).getIznosKirije();
                } else {
                    return ((NekretninaZaProdaju) nekretnina).getCena();
                }
            case 9:
                if (nekretnina instanceof NekretninaZaProdaju) {
                    return ((NekretninaZaProdaju) nekretnina).isUknjizen();
                }
            case 10:
                return nekretnina.getVlasnik();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Nekretnine";
            case 1:
                return "Grad";
            case 2:
                return "Tip Nekretnine";
            case 3:
                return "Broj soba";
            case 4:
                return "Povrsina";
            case 5:
                return "Sprat";
            case 6:
                return "Adresa";
            case 7:
                return "Status";
            case 8:
                if (namena == NamenaNekretnine.ZA_IZDAVANJE) {
                    return "Iznos kirije";
                } else {
                    return "Cena";
                }
            case 9:
                if (namena == NamenaNekretnine.ZA_PRODAJU) {
                    return "Uknjizen";
                }
            case 10:
                return "Vlasnik";
            default:
                return "N/A";
        }
    }

    /**
     * @return the nekretnine
     */
    public List<Nekretnina> getNekretnine() {
        return nekretnine;
    }

    /**
     * @param nekretnine the nekretnine to set
     */
    public void setNekretnine(List<Nekretnina> nekretnine) {
        this.nekretnine = nekretnine;

        fireTableDataChanged();
    }

    public void sortiraj(String kriterijum, String po) {
        if (po.equals("Rastuce")) {
            switch (kriterijum) {
                case "Povrsini":
                    nekretnine.sort(Comparator.comparing(Nekretnina::getPovrsina));
                    break;
                case "Broju soba":
                    nekretnine.sort(Comparator.comparing(Nekretnina::getBrojSoba));
                    break;
            }
        } else {
            switch (kriterijum) {
                case "Povrsini":
                    nekretnine.sort(Comparator.comparing(Nekretnina::getPovrsina).reversed());
                    break;
                case "Broju soba":
                    nekretnine.sort(Comparator.comparing(Nekretnina::getBrojSoba).reversed());
                    break;
            }
        }

        fireTableDataChanged();
    }
}
