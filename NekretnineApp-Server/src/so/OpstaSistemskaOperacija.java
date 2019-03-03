/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import skladiste.baza.BrokerBaze;
import skladiste.baza.IBrokerBaze;
import skladiste.baza.konekcija.KonekcijaBaza;

/**
 *
 * @author Administrator
 */
public abstract class OpstaSistemskaOperacija {

    protected IBrokerBaze brokerBaze;

    public OpstaSistemskaOperacija() {
        brokerBaze = new BrokerBaze();
    }

    public final void opsteIzvrsenje(Object obj) throws Exception {
        try {
            validacija(obj);
            try {
                pokreniTransakciju();
                izvrsi(obj);
                commit();
            } catch (Exception ex) {
                rollback();
                throw ex;
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    protected abstract void validacija(Object obj) throws Exception;

    private void pokreniTransakciju() throws Exception {
        KonekcijaBaza.getInstance().pokreniTransakciju();
    }

    protected abstract void izvrsi(Object obj) throws Exception;

    private void commit() throws Exception {
        KonekcijaBaza.getInstance().commit();
    }

    private void rollback() throws Exception {
        KonekcijaBaza.getInstance().rollback();
    }

}
