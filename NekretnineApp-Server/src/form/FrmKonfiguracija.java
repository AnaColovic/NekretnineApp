/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.PodesavanjeBaze;
import util.PodesavanjeKonekcije;

/**
 *
 * @author Administrator
 */
public class FrmKonfiguracija extends javax.swing.JDialog {

    /**
     * Creates new form FrmKonfiguracija
     */
    public FrmKonfiguracija(java.awt.Frame parent, boolean modal, boolean baza) {
        super(parent, modal);
        initComponents();
        popuniPolja(baza);
        if (baza == true) {
            pnlPort.setVisible(false);
            pack();
        } else {
            pnlBaza.setVisible(false);
            pack();
        }
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBaza = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtURL = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnSacuvaj = new javax.swing.JButton();
        btnIzmeni = new javax.swing.JButton();
        btnOtkazi = new javax.swing.JButton();
        pnlPort = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        btnSacuvaj1 = new javax.swing.JButton();
        btnIzmeni1 = new javax.swing.JButton();
        btnOtkazi1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        pnlBaza.setBorder(javax.swing.BorderFactory.createTitledBorder("Konfiguracija baze"));

        jLabel1.setText("URL:");

        jLabel2.setText("User:");

        jLabel3.setText("Password:");

        txtURL.setEditable(false);

        txtUser.setEditable(false);

        txtPassword.setEditable(false);

        btnSacuvaj.setText("Sacuvaj");
        btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajActionPerformed(evt);
            }
        });

        btnIzmeni.setText("Izmeni");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnOtkazi.setText("Otkazi");
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBazaLayout = new javax.swing.GroupLayout(pnlBaza);
        pnlBaza.setLayout(pnlBazaLayout);
        pnlBazaLayout.setHorizontalGroup(
            pnlBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBazaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBazaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(txtURL))
                    .addGroup(pnlBazaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(pnlBazaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(65, 65, 65)
                        .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBazaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOtkazi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIzmeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSacuvaj)))
                .addContainerGap())
        );
        pnlBazaLayout.setVerticalGroup(
            pnlBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBazaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(pnlBazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvaj)
                    .addComponent(btnIzmeni)
                    .addComponent(btnOtkazi))
                .addGap(22, 22, 22))
        );

        getContentPane().add(pnlBaza);

        pnlPort.setBorder(javax.swing.BorderFactory.createTitledBorder("Konfiguracija komunikacije"));

        jLabel4.setText("Port:");

        txtPort.setEditable(false);

        btnSacuvaj1.setText("Sacuvaj");
        btnSacuvaj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvaj1ActionPerformed(evt);
            }
        });

        btnIzmeni1.setText("Izmeni");
        btnIzmeni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeni1ActionPerformed(evt);
            }
        });

        btnOtkazi1.setText("Otkazi");
        btnOtkazi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkazi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPortLayout = new javax.swing.GroupLayout(pnlPort);
        pnlPort.setLayout(pnlPortLayout);
        pnlPortLayout.setHorizontalGroup(
            pnlPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPortLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPortLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPortLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOtkazi1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIzmeni1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSacuvaj1)))
                .addContainerGap())
        );
        pnlPortLayout.setVerticalGroup(
            pnlPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPortLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(pnlPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacuvaj1)
                    .addComponent(btnIzmeni1)
                    .addComponent(btnOtkazi1))
                .addContainerGap())
        );

        getContentPane().add(pnlPort);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        dispose();
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        txtPassword.setEditable(true);
        txtURL.setEditable(true);
        txtUser.setEditable(true);
        btnSacuvaj.setEnabled(true);
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajActionPerformed
        try {
            sacuvajKonfiguraciju(true);
            JOptionPane.showMessageDialog(this, "Uspesno ste sacuvali podesavanja");
            txtPassword.setEditable(false);
            txtURL.setEditable(false);
            txtUser.setEditable(false);
            btnSacuvaj.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSacuvajActionPerformed

    private void btnOtkazi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkazi1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnOtkazi1ActionPerformed

    private void btnIzmeni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeni1ActionPerformed
        txtPort.setEditable(true);
        btnSacuvaj1.setEnabled(true);
    }//GEN-LAST:event_btnIzmeni1ActionPerformed

    private void btnSacuvaj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvaj1ActionPerformed
        try {
            sacuvajKonfiguraciju(false);
            JOptionPane.showMessageDialog(this, "Uspesno ste sacuvali podesavanja");
            txtPort.setEditable(false);
            btnSacuvaj1.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSacuvaj1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnIzmeni1;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JButton btnOtkazi1;
    private javax.swing.JButton btnSacuvaj;
    private javax.swing.JButton btnSacuvaj1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnlBaza;
    private javax.swing.JPanel pnlPort;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtURL;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void popuniPolja(boolean baza) {
        if (baza == true) {
            String user = PodesavanjeBaze.getInstance().getProperty("user");
            String pass = PodesavanjeBaze.getInstance().getProperty("password");
            String url = PodesavanjeBaze.getInstance().getProperty("url");
            
            txtPassword.setText(pass);
            txtUser.setText(user);
            txtURL.setText(url);
        } else {
            String port = PodesavanjeKonekcije.getInstance().getProperty("port");
            txtPort.setText(port);
        }
    }

    private void sacuvajKonfiguraciju(boolean baza) throws Exception {
        if (baza == true) {
            String url = txtURL.getText().trim();
            String pass = txtPassword.getText().trim();
            String user = txtUser.getText().trim();

            PodesavanjeBaze.getInstance().setProperty("url", url);
            PodesavanjeBaze.getInstance().setProperty("password", pass);
            PodesavanjeBaze.getInstance().setProperty("user", user);
        } else {
            String port = txtPort.getText().trim();
            PodesavanjeKonekcije.getInstance().setProperty("port", port);

        }

    }
}
