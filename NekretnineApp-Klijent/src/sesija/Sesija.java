/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesija;

import domain.Agent;

/**
 *
 * @author Administrator
 */
public class Sesija {
    private static Sesija instance;
    private Agent prijavljeniAgent;

    private Sesija() {      
    }

    public static Sesija getInstance(){
        if(instance == null) instance = new Sesija();
        return instance;
    }

    /**
     * @return the prijavljeniAgent
     */
    public Agent getPrijavljeniAgent() {
        return prijavljeniAgent;
    }

    /**
     * @param prijavljeniAgent the prijavljeniAgent to set
     */
    public void setPrijavljeniAgent(Agent prijavljeniAgent) {
        this.prijavljeniAgent = prijavljeniAgent;
    }
    
    
}
