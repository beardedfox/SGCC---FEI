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
public class VentanaAdministrarHardware extends javax.swing.JFrame {

  /**
   * Creates new form VentanaAdministrarHardware
   */
  public VentanaAdministrarHardware() {
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

    jPanelMenu = new javax.swing.JPanel();
    jLabelEtiquetaRegresar = new javax.swing.JLabel();
    jLabelRegresar = new javax.swing.JLabel();
    jLabelEtiquetaAdministrarHardware = new javax.swing.JLabel();
    jLabelLogoCc = new javax.swing.JLabel();
    jScrollPanelAdministrarHardware = new javax.swing.JScrollPane();
    jTableHardaware = new javax.swing.JTable();
    jLabelAñadir = new javax.swing.JLabel();
    jLabelVer = new javax.swing.JLabel();
    jLabelEditar = new javax.swing.JLabel();
    jLabelEliminar = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
    jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabelEtiquetaRegresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabelEtiquetaRegresar.setText("Regresar");
    jPanelMenu.add(jLabelEtiquetaRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

    jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelBack.png"))); // NOI18N
    jPanelMenu.add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

    jLabelEtiquetaAdministrarHardware.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabelEtiquetaAdministrarHardware.setText("Administrar Hardware");
    jPanelMenu.add(jLabelEtiquetaAdministrarHardware, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

    jLabelLogoCc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelLogoPequeñoCc.png"))); // NOI18N
    jPanelMenu.add(jLabelLogoCc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

    jTableHardaware.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPanelAdministrarHardware.setViewportView(jTableHardaware);

    jPanelMenu.add(jScrollPanelAdministrarHardware, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 470, 260));

    jLabelAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelAñadir.png"))); // NOI18N
    jPanelMenu.add(jLabelAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

    jLabelVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelVerMas.png"))); // NOI18N
    jPanelMenu.add(jLabelVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

    jLabelEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelEditar.png"))); // NOI18N
    jPanelMenu.add(jLabelEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

    jLabelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelCerrar.png"))); // NOI18N
    jPanelMenu.add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

    getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 390));

    pack();
  }// </editor-fold>//GEN-END:initComponents


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabelAñadir;
  private javax.swing.JLabel jLabelEditar;
  private javax.swing.JLabel jLabelEliminar;
  private javax.swing.JLabel jLabelEtiquetaAdministrarHardware;
  private javax.swing.JLabel jLabelEtiquetaRegresar;
  private javax.swing.JLabel jLabelLogoCc;
  private javax.swing.JLabel jLabelRegresar;
  private javax.swing.JLabel jLabelVer;
  private javax.swing.JPanel jPanelMenu;
  private javax.swing.JScrollPane jScrollPanelAdministrarHardware;
  private javax.swing.JTable jTableHardaware;
  // End of variables declaration//GEN-END:variables
}