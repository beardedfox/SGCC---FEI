/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica.administrarresponsables;

/**
 *
 * @author Alberto Sánchez
 */
public class VentanaVisualizarResponsable extends javax.swing.JFrame {

  /**
   * Creates new form VentanaVisualizarResponsable
   */
  public VentanaVisualizarResponsable() {
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
      java.util.logging.Logger.getLogger(VentanaVisualizarResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VentanaVisualizarResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VentanaVisualizarResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VentanaVisualizarResponsable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /*
     * Create and display the form
     */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VentanaVisualizarResponsable().setVisible(true);
      }
    });
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
