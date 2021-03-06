/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica.menutecnicoacademico;

import centrocomputo.interfaz.*;
import centrocomputo.inventario.*;
import interfazgrafica.registrardictamen.*;
import repositorio.dataaccesobject.*;
import repositorio.interfaz.*;

/**
 *
 * @author Alberto Sánchez
 */
public class VentanaMenuTecnicoAcademico extends javax.swing.JFrame {
  
  private static VentanaMenuTecnicoAcademico ventanaMenuTa = null;
  InventarioDictamenInterface inventarioDictamen;
  InventarioHardwareInterface inventarioHardware;
  String rolNecesario = "TA";

  /**
   * Creates new form VentanaMenuTecnicoAcademico
   */

  public VentanaMenuTecnicoAcademico(InventarioUsuarioInterface inventarioUsuario) {
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

    jLabelLogoCc = new javax.swing.JLabel();
    jPanelTecnicoAcademico = new javax.swing.JPanel();
    jLabelTituloVentana = new javax.swing.JLabel();
    jLabelLogoCc1 = new javax.swing.JLabel();
    jButtonRegistrarDictamen = new javax.swing.JButton();

    jLabelLogoCc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelLogoCc.png"))); // NOI18N

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanelTecnicoAcademico.setBackground(new java.awt.Color(255, 255, 255));

    jLabelTituloVentana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabelTituloVentana.setText("Técnico académico");

    jLabelLogoCc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelLogoCc.png"))); // NOI18N

    jButtonRegistrarDictamen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jButtonRegistrarDictamen.setText("Registrar dictamen");
    jButtonRegistrarDictamen.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonRegistrarDictamenActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanelTecnicoAcademicoLayout = new javax.swing.GroupLayout(jPanelTecnicoAcademico);
    jPanelTecnicoAcademico.setLayout(jPanelTecnicoAcademicoLayout);
    jPanelTecnicoAcademicoLayout.setHorizontalGroup(
      jPanelTecnicoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelTecnicoAcademicoLayout.createSequentialGroup()
        .addGap(35, 35, 35)
        .addComponent(jLabelTituloVentana)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(jPanelTecnicoAcademicoLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(jLabelLogoCc1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
        .addComponent(jButtonRegistrarDictamen, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(24, 24, 24))
    );
    jPanelTecnicoAcademicoLayout.setVerticalGroup(
      jPanelTecnicoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelTecnicoAcademicoLayout.createSequentialGroup()
        .addGap(32, 32, 32)
        .addComponent(jLabelTituloVentana)
        .addGroup(jPanelTecnicoAcademicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanelTecnicoAcademicoLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelLogoCc1))
          .addGroup(jPanelTecnicoAcademicoLayout.createSequentialGroup()
            .addGap(86, 86, 86)
            .addComponent(jButtonRegistrarDictamen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(28, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanelTecnicoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanelTecnicoAcademico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButtonRegistrarDictamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarDictamenActionPerformed
    despliegaVentanaRegistrarDictamen();
  }//GEN-LAST:event_jButtonRegistrarDictamenActionPerformed

  private void despliegaVentanaRegistrarDictamen(){
    AccesoDatosDictamenInterface repositorioDictamen = new AccesoDatosDictamen();
     AccesoDatosHardwareInterface repositorioHardware = new AccesoDatosHardware();
    InventarioHardwareInterface inventarioHardware = InventarioHardware.obtieneInstancia(repositorioHardware);
    InventarioDictamenInterface inventarioDictamen = InventarioDictamen.obtieneInstancia(repositorioDictamen);
    VentanaRegistrarDictamen ventanaDictamen 
            = new VentanaRegistrarDictamen(this, inventarioDictamen, inventarioHardware);
    ventanaDictamen.setLocationRelativeTo(null);
    ventanaDictamen.setVisible(true);
    this.setVisible(false);
  }
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonRegistrarDictamen;
  private javax.swing.JLabel jLabelLogoCc;
  private javax.swing.JLabel jLabelLogoCc1;
  private javax.swing.JLabel jLabelTituloVentana;
  private javax.swing.JPanel jPanelTecnicoAcademico;
  // End of variables declaration//GEN-END:variables
}
