package form;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import kontroler.Kontroler;
import domain.OpstaDomenskaKlasa;
import form.klijent.PnlPretragaKlijenta;
import form.nekretnina.PnlNovaNekretnina;
import sesija.Sesija;
import form.klijent.PnlUnosKlijenta;
import form.nekretnina.PnlPretragaNekretnine;
import form.ugovorProdaja.PnlNoviUgovorOProdajiNekretnine;
import form.ugovorProdaja.PnlPretragaUgovoraOKupoprodaji;
import form.ugovorZakup.PnlNoviUgovorOIzdavanjuNekretnine;
import form.ugovorZakup.PnlPretragaUgovoraOZakupu;
import form.vlasnik.PnlPretragaVlasnika;
import form.vlasnik.PnlUnosVlasnika;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        showForm();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAgent = new javax.swing.JPanel();
        lblAgent = new javax.swing.JLabel();
        lblAgentName = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miNovaNekretnina = new javax.swing.JMenuItem();
        miPretraziNekretnine = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miNoviKlijent = new javax.swing.JMenuItem();
        miPretraziKlijente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        miNoviUgovorIzdavanje = new javax.swing.JMenuItem();
        miPretragaUgovoraIzdavanje = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        miNoviUgovorKupoprodaja = new javax.swing.JMenuItem();
        miPretragaUgovoraKupoprodaja = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        miNoviVlasnik = new javax.swing.JMenuItem();
        miPretragaVlasnika = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nekretnine App - Pocetna strana");

        pnlAgent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAgent.setText("Prijavljeni agent:");

        javax.swing.GroupLayout pnlAgentLayout = new javax.swing.GroupLayout(pnlAgent);
        pnlAgent.setLayout(pnlAgentLayout);
        pnlAgentLayout.setHorizontalGroup(
            pnlAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        pnlAgentLayout.setVerticalGroup(
            pnlAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgent)
                    .addComponent(lblAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Nekretnina");

        miNovaNekretnina.setText("Nova nekretnina");
        miNovaNekretnina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovaNekretninaActionPerformed(evt);
            }
        });
        jMenu1.add(miNovaNekretnina);

        miPretraziNekretnine.setText("Pretrazi nekretnine");
        miPretraziNekretnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPretraziNekretnineActionPerformed(evt);
            }
        });
        jMenu1.add(miPretraziNekretnine);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Klijent");

        miNoviKlijent.setText("Novi klijent");
        miNoviKlijent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNoviKlijentActionPerformed(evt);
            }
        });
        jMenu2.add(miNoviKlijent);

        miPretraziKlijente.setText("Pretrazi klijente");
        miPretraziKlijente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPretraziKlijenteActionPerformed(evt);
            }
        });
        jMenu2.add(miPretraziKlijente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ugovor o izdavanju");

        miNoviUgovorIzdavanje.setText("Novi ugovor");
        miNoviUgovorIzdavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNoviUgovorIzdavanjeActionPerformed(evt);
            }
        });
        jMenu3.add(miNoviUgovorIzdavanje);

        miPretragaUgovoraIzdavanje.setText(" Pretraga ugovora");
        miPretragaUgovoraIzdavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPretragaUgovoraIzdavanjeActionPerformed(evt);
            }
        });
        jMenu3.add(miPretragaUgovoraIzdavanje);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ugovor o kupoprodaji");

        miNoviUgovorKupoprodaja.setText("Novi ugovor");
        miNoviUgovorKupoprodaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNoviUgovorKupoprodajaActionPerformed(evt);
            }
        });
        jMenu4.add(miNoviUgovorKupoprodaja);

        miPretragaUgovoraKupoprodaja.setText("Pretraga ugovora");
        miPretragaUgovoraKupoprodaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPretragaUgovoraKupoprodajaActionPerformed(evt);
            }
        });
        jMenu4.add(miPretragaUgovoraKupoprodaja);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Vlasnik");

        miNoviVlasnik.setText("Novi vlasnik");
        miNoviVlasnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNoviVlasnikActionPerformed(evt);
            }
        });
        jMenu5.add(miNoviVlasnik);

        miPretragaVlasnika.setText("Pretraga vlasnika");
        miPretragaVlasnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPretragaVlasnikaActionPerformed(evt);
            }
        });
        jMenu5.add(miPretragaVlasnika);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Odjava sa sistema");

        jMenuItem1.setText("Odjavi se");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnlAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNovaNekretninaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovaNekretninaActionPerformed
        IPanel panel = new PnlNovaNekretnina(PanelModeEnum.UNOS,true);
        panel.dekorisiPanel();
        new FrmForma(panel).setVisible(true);
    }//GEN-LAST:event_miNovaNekretninaActionPerformed

    private void miNoviKlijentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNoviKlijentActionPerformed
        IPanel panel = new PnlUnosKlijenta(PanelModeEnum.UNOS);
        panel.dekorisiPanel();
        new FrmDialog(this, true, panel).setVisible(true);
    }//GEN-LAST:event_miNoviKlijentActionPerformed

    private void miPretraziNekretnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPretraziNekretnineActionPerformed
        PnlPretragaNekretnine panel = new PnlPretragaNekretnine(PanelModeEnum.IZMENA,true);       
        FrmForma forma = new FrmForma(panel);
        
        forma.setVisible(true);
    }//GEN-LAST:event_miPretraziNekretnineActionPerformed

    private void miNoviUgovorIzdavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNoviUgovorIzdavanjeActionPerformed
        IPanel panel = new PnlNoviUgovorOIzdavanjuNekretnine(PanelModeEnum.UNOS);
        FrmForma form = new FrmForma(panel);

        form.setVisible(true);
    }//GEN-LAST:event_miNoviUgovorIzdavanjeActionPerformed

    private void miPretraziKlijenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPretraziKlijenteActionPerformed
        IPanel panel = new PnlPretragaKlijenta(PanelModeEnum.IZMENA);
        FrmForma forma = new FrmForma(panel);
        
        forma.setVisible(true);
    }//GEN-LAST:event_miPretraziKlijenteActionPerformed

    private void miNoviUgovorKupoprodajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNoviUgovorKupoprodajaActionPerformed
        IPanel panel = new PnlNoviUgovorOProdajiNekretnine(PanelModeEnum.UNOS);
        FrmForma form = new FrmForma(panel);
        
        form.setVisible(true);
    }//GEN-LAST:event_miNoviUgovorKupoprodajaActionPerformed

    private void miPretragaUgovoraKupoprodajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPretragaUgovoraKupoprodajaActionPerformed
        PnlPretragaUgovoraOKupoprodaji panel = new PnlPretragaUgovoraOKupoprodaji();
        FrmForma forma = new FrmForma(panel);
        
        forma.setVisible(true);
    }//GEN-LAST:event_miPretragaUgovoraKupoprodajaActionPerformed

    private void miPretragaUgovoraIzdavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPretragaUgovoraIzdavanjeActionPerformed
        PnlPretragaUgovoraOZakupu panel = new PnlPretragaUgovoraOZakupu();
        FrmForma forma = new FrmForma(panel);
        
        forma.setVisible(true);
    }//GEN-LAST:event_miPretragaUgovoraIzdavanjeActionPerformed

    private void miNoviVlasnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNoviVlasnikActionPerformed
       PnlUnosVlasnika panel = new PnlUnosVlasnika(PanelModeEnum.UNOS);
       FrmDialog forma = new FrmDialog(this, true, panel);
       
       forma.setVisible(true);
    }//GEN-LAST:event_miNoviVlasnikActionPerformed

    private void miPretragaVlasnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPretragaVlasnikaActionPerformed
        PnlPretragaVlasnika panel = new PnlPretragaVlasnika(PanelModeEnum.IZMENA);
        FrmForma forma = new FrmForma(panel);
        
        forma.setVisible(true);
    }//GEN-LAST:event_miPretragaVlasnikaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            String odgovor = Kontroler.getInstance().odjaviSe(Sesija.getInstance().getPrijavljeniAgent());
            JOptionPane.showMessageDialog(this, odgovor);
            FrmLogIn form = new FrmLogIn(false);
            form.setVisible(true);
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JMenuItem miNovaNekretnina;
    private javax.swing.JMenuItem miNoviKlijent;
    private javax.swing.JMenuItem miNoviUgovorIzdavanje;
    private javax.swing.JMenuItem miNoviUgovorKupoprodaja;
    private javax.swing.JMenuItem miNoviVlasnik;
    private javax.swing.JMenuItem miPretragaUgovoraIzdavanje;
    private javax.swing.JMenuItem miPretragaUgovoraKupoprodaja;
    private javax.swing.JMenuItem miPretragaVlasnika;
    private javax.swing.JMenuItem miPretraziKlijente;
    private javax.swing.JMenuItem miPretraziNekretnine;
    private javax.swing.JPanel pnlAgent;
    // End of variables declaration//GEN-END:variables

    
    public void showForm() {
        setVisible(true);
        setLocationRelativeTo(null);
        lblAgentName.setText(Sesija.getInstance().getPrijavljeniAgent().getIme() + " " + Sesija.getInstance().getPrijavljeniAgent().getPrezime());
    }

}
