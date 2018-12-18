/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica.administrarresponsables;

import CentroComputo.*;
import centrocomputo.interfaz.*;
import javax.swing.*;

/**
 *
 * @author Alberto Sánchez
 */
public class VentanaVisualizarResponsable extends javax.swing.JFrame {
  
  InventarioResponsableInterface inventarioResponsable;
  VentanaAdministrarResponsables ventanaCrudResponsable = null;
  private static VentanaVisualizarResponsable ventanaVisualizar = null;
  private String identificadorFila = null;
  String rolNecesario = "JCC";

  /**
   * Creates new form VentanaVisualizarResponsable
   */
    VentanaVisualizarResponsable(VentanaAdministrarResponsables ventanaCrudResponsable, InventarioResponsableInterface inventarioResponsable) {
    this.inventarioResponsable = inventarioResponsable;
    this.ventanaVisualizar = ventanaVisualizar;
    this.ventanaCrudResponsable = ventanaCrudResponsable;
    identificadorFila = ventanaCrudResponsable.getIdentificadorFila();
    initComponents();
    despliegaResponsable();
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

    jPanel1 = new javax.swing.JPanel();
    jLabelEtiquetaRegresar = new javax.swing.JLabel();
    jLabelRegresar = new javax.swing.JLabel();
    jLabelEtiquetaVisualizarResponsable = new javax.swing.JLabel();
    jLabelNombre = new javax.swing.JLabel();
    jLabelNumeroPersonal = new javax.swing.JLabel();
    jLabelTelefono = new javax.swing.JLabel();
    jLabelCorreo = new javax.swing.JLabel();
    jLabelVisualizarCorreo = new javax.swing.JLabel();
    jLabelVisualizarTelefono = new javax.swing.JLabel();
    jLabelVisualizarNumeroPersonal = new javax.swing.JLabel();
    jLabelVisualizarNombre = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabelEtiquetaRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelEtiquetaRegresar.setText("Regresar");

    jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelBack.png"))); // NOI18N
    jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelRegresarMouseClicked(evt);
      }
    });

    jLabelEtiquetaVisualizarResponsable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelEtiquetaVisualizarResponsable.setText("Visualizar Responsable");

    jLabelNombre.setText("Nombre(s):");

    jLabelNumeroPersonal.setText("No. personal:");

    jLabelTelefono.setText("Telefono:");

    jLabelCorreo.setText("Correo:");

    jLabelVisualizarCorreo.setText("EntradaCorreo");

    jLabelVisualizarTelefono.setText("EntradaTelefono");

    jLabelVisualizarNumeroPersonal.setText("EntradaNumeroPersonal");

    jLabelVisualizarNombre.setText("EntradaNombre");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabelRegresar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelEtiquetaRegresar)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 75, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelEtiquetaVisualizarResponsable)
                .addGap(109, 109, 109))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabelTelefono)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                      .addGap(11, 11, 11)
                      .addComponent(jLabelNombre))
                    .addComponent(jLabelNumeroPersonal)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                      .addGap(28, 28, 28)
                      .addComponent(jLabelCorreo))))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelVisualizarNombre)
                  .addComponent(jLabelVisualizarNumeroPersonal)
                  .addComponent(jLabelVisualizarTelefono)
                  .addComponent(jLabelVisualizarCorreo))
                .addGap(49, 49, 49))))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelEtiquetaRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelRegresar))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabelEtiquetaVisualizarResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelNombre)
          .addComponent(jLabelVisualizarNombre))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelNumeroPersonal)
          .addComponent(jLabelVisualizarNumeroPersonal))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelTelefono)
          .addComponent(jLabelVisualizarTelefono))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelCorreo)
          .addComponent(jLabelVisualizarCorreo))
        .addContainerGap(22, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jLabelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMouseClicked
    regresaVentana();
  }//GEN-LAST:event_jLabelRegresarMouseClicked

  private void regresaVentana() {
    this.setVisible(false);
    this.dispose();
    this.ventanaCrudResponsable.setVisible(true);
  }
   
  private void despliegaResponsable() {
    if (!recuperaResponsable()) {
      JOptionPane.showMessageDialog(VentanaVisualizarResponsable.this,
              "No se ha podido recuperar la información del usuario ", "Advertencia", JOptionPane.ERROR_MESSAGE);
    }
  }
   
  private boolean recuperaResponsable() {
    Responsable responsable = VentanaVisualizarResponsable.this.inventarioResponsable.buscaResponsable(identificadorFila);
    if (responsable != null) {
      this.jLabelVisualizarNombre.setText(responsable.getNombres());
      this.jLabelVisualizarNumeroPersonal.setText(responsable.getNumeroPersonal());
      this.jLabelVisualizarTelefono.setText(responsable.getTelefono());
      this.jLabelVisualizarCorreo.setText(responsable.getTelefono());
      return true;
    }
    return false;
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabelCorreo;
  private javax.swing.JLabel jLabelEtiquetaRegresar;
  private javax.swing.JLabel jLabelEtiquetaVisualizarResponsable;
  private javax.swing.JLabel jLabelNombre;
  private javax.swing.JLabel jLabelNumeroPersonal;
  private javax.swing.JLabel jLabelRegresar;
  private javax.swing.JLabel jLabelTelefono;
  private javax.swing.JLabel jLabelVisualizarCorreo;
  private javax.swing.JLabel jLabelVisualizarNombre;
  private javax.swing.JLabel jLabelVisualizarNumeroPersonal;
  private javax.swing.JLabel jLabelVisualizarTelefono;
  private javax.swing.JPanel jPanel1;
  // End of variables declaration//GEN-END:variables
}
