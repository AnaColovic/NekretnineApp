/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class PodesavanjeBaze {
     private static PodesavanjeBaze instance;
    private Properties props;
    private String putanja;

    private PodesavanjeBaze() {
        try {
            props = new Properties();
            putanja = "podesavanje_baze.properties";
            props.load(new FileInputStream(putanja));
        } catch (Exception ex) {
            Logger.getLogger(PodesavanjeKonekcije.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static PodesavanjeBaze getInstance() {
        if (instance == null) {
            instance = new PodesavanjeBaze();
        }
        return instance;
    }

    public String getProperty(String key) {
        return props.getProperty(key, "n/a");
    }
    
    public void setProperty(String key, String value) throws Exception{
        props.setProperty(key, value + "");
        props.store(new FileOutputStream(new File(putanja)), null);
    }
}
