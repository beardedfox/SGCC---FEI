/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica.administrarhardware;

/**
 *
 * @author Alberto Sánchez
 */
public class VentanaModificarHardware extends javax.swing.JFrame {

  /**
   * Creates new form VentanaModificarHardware
   */
  public VentanaModificarHardware() {
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

    jPanelAñadir = new javax.swing.JPanel();
    jLabelRegresar1 = new javax.swing.JLabel();
    jLabelEtiquetaRegresar1 = new javax.swing.JLabel();
    jLabelEtiquetaModificarHardware = new javax.swing.JLabel();
    jLabelNumeroInventario = new javax.swing.JLabel();
    jLabelMarca = new javax.swing.JLabel();
    jLabelResponsable = new javax.swing.JLabel();
    jLabelTipo = new javax.swing.JLabel();
    jLabelFecha = new javax.swing.JLabel();
    jLabelTipo2 = new javax.swing.JLabel();
    jTextFieldNumeroInventario = new javax.swing.JTextField();
    jTextFieldMarca = new javax.swing.JTextField();
    jLabelModelo = new javax.swing.JLabel();
    jLabelNumeroSerie = new javax.swing.JLabel();
    jLabelUbicacion = new javax.swing.JLabel();
    jLabelEstado = new javax.swing.JLabel();
    jLabelPartes = new javax.swing.JLabel();
    jTextFieldPartes = new javax.swing.JTextField();
    jTextFieldUbicacion = new javax.swing.JTextField();
    jTextFieldNumeroSerie = new javax.swing.JTextField();
    jTextFieldModelo = new javax.swing.JTextField();
    jComboBoxResponsable = new javax.swing.JComboBox<>();
    jComboBoxTipo = new javax.swing.JComboBox<>();
    jComboBoxEstado = new javax.swing.JComboBox<>();
    dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
    jButtonGuardar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanelAñadir.setBackground(new java.awt.Color(255, 255, 255));

    jLabelRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelBack.png"))); // NOI18N

    jLabelEtiquetaRegresar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelEtiquetaRegresar1.setText("Regresar");

    jLabelEtiquetaModificarHardware.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabelEtiquetaModificarHardware.setText("Modificar hardware");

    jLabelNumeroInventario.setText("No. inventario:");

    jLabelMarca.setText("Marca:");

    jLabelResponsable.setText("Responsable:");

    jLabelTipo.setText("Tipo:");

    jLabelFecha.setText("Fecha Adquisición:");

    jLabelModelo.setText("Modelo:");

    jLabelNumeroSerie.setText("No. serie:");

    jLabelUbicacion.setText("Ubicacion:");

    jLabelEstado.setText("Estado:");

    jLabelPartes.setText("Partes:");

    jComboBoxResponsable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jButtonGuardar.setText("Guardar");

    javax.swing.GroupLayout jPanelAñadirLayout = new javax.swing.GroupLayout(jPanelAñadir);
    jPanelAñadir.setLayout(jPanelAñadirLayout);
    jPanelAñadirLayout.setHorizontalGroup(
      jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelAñadirLayout.createSequentialGroup()
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanelAñadirLayout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jLabelRegresar1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelTipo2)
              .addComponent(jLabelEtiquetaRegresar1)))
          .addGroup(jPanelAñadirLayout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabelTipo)
                .addComponent(jLabelResponsable)
                .addComponent(jLabelMarca)
                .addComponent(jLabelFecha, javax.swing.GroupLayout.Alignment.LEADING))
              .addComponent(jLabelNumeroInventario, javax.swing.GroupLayout.Alignment.TRAILING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jTextFieldNumeroInventario)
              .addComponent(jTextFieldMarca)
              .addComponent(jComboBoxResponsable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanelAñadirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabelNumeroSerie)
                  .addComponent(jLabelModelo)
                  .addComponent(jLabelEstado)
                  .addComponent(jLabelPartes)))
              .addGroup(jPanelAñadirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelUbicacion)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jTextFieldModelo)
              .addComponent(jTextFieldNumeroSerie)
              .addComponent(jTextFieldUbicacion)
              .addComponent(jTextFieldPartes)
              .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(59, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAñadirLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAñadirLayout.createSequentialGroup()
            .addComponent(jLabelEtiquetaModificarHardware)
            .addGap(168, 168, 168))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAñadirLayout.createSequentialGroup()
            .addComponent(jButtonGuardar)
            .addGap(194, 194, 194))))
    );
    jPanelAñadirLayout.setVerticalGroup(
      jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAñadirLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanelAñadirLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jButtonGuardar))
          .addGroup(jPanelAñadirLayout.createSequentialGroup()
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabelRegresar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabelEtiquetaRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(2, 2, 2)
            .addComponent(jLabelEtiquetaModificarHardware)
            .addGap(26, 26, 26)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabelNumeroInventario)
              .addComponent(jTextFieldNumeroInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelModelo)
              .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelNumeroSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelMarca)
                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabelUbicacion)
              .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jComboBoxResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelResponsable))
            .addGap(13, 13, 13)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabelTipo)
              .addComponent(jLabelEstado)
              .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(15, 15, 15)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanelAñadirLayout.createSequentialGroup()
                .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabelPartes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jTextFieldPartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
              .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE))
            .addGap(40, 40, 40)
            .addComponent(jLabelTipo2)))
        .addGap(31, 31, 31))
    );

    getContentPane().add(jPanelAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
      java.util.logging.Logger.getLogger(VentanaModificarHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VentanaModificarHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VentanaModificarHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VentanaModificarHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /*
     * Create and display the form
     */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VentanaModificarHardware().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private datechooser.beans.DateChooserCombo dateChooserCombo2;
  private javax.swing.JButton jButtonGuardar;
  private javax.swing.JComboBox<String> jComboBoxEstado;
  private javax.swing.JComboBox<String> jComboBoxResponsable;
  private javax.swing.JComboBox<String> jComboBoxTipo;
  private javax.swing.JLabel jLabelEstado;
  private javax.swing.JLabel jLabelEtiquetaModificarHardware;
  private javax.swing.JLabel jLabelEtiquetaRegresar1;
  private javax.swing.JLabel jLabelFecha;
  private javax.swing.JLabel jLabelMarca;
  private javax.swing.JLabel jLabelModelo;
  private javax.swing.JLabel jLabelNumeroInventario;
  private javax.swing.JLabel jLabelNumeroSerie;
  private javax.swing.JLabel jLabelPartes;
  private javax.swing.JLabel jLabelRegresar1;
  private javax.swing.JLabel jLabelResponsable;
  private javax.swing.JLabel jLabelTipo;
  private javax.swing.JLabel jLabelTipo2;
  private javax.swing.JLabel jLabelUbicacion;
  private javax.swing.JPanel jPanelAñadir;
  private javax.swing.JTextField jTextFieldMarca;
  private javax.swing.JTextField jTextFieldModelo;
  private javax.swing.JTextField jTextFieldNumeroInventario;
  private javax.swing.JTextField jTextFieldNumeroSerie;
  private javax.swing.JTextField jTextFieldPartes;
  private javax.swing.JTextField jTextFieldUbicacion;
  // End of variables declaration//GEN-END:variables
}
