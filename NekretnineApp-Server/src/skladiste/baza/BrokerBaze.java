/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skladiste.baza;

import domain.Agent;
import domain.OpstaDomenskaKlasa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.SpringLayout;
import skladiste.baza.konekcija.KonekcijaBaza;

/**
 *
 * @author Administrator
 */
public class BrokerBaze implements IBrokerBaze {

    @Override
    public OpstaDomenskaKlasa vratiJednu(OpstaDomenskaKlasa odk) throws Exception {
        Connection con = KonekcijaBaza.getInstance().vratiKonekciju();
        String upit = "SELECT * FROM " + odk.vratiImeKlase() + odk.vratiSpajanje() + odk.vratiUslovZaNadjiSlog();
        System.out.println(upit);
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(upit);
        odk = odk.napuni(rs);

        rs.close();
        s.close();

        return odk;
    }

    @Override
    public List<OpstaDomenskaKlasa> vratiSveSaUslovom(OpstaDomenskaKlasa odk) throws Exception {
        Connection con = KonekcijaBaza.getInstance().vratiKonekciju();
        String upit = "SELECT * FROM " + odk.vratiImeKlase() + odk.vratiSpajanje() + odk.vratiUslovZaNadjiSlogove() + odk.vratiUslovZaSortiranje();
        System.out.println(upit);
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(upit);

        List<OpstaDomenskaKlasa> lista = odk.vratiListu(rs);

        rs.close();
        s.close();

        return lista;
    }

    @Override
    public OpstaDomenskaKlasa unesi(OpstaDomenskaKlasa odk) throws Exception {
        try {
            Connection con = KonekcijaBaza.getInstance().vratiKonekciju();
            String upit = "INSERT INTO " + odk.vratiImeKlase() + odk.vratiImenaKolona() + " VALUES (" + odk.vratiVrednostiAtributa() + ")";
            System.out.println(upit);
            Statement s = con.createStatement();
            s.executeUpdate(upit, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = s.getGeneratedKeys();
            odk = odk.postaviID(rs);

            rs.close();
            s.close();

            return odk;
        } catch (SQLException ex) {
            throw new Exception("Objekat ne moze biti sacuvan");
        }
    }

    @Override
    public void izmeni(OpstaDomenskaKlasa odk) throws Exception {
        try {
            Connection con = KonekcijaBaza.getInstance().vratiKonekciju();
            String upit = "UPDATE " + odk.vratiImeKlase() + " SET " + odk.postaviVrednostiAtributa() + odk.vratiUslovZaNadjiSlogSaSpajanjem();
            Statement s = con.createStatement();
            s.executeUpdate(upit);

            s.close();
        } catch (SQLException ex) {
            throw new Exception("Objekat ne moze biti sacuvan");
        }
    }

    @Override
    public List<OpstaDomenskaKlasa> vratiSve(OpstaDomenskaKlasa odk) throws Exception {
        Connection con = KonekcijaBaza.getInstance().vratiKonekciju();
        String upit = "SELECT * FROM " + odk.vratiImeKlase() + odk.vratiSpajanje() + odk.vratiUslovZaSortiranje();
        System.out.println(upit);
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(upit);

        List<OpstaDomenskaKlasa> lista = odk.vratiListu(rs);

        rs.close();
        s.close();

        return lista;
    }

}
