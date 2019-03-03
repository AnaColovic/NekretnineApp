/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.io.Serializable;
import operacija.StatusOperacije;

/**
 *
 * @author Administrator
 */
public class OdgovorServera implements Serializable{
    private Object podaci;
    private Object greska;
    private StatusOperacije status;


    public OdgovorServera() {
    }

    public OdgovorServera(Object podaci, Object greska, StatusOperacije status) {
        this.podaci = podaci;
        this.greska = greska;
        this.status = status;
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
     * @return the greska
     */
    public Object getGreska() {
        return greska;
    }

    /**
     * @param greska the greska to set
     */
    public void setGreska(Object greska) {
        this.greska = greska;
    }

    /**
     * @return the status
     */
    public StatusOperacije getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusOperacije status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Odgovor: {Podaci: " + podaci + ", Greska: " + greska + " Status: " + status; 
    }
    
    
    
    
    
}
