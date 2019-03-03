/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import kontroler.Kontroler;
import domain.Agent;
import form.model.TableModelPrijavljeniKorisnici;
import java.awt.Color;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import niti.KlijentskaNit;
import niti.PokretanjeServera;
import operacija.StatusOperacije;
import transfer.OdgovorServera;

/**
 *
 * @author Administrator
 */
public class FrmMain extends javax.swing.JFrame {

    PokretanjeServera server;

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        postaviStatus("Server nije pokrenut", false);
        setTableModel();
        Kontroler.getInstance().setForma(this);
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

        btnPokreniServer = new javax.swing.JButton();
        btnZaustaviServer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        pnlPrijavljeniAgenti = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrijavljeniKorisnici = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPokreniServer.setText("Pokreni server");
        btnPokreniServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokreniServerActionPerformed(evt);
            }
        });

        btnZaustaviServer.setText("Zaustavi server");
        btnZaustaviServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZaustaviServerActionPerformed(evt);
            }
        });

        jLabel1.setText("Status:");

        pnlPrijavljeniAgenti.setBorder(javax.swing.BorderFactory.createTitledBorder("Prijavljeni agenti"));

        tblPrijavljeniKorisnici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPrijavljeniKorisnici);

        javax.swing.GroupLayout pnlPrijavljeniAgentiLayout = new javax.swing.GroupLayout(pnlPrijavljeniAgenti);
        pnlPrijavljeniAgenti.setLayout(pnlPrijavljeniAgentiLayout);
        pnlPrijavljeniAgentiLayout.setHorizontalGroup(
            pnlPrijavljeniAgentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrijavljeniAgentiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPrijavljeniAgentiLayout.setVerticalGroup(
            pnlPrijavljeniAgentiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrijavljeniAgentiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jMenu1.setText("Podesavanje");

        jMenuItem1.setText("Konfiguracija baze");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Konfiguracija komunikacije");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPrijavljeniAgenti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPokreniServer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnZaustaviServer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPokreniServer)
                    .addComponent(btnZaustaviServer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(pnlPrijavljeniAgenti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPokreniServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokreniServerActionPerformed
        server = new PokretanjeServera();
        server.start();
    }//GEN-LAST:event_btnPokreniServerActionPerformed

    private void btnZaustaviServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZaustaviServerActionPerformed
        server.zaustaviServer();
        Kontroler.getInstance().ugasiNiti();
        TableModelPrijavljeniKorisnici model = (TableModelPrijavljeniKorisnici) tblPrijavljeniKorisnici.getModel();
        model.setPrijavljeniAgenti(new LinkedList<>());
    }//GEN-LAST:event_btnZaustaviServerActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (btnPokreniServer.isEnabled()) {
            new FrmKonfiguracija(this, true,true).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nije moguce promeniti konfiguraciju dok je server pokrenut", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (btnPokreniServer.isEnabled()) {
            new FrmKonfiguracija(this, true,false).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nije moguce promeniti konfiguraciju dok je server pokrenut", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPokreniServer;
    private javax.swing.JButton btnZaustaviServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel pnlPrijavljeniAgenti;
    private javax.swing.JTable tblPrijavljeniKorisnici;
    // End of variables declaration//GEN-END:variables

    private void setTableModel() {
        TableModelPrijavljeniKorisnici model = new TableModelPrijavljeniKorisnici();
        tblPrijavljeniKorisnici.setModel(model);
    }

    public void postaviStatus(String poruka, boolean uspesno) {
        lblStatus.setText(poruka);
        if (uspesno == true) {
            lblStatus.setForeground(Color.GREEN);
            btnPokreniServer.setEnabled(false);
            btnZaustaviServer.setEnabled(true);
            pnlPrijavljeniAgenti.setVisible(true);
        } else {
            lblStatus.setForeground(Color.RED);
            btnPokreniServer.setEnabled(true);
            btnZaustaviServer.setEnabled(false);
            pnlPrijavljeniAgenti.setVisible(false);
        }
    }

    public void dodajPrijavljenogAgenta(Agent a) {
        TableModelPrijavljeniKorisnici model = (TableModelPrijavljeniKorisnici) tblPrijavljeniKorisnici.getModel();
        model.dodajAgenta(a);
    }

    public void odjaviPrijavljenogAgenta(Agent a) {
        TableModelPrijavljeniKorisnici model = (TableModelPrijavljeniKorisnici) tblPrijavljeniKorisnici.getModel();
        model.obrisiAgenta(a);
    }

}