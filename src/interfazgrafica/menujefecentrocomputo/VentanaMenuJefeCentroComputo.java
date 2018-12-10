/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica.menujefecentrocomputo;

/**
 *
 * @author Alberto Sánchez
 */
public class VentanaMenuJefeCentroComputo extends javax.swing.JFrame {

  /**
   * Creates new form VentanaMenuJefeCentroComputo
   */
  public VentanaMenuJefeCentroComputo() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanelMenuJefeCentroComputo = new javax.swing.JPanel();
    jLabelTituloVentana = new javax.swing.JLabel();
    jButtonAdministrarHardware = new javax.swing.JButton();
    jButtonAdministrarUsuarios = new javax.swing.JButton();
    jButtonAdministrarResponsables = new javax.swing.JButton();
    jLabelLogoCc = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanelMenuJefeCentroComputo.setBackground(new java.awt.Color(255, 255, 255));

    jLabelTituloVentana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabelTituloVentana.setText("Jefe de Centro de Computo");

    jButtonAdministrarHardware.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonAdministrarHardware.setText("Administrar Hardware");
    jButtonAdministrarHardware.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonAdministrarHardwareActionPerformed(evt);
      }
    });

    jButtonAdministrarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonAdministrarUsuarios.setText("Administrar Usuarios");
    jButtonAdministrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonAdministrarUsuariosActionPerformed(evt);
      }
    });

    jButtonAdministrarResponsables.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonAdministrarResponsables.setText("Administrar Responsables");
    jButtonAdministrarResponsables.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonAdministrarResponsablesActionPerformed(evt);
      }
    });

    jLabelLogoCc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelLogoCc.png"))); // NOI18N

    javax.swing.GroupLayout jPanelMenuJefeCentroComputoLayout = new javax.swing.GroupLayout(jPanelMenuJefeCentroComputo);
    jPanelMenuJefeCentroComputo.setLayout(jPanelMenuJefeCentroComputoLayout);
    jPanelMenuJefeCentroComputoLayout.setHorizontalGroup(
      jPanelMenuJefeCentroComputoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelMenuJefeCentroComputoLayout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(jPanelMenuJefeCentroComputoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelLogoCc)
          .addComponent(jLabelTituloVentana))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
        .addGroup(jPanelMenuJefeCentroComputoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jButtonAdministrarResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButtonAdministrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButtonAdministrarHardware, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(70, 70, 70))
    );
    jPanelMenuJefeCentroComputoLayout.setVerticalGroup(
      jPanelMenuJefeCentroComputoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelMenuJefeCentroComputoLayout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(jLabelTituloVentana)
        .addGroup(jPanelMenuJefeCentroComputoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanelMenuJefeCentroComputoLayout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addComponent(jButtonAdministrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(37, 37, 37)
            .addComponent(jButtonAdministrarHardware, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(41, 41, 41)
            .addComponent(jButtonAdministrarResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanelMenuJefeCentroComputoLayout.createSequentialGroup()
            .addGap(40, 40, 40)
            .addComponent(jLabelLogoCc)))
        .addContainerGap(43, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanelMenuJefeCentroComputo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanelMenuJefeCentroComputo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButtonAdministrarHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministrarHardwareActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButtonAdministrarHardwareActionPerformed

  private void jButtonAdministrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministrarUsuariosActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButtonAdministrarUsuariosActionPerformed

  private void jButtonAdministrarResponsablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministrarResponsablesActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButtonAdministrarResponsablesActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /*
     * Set the Nimbus look and feel
     */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the
     * default look and feel.
     * For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(VentanaMenuJefeCentroComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VentanaMenuJefeCentroComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VentanaMenuJefeCentroComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VentanaMenuJefeCentroComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /*
     * Create and display the form
     */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VentanaMenuJefeCentroComputo().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonAdministrarHardware;
  private javax.swing.JButton jButtonAdministrarResponsables;
  private javax.swing.JButton jButtonAdministrarUsuarios;
  private javax.swing.JLabel jLabelLogoCc;
  private javax.swing.JLabel jLabelTituloVentana;
  private javax.swing.JPanel jPanelMenuJefeCentroComputo;
  // End of variables declaration//GEN-END:variables
}
