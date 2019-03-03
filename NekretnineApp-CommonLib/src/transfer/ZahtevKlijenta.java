/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class ZahtevKlijenta implements Serializable{
    private Object podaci;
    private int operacija;

    public ZahtevKlijenta() {
    }

    public ZahtevKlijenta(Object podaci, int operacija) {
        this.podaci = podaci;
        this.operacija = operacija;
    }

    /**
     * @return the podaci
     */
    public Object getPodaci() {
        return podaci;
    }

    /**
     * @param podaci the podaci to set
     */
    public void setPodaci(Object podaci) {
        this.podaci = podaci;
    }

    /**
     * @return the operacija
     */
    public int getOperacija() {
        return operacija;
    }

    /**
     * @param operacija the operacija to set
     */
    public void setOperacija(int operacija) {
        this.operacija = operacija;
    }

    @Override
    public String toString() {
        return "Zahtev: Podaci: " + podaci + " ,Operacija: " + operacija;
    }
    
    
    
}
