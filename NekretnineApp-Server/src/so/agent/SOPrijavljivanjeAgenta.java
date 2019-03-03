/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so.agent;

import domain.Agent;
import domain.OpstaDomenskaKlasa;
import so.OpstaSistemskaOperacija;

/**
 *
 * @author Administrator
 */
public class SOPrijavljivanjeAgenta extends OpstaSistemskaOperacija {

    private Agent agent;

    @Override
    protected void validacija(Object obj) throws Exception {
        if (!(obj instanceof Agent)) {
            throw new Exception("Objekat nije validan");
        }
    }

    @Override
    protected void izvrsi(Object obj) throws Exception {
        agent = (Agent) brokerBaze.vratiJednu((OpstaDomenskaKlasa) obj);
    }

    /**
     * @return the agent
     */
    public Agent getAgent() {
        return agent;
    }

}
