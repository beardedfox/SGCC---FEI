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
public class VentanaVisualizarHardware extends javax.swing.JFrame {
  
  String rolNecesario = "JCC";

  /**
   * Creates new form VentanaVisualizarHardware
   */
  public VentanaVisualizarHardware() {
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

    jPanelVisualizarr = new javax.swing.JPanel();
    jLabelRegresar1 = new javax.swing.JLabel();
    jLabelEtiquetaRegresar1 = new javax.swing.JLabel();
    jLabelEtiquetaVisualizarHardware = new javax.swing.JLabel();
    jLabelNumeroInventario = new javax.swing.JLabel();
    jLabelMarca = new javax.swing.JLabel();
    jLabelResponsable = new javax.swing.JLabel();
    jLabelTipo = new javax.swing.JLabel();
    jLabelFecha = new javax.swing.JLabel();
    jLabelTipo2 = new javax.swing.JLabel();
    jLabelModelo = new javax.swing.JLabel();
    jLabelNumeroSerie = new javax.swing.JLabel();
    jLabelUbicacion = new javax.swing.JLabel();
    jLabelEstado = new javax.swing.JLabel();
    jLabelPartes = new javax.swing.JLabel();
    jLabelVisualizarEntrada = new javax.swing.JLabel();
    jLabelVisualizarMarca = new javax.swing.JLabel();
    jLabelVisualizarResponsable = new javax.swing.JLabel();
    jLabelVisualizarTipo = new javax.swing.JLabel();
    jLabelVisualizarAdquisicion = new javax.swing.JLabel();
    jLabelVisualizarModelo = new javax.swing.JLabel();
    jLabelVisualizarNumeroSerie = new javax.swing.JLabel();
    jLabelVisualizarUbicacion = new javax.swing.JLabel();
    jLabelVisualizarEstado = new javax.swing.JLabel();
    jLabelVisualizarPartes = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanelVisualizarr.setBackground(new java.awt.Color(255, 255, 255));

    jLabelRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelBack.png"))); // NOI18N

    jLabelEtiquetaRegresar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelEtiquetaRegresar1.setText("Regresar");

    jLabelEtiquetaVisualizarHardware.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabelEtiquetaVisualizarHardware.setText("Visualizar hardware");

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

    jLabelVisualizarEntrada.setText("EntradaInventario");

    jLabelVisualizarMarca.setText("EntradaMarca");

    jLabelVisualizarResponsable.setText("EntradaResponsable");

    jLabelVisualizarTipo.setText("EntradaTipo");

    jLabelVisualizarAdquisicion.setText("EntradaFechaAdquisicion");

    jLabelVisualizarModelo.setText("EntradaModelo");

    jLabelVisualizarNumeroSerie.setText("EntradaNumeroSerie");

    jLabelVisualizarUbicacion.setText("EntradaUbicacion");

    jLabelVisualizarEstado.setText("EntradaEstado");

    jLabelVisualizarPartes.setText("EntradaPartes");

    javax.swing.GroupLayout jPanelVisualizarrLayout = new javax.swing.GroupLayout(jPanelVisualizarr);
    jPanelVisualizarr.setLayout(jPanelVisualizarrLayout);
    jPanelVisualizarrLayout.setHorizontalGroup(
      jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelVisualizarrLayout.createSequentialGroup()
        .addGap(42, 42, 42)
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabelTipo)
            .addComponent(jLabelResponsable)
            .addComponent(jLabelMarca)
            .addComponent(jLabelFecha, javax.swing.GroupLayout.Alignment.LEADING))
          .addComponent(jLabelNumeroInventario, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelVisualizarTipo)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelVisualizarrLayout.createSequentialGroup()
            .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabelVisualizarAdquisicion, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelVisualizarResponsable, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelVisualizarMarca, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelVisualizarEntrada, javax.swing.GroupLayout.Alignment.LEADING))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addGap(42, 42, 42)
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(jLabelUbicacion, javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVisualizarrLayout.createSequentialGroup()
              .addGap(12, 12, 12)
              .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabelPartes, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelEstado))))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelVisualizarrLayout.createSequentialGroup()
            .addGap(2, 2, 2)
            .addComponent(jLabelNumeroSerie))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelVisualizarrLayout.createSequentialGroup()
            .addGap(11, 11, 11)
            .addComponent(jLabelModelo)))
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabelVisualizarUbicacion)
          .addComponent(jLabelVisualizarEstado)
          .addComponent(jLabelVisualizarPartes)
          .addComponent(jLabelVisualizarModelo)
          .addComponent(jLabelVisualizarNumeroSerie))
        .addGap(44, 44, 44))
      .addGroup(jPanelVisualizarrLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addComponent(jLabelRegresar1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabelTipo2)
          .addComponent(jLabelEtiquetaRegresar1))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVisualizarrLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jLabelEtiquetaVisualizarHardware)
        .addGap(168, 168, 168))
    );
    jPanelVisualizarrLayout.setVerticalGroup(
      jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVisualizarrLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabelRegresar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabelEtiquetaRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(2, 2, 2)
        .addComponent(jLabelEtiquetaVisualizarHardware)
        .addGap(29, 29, 29)
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelNumeroInventario)
          .addComponent(jLabelModelo)
          .addComponent(jLabelVisualizarEntrada)
          .addComponent(jLabelVisualizarModelo))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabelNumeroSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelVisualizarNumeroSerie))
          .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabelMarca)
            .addComponent(jLabelVisualizarMarca)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelUbicacion)
          .addComponent(jLabelResponsable)
          .addComponent(jLabelVisualizarResponsable)
          .addComponent(jLabelVisualizarUbicacion))
        .addGap(19, 19, 19)
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelTipo)
          .addComponent(jLabelEstado)
          .addComponent(jLabelVisualizarTipo)
          .addComponent(jLabelVisualizarEstado))
        .addGap(18, 18, 18)
        .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabelPartes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabelVisualizarPartes))
          .addGroup(jPanelVisualizarrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelVisualizarAdquisicion)))
        .addGap(40, 40, 40)
        .addComponent(jLabelTipo2)
        .addGap(31, 31, 31))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 514, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanelVisualizarr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 296, Short.MAX_VALUE)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanelVisualizarr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
      java.util.logging.Logger.getLogger(VentanaVisualizarHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(VentanaVisualizarHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(VentanaVisualizarHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(VentanaVisualizarHardware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /*
     * Create and display the form
     */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new VentanaVisualizarHardware().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabelEstado;
  private javax.swing.JLabel jLabelEtiquetaRegresar1;
  private javax.swing.JLabel jLabelEtiquetaVisualizarHardware;
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
  private javax.swing.JLabel jLabelVisualizarAdquisicion;
  private javax.swing.JLabel jLabelVisualizarEntrada;
  private javax.swing.JLabel jLabelVisualizarEstado;
  private javax.swing.JLabel jLabelVisualizarMarca;
  private javax.swing.JLabel jLabelVisualizarModelo;
  private javax.swing.JLabel jLabelVisualizarNumeroSerie;
  private javax.swing.JLabel jLabelVisualizarPartes;
  private javax.swing.JLabel jLabelVisualizarResponsable;
  private javax.swing.JLabel jLabelVisualizarTipo;
  private javax.swing.JLabel jLabelVisualizarUbicacion;
  private javax.swing.JPanel jPanelVisualizarr;
  // End of variables declaration//GEN-END:variables
}
