/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.vlasnik;

import form.klijent.*;
import kontroler.Kontroler;
import domain.Klijent;
import domain.Nekretnina;
import domain.NekretninaZaIzdavanje;
import domain.OpstaDomenskaKlasa;
import domain.Vlasnik;
import form.FrmDialog;
import form.FrmForma;
import form.IPanel;
import form.PanelModeEnum;
import form.klijent.model.TableModelKlijent;
import form.vlasnik.model.TableModelVlasnik;
import form.nekretnina.model.TableModelNekretnina;
import form.ugovorZakup.PnlNoviUgovorOIzdavanjuNekretnine;
import java.awt.Frame;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrator
 */
public class PnlPretragaVlasnika extends javax.swing.JPanel implements IPanel {

    PanelModeEnum mode;

    /**
     * Creates new form PnlPretragaKlijenta
     */
    public PnlPretragaVlasnika(PanelModeEnum mode) {
        initComponents();
        this.mode = mode;
        postaviModel();
        dekorisiPanel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVlasnik = new javax.swing.JTable();
        btnIzmeni = new javax.swing.JButton();
        btnIzaberi = new javax.swing.JButton();
        btnOtkazi = new javax.swing.JButton();
        btnPrikaziSve = new javax.swing.JButton();
        btnPrikazi = new javax.swing.JButton();

        jLabel1.setText("Ime:");

        jLabel2.setText("Prezime:");

        txtIme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtImeKeyReleased(evt);
            }
        });

        txtPrezime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrezimeKeyReleased(evt);
            }
        });

        tblVlasnik.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblVlasnik);

        btnIzmeni.setText("Izmeni");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnIzaberi.setText("Izaberi");
        btnIzaberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzaberiActionPerformed(evt);
            }
        });

        btnOtkazi.setText("Otkazi");
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });

        btnPrikaziSve.setText("Prikazi sve");
        btnPrikaziSve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveActionPerformed(evt);
            }
        });

        btnPrikazi.setText("Prikazi");
        btnPrikazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrikazi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIzaberi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrikaziSve)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrikaziSve))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzmeni)
                    .addComponent(btnIzaberi)
                    .addComponent(btnOtkazi)
                    .addComponent(btnPrikazi))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void txtImeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImeKeyReleased
        pronadjiVlasnike();
    }//GEN-LAST:event_txtImeKeyReleased

    private void txtPrezimeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrezimeKeyReleased
        pronadjiVlasnike();
    }//GEN-LAST:event_txtPrezimeKeyReleased

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        Vlasnik vlasnik;
        int row = tblVlasnik.getSelectedRow();
        TableModelVlasnik model = (TableModelVlasnik) tblVlasnik.getModel();
        if (row != -1) {
            vlasnik = model.getVlasnici().get(row);
            PnlUnosVlasnika panel = new PnlUnosVlasnika(PanelModeEnum.IZMENA);
            panel.popuniPolja(vlasnik);
            panel.postaviVidljivostPoljima(false);
            FrmDialog form = new FrmDialog((Frame) SwingUtilities.getWindowAncestor(this), true, panel);
            form.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Morate izabrati vlasnika", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnIzaberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzaberiActionPerformed
        IPanel panel = (IPanel) ((FrmForma) SwingUtilities.getWindowAncestor((FrmDialog) SwingUtilities.getWindowAncestor(this))).getPanel();
        TableModelVlasnik model = (TableModelVlasnik) tblVlasnik.getModel();
        int row = tblVlasnik.getSelectedRow();
        if (row != -1) {
            Vlasnik vlasnik = model.getVlasnici().get(row);
            panel.popuniPolja((Vlasnik) vlasnik);
            SwingUtilities.getWindowAncestor(this).dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Morate izabrati vlasnika", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIzaberiActionPerformed

    private void btnPrikaziSveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveActionPerformed
        TableModelVlasnik model = (TableModelVlasnik) tblVlasnik.getModel();
        try {
            List<Vlasnik> vlasnici = Kontroler.getInstance().vratiSveVlasnike();
            model.setVlasnici(vlasnici);
            if(vlasnici.isEmpty()) JOptionPane.showMessageDialog(this, "Trenutno u sistemu ne postoji nijedan vlasnik");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrikaziSveActionPerformed

    private void btnPrikaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziActionPerformed
        Vlasnik vlasnik;
        int row = tblVlasnik.getSelectedRow();
        TableModelVlasnik model = (TableModelVlasnik) tblVlasnik.getModel();
        if (row != -1) {
            vlasnik = model.getVlasnici().get(row);
            PnlPrikazVlasnika panel = new PnlPrikazVlasnika();
            panel.popuniPolja(vlasnik);
            FrmForma form = new FrmForma(panel);
            form.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Morate izabrati vlasnika", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrikaziActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzaberi;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JButton btnPrikazi;
    private javax.swing.JButton btnPrikaziSve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVlasnik;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    private void postaviModel() {
        TableModelVlasnik model = new TableModelVlasnik(new LinkedList<>());
        tblVlasnik.setModel(model);
    }

    private void pronadjiVlasnike() {
        TableModelVlasnik model = (TableModelVlasnik) tblVlasnik.getModel();
        try {
            Vlasnik vlasnik = (Vlasnik) preuzmiPolja();
            popuniPolja(vlasnik);
        } catch (Exception ex) {
            model.setVlasnici(new LinkedList<>());
        }
    }

    @Override
    public void popuniPolja(OpstaDomenskaKlasa odk) {
        TableModelVlasnik model = (TableModelVlasnik) tblVlasnik.getModel();
        try {
            List<Vlasnik> vlasnici = Kontroler.getInstance().pretraziVlasnike((Vlasnik) odk);
            model.setVlasnici(vlasnici);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    @Override
    public OpstaDomenskaKlasa preuzmiPolja() throws Exception {
        String ime = txtIme.getText().trim();
        String prezime = txtPrezime.getText().trim();
        if (ime.isEmpty() && prezime.isEmpty()) {
            throw new Exception();
        }
        Vlasnik vlasnik = new Vlasnik();
        vlasnik.setIme(ime);
        vlasnik.setPrezime(prezime);
        return vlasnik;
    }

    @Override
    public void isprazniPolja() {
        txtIme.setText("");
        txtPrezime.setText("");
    }

    @Override
    public void dekorisiPanel() {
        if (mode == PanelModeEnum.IZMENA) {
            btnIzaberi.setVisible(false);
        } else {
            btnIzmeni.setVisible(false);
        }
    }

    @Override
    public void postaviVidljivostPoljima(boolean signal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void popuniPodatke() {
        postaviModel();
        isprazniPolja();
    }
}
