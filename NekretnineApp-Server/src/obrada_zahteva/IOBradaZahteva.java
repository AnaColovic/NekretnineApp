/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obrada_zahteva;

import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public interface IOBradaZahteva {
    OdgovorServera izvrsi(Object podaci) throws Exception;
}
