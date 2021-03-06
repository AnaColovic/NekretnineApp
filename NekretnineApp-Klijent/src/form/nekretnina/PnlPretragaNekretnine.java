/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.nekretnina;

import kontroler.Kontroler;
import domain.Grad;
import domain.NamenaNekretnine;
import domain.Nekretnina;
import domain.NekretninaZaIzdavanje;
import domain.NekretninaZaProdaju;
import domain.OpstaDomenskaKlasa;
import domain.TipNekretnine;
import form.FrmDialog;
import form.FrmForma;
import form.IPanel;
import form.PanelModeEnum;
import form.nekretnina.model.TableModelNekretnina;
import form.ugovorZakup.PnlNoviUgovorOIzdavanjuNekretnine;
import java.awt.Frame;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrator
 */
public class PnlPretragaNekretnine extends javax.swing.JPanel implements IPanel {

    PanelModeEnum mode;
    boolean zaIzdavanje;

    /**
     * Creates new form PnlPretragaNekretnine
     */
    public PnlPretragaNekretnine(PanelModeEnum mode, boolean zaIzdavanje) {
        initComponents();
        this.mode = mode;
        this.zaIzdavanje = zaIzdavanje;
        postaviModel();
        popuniComboGradovi();
        popuniComboTipoviNekretnina();
        dekorisiPanel();
        if (mode == PanelModeEnum.PRETRAGA) {
            rbIzdavanje.setVisible(false);
            rbProdaja.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cmbGrad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbTipNekretnine = new javax.swing.JComboBox<>();
        rbIzdavanje = new javax.swing.JRadioButton();
        rbProdaja = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNekretnine = new javax.swing.JTable();
        btnPretrazi = new javax.swing.JButton();
        btnPrikaziSve = new javax.swing.JButton();
        cmbSort = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbKriterijum = new javax.swing.JComboBox<>();
        btnIzmeni = new javax.swing.JButton();
        btnIzaberi = new javax.swing.JButton();
        btnOtkazi = new javax.swing.JButton();
        btnPrikazi = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Pretraga nekretnina"));

        jLabel1.setText("Grad:");

        jLabel2.setText("Tip nekretnine:");

        buttonGroup1.add(rbIzdavanje);
        rbIzdavanje.setSelected(true);
        rbIzdavanje.setText("Nekretnina za izdavanje");
        rbIzdavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIzdavanjeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbProdaja);
        rbProdaja.setText("Nekretnina za prodaju");
        rbProdaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProdajaActionPerformed(evt);
            }
        });

        tblNekretnine.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblNekretnine);

        btnPretrazi.setText("Pretrazi");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        btnPrikaziSve.setText("Prikazi sve");
        btnPrikaziSve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveActionPerformed(evt);
            }
        });

        cmbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Povrsini", "Broju soba" }));
        cmbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSortActionPerformed(evt);
            }
        });

        jLabel3.setText("Sortiraj po:");

        cmbKriterijum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rastuce", "Opadajuce" }));
        cmbKriterijum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKriterijumActionPerformed(evt);
            }
        });

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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipNekretnine, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbIzdavanje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbProdaja)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPrikaziSve, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(btnPretrazi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbKriterijum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrikazi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIzaberi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbIzdavanje)
                            .addComponent(rbProdaja)
                            .addComponent(btnPrikaziSve))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbGrad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(cmbTipNekretnine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPretrazi)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbKriterijum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzmeni)
                    .addComponent(btnIzaberi)
                    .addComponent(btnOtkazi)
                    .addComponent(btnPrikazi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbIzdavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIzdavanjeActionPerformed
        TableModelNekretnina model = new TableModelNekretnina(new LinkedList<Nekretnina>(), NamenaNekretnine.ZA_IZDAVANJE);
        tblNekretnine.setModel(model);
        zaIzdavanje = true;
    }//GEN-LAST:event_rbIzdavanjeActionPerformed

    private void rbProdajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProdajaActionPerformed
        TableModelNekretnina model = new TableModelNekretnina(new LinkedList<Nekretnina>(), NamenaNekretnine.ZA_PRODAJU);
        tblNekretnine.setModel(model);
        zaIzdavanje = false;
    }//GEN-LAST:event_rbProdajaActionPerformed

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        Nekretnina nekretnina;
        Grad grad = (Grad) cmbGrad.getSelectedItem();
        TipNekretnine tip = TipNekretnine.valueOf(cmbTipNekretnine.getSelectedItem().toString());
        if (zaIzdavanje == true) {
            nekretnina = new NekretninaZaIzdavanje();
        } else {
            nekretnina = new NekretninaZaProdaju();
        }
        nekretnina.setGrad(grad);
        nekretnina.setTip(tip);

        try {
            List<Nekretnina> nekretnine = Kontroler.getInstance().pretraziNekretnine(nekretnina);
            TableModelNekretnina model = (TableModelNekretnina) tblNekretnine.getModel();
            model.setNekretnine(nekretnine);
            model.sortiraj((String) cmbSort.getSelectedItem(), (String) cmbKriterijum.getSelectedItem());
            if (nekretnine.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nijedna nekretnina ne odgovara kriterijumima pretrage");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void btnPrikaziSveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveActionPerformed
        List<Nekretnina> nekretnine;
        try {
            if (zaIzdavanje == true) {
                nekretnine = Kontroler.getInstance().pretraziNekretnine(new NekretninaZaIzdavanje());
            } else {
                nekretnine = Kontroler.getInstance().pretraziNekretnine(new NekretninaZaProdaju());
            }
            TableModelNekretnina model = (TableModelNekretnina) tblNekretnine.getModel();
            model.setNekretnine(nekretnine);
            model.sortiraj((String) cmbSort.getSelectedItem(), (String) cmbKriterijum.getSelectedItem());
            if (nekretnine.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Trenutno ne postoji nijedna nekretnina u sistemu");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrikaziSveActionPerformed

    private void cmbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSortActionPerformed
        TableModelNekretnina model = (TableModelNekretnina) tblNekretnine.getModel();
        model.sortiraj((String) cmbSort.getSelectedItem(), (String) cmbKriterijum.getSelectedItem());
    }//GEN-LAST:event_cmbSortActionPerformed

    private void cmbKriterijumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKriterijumActionPerformed
        TableModelNekretnina model = (TableModelNekretnina) tblNekretnine.getModel();
        model.sortiraj((String) cmbSort.getSelectedItem(), (String) cmbKriterijum.getSelectedItem());    }//GEN-LAST:event_cmbKriterijumActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        TableModelNekretnina model = (TableModelNekretnina) tblNekretnine.getModel();
        int red = tblNekretnine.getSelectedRow();
        Nekretnina nekretnina = model.getNekretnine().get(red);

        try {
            if (nekretnina instanceof NekretninaZaIzdavanje) {
                nekretnina = (NekretninaZaIzdavanje) Kontroler.getInstance().vratiNekretninu(nekretnina);
            } else {
                nekretnina = (NekretninaZaProdaju) Kontroler.getInstance().vratiNekretninu(nekretnina);
            }
            PnlNovaNekretnina panel;
            if (zaIzdavanje == true) {
                panel = new PnlNovaNekretnina(PanelModeEnum.IZMENA, true);
            } else {
                panel = new PnlNovaNekretnina(PanelModeEnum.IZMENA, false);
            }
            panel.popuniPolja(nekretnina);
            panel.postaviVidljivostPoljima(false);
            FrmDialog forma = new FrmDialog((Frame) SwingUtilities.getWindowAncestor(this), true, panel);
            forma.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnIzaberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzaberiActionPerformed
        IPanel panel = (IPanel) ((FrmForma) SwingUtilities.getWindowAncestor((FrmDialog) SwingUtilities.getWindowAncestor(this))).getPanel();
        TableModelNekretnina model = (TableModelNekretnina) tblNekretnine.getModel();
        int row = tblNekretnine.getSelectedRow();
        if (row != -1) {
            Nekretnina nekretnina = model.getNekretnine().get(row);
            panel.popuniPolja(nekretnina);
            SwingUtilities.getWindowAncestor(this).dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Morate izabrati nekretninu", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIzaberiActionPerformed

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();

    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void btnPrikaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziActionPerformed
        TableModelNekretnina model = (TableModelNekretnina) tblNekretnine.getModel();
        int row = tblNekretnine.getSelectedRow();
        PnlNovaNekretnina panel;
        if (row != -1) {
            Nekretnina nekretnina = model.getNekretnine().get(row);
            if (nekretnina instanceof NekretninaZaIzdavanje) {
                panel = new PnlNovaNekretnina(PanelModeEnum.PRIKAZ, true);
            } else {
                panel = new PnlNovaNekretnina(PanelModeEnum.PRIKAZ, false);
            }
            panel.popuniPolja(nekretnina);
            panel.postaviVidljivostPoljima(false);
            FrmDialog form = new FrmDialog((Frame) SwingUtilities.getWindowAncestor(this), true, panel);
            form.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Morate izabrati nekretninu", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrikaziActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzaberi;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JButton btnPrikazi;
    private javax.swing.JButton btnPrikaziSve;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Object> cmbGrad;
    private javax.swing.JComboBox<String> cmbKriterijum;
    private javax.swing.JComboBox<String> cmbSort;
    private javax.swing.JComboBox<String> cmbTipNekretnine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbIzdavanje;
    private javax.swing.JRadioButton rbProdaja;
    private javax.swing.JTable tblNekretnine;
    // End of variables declaration//GEN-END:variables

    private void postaviModel() {
        TableModelNekretnina model;
        if (zaIzdavanje == true) {
            model = new TableModelNekretnina(new LinkedList<Nekretnina>(), NamenaNekretnine.ZA_IZDAVANJE);
        } else {
            model = new TableModelNekretnina(new LinkedList<Nekretnina>(), NamenaNekretnine.ZA_PRODAJU);
        }
        tblNekretnine.setModel(model);
    }

    private void popuniComboGradovi() {
        cmbGrad.removeAllItems();
        try {
            List<Grad> gradovi = Kontroler.getInstance().vratiSveGradove();
            for (Grad g : gradovi) {
                cmbGrad.addItem(g);
            }
        } catch (Exception ex) {
            Logger.getLogger(PnlNovaNekretnina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void popuniComboTipoviNekretnina() {
        cmbTipNekretnine.removeAllItems();
        for (TipNekretnine tip : TipNekretnine.values()) {
            cmbTipNekretnine.addItem(tip.toString());
        }
    }

    @Override
    public void dekorisiPanel() {
        if (mode == PanelModeEnum.IZMENA) {
            btnIzmeni.setVisible(true);
            btnIzaberi.setVisible(false);
        } else {
            btnIzaberi.setVisible(true);
            btnIzmeni.setVisible(false);
        }
    }

    @Override
    public void popuniPolja(OpstaDomenskaKlasa odk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpstaDomenskaKlasa preuzmiPolja() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isprazniPolja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postaviVidljivostPoljima(boolean signal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void popuniPodatke() {
        postaviModel();
    }

}
