/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladiste.baza.konekcija;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class KonekcijaBaza {

    private Connection konekcija;
    private static KonekcijaBaza instance;

    private KonekcijaBaza() throws SQLException {
        try {
            Properties props = new Properties();
            FileInputStream in = new FileInputStream("podesavanje_baze.properties");
            props.load(in);

            in.close();

            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");

            konekcija = DriverManager.getConnection(url, user, password);
            konekcija.setAutoCommit(false);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(KonekcijaBaza.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(KonekcijaBaza.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static KonekcijaBaza getInstance() throws SQLException {
        if (instance == null) {
            instance = new KonekcijaBaza();
        }
        return instance;
    }

    public Connection vratiKonekciju() {
        return konekcija;
    }

    public void pokreniTransakciju() throws SQLException {
        konekcija.setAutoCommit(false);
    }

    public void commit() throws SQLException {
        konekcija.commit();
    }

    public void rollback() throws SQLException {
        konekcija.rollback();
    }

}
