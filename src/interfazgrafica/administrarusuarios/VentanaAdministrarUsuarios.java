/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica.administrarusuarios;

import CentroComputo.*;
import centrocomputo.interfaz.*;
import centrocomputo.inventario.*;
import interfazgrafica.menujefecentrocomputo.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import repositorio.dataaccesobject.*;
import repositorio.interfaz.*;

/**
 *
 * @author Alberto Sánchez
 */
public class VentanaAdministrarUsuarios extends javax.swing.JFrame {

  String identificadorFila = null;
  InventarioUsuarioInterface inventarioUsuario;
  VentanaMenuJefeCentroComputo ventanaMenu = null;
  private static VentanaAdministrarUsuarios ventanaCrudUsuarios = null;
  private static final int USUARIONOSELECCIONADO = 1;
  private static final int USUARIODESHABILITADO = 2;
  private static final int PROCESONOTERMINADO = 3;
  String rolNecesario = "JCC";

  /**
   * Creates new form VentanaAdministrarResponsables
   * @param ventanaMenu
   * @param inventarioUsuario
   */
  public VentanaAdministrarUsuarios(VentanaMenuJefeCentroComputo ventanaMenu, InventarioUsuarioInterface inventarioUsuario) {
    this.inventarioUsuario = inventarioUsuario;
    this.ventanaMenu = ventanaMenu;
    this.ventanaCrudUsuarios = ventanaCrudUsuarios;
    initComponents();
    if (asignaTabla() == true) {
      alistarModelo();
    }
  }
  
  public String getIdentificadorFila() {
    return identificadorFila;
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
    jScrollPaneAdministrarUsuarios = new javax.swing.JScrollPane();
    jTableUsuarios = new javax.swing.JTable();
    jLabelAñadir = new javax.swing.JLabel();
    jLabelVer = new javax.swing.JLabel();
    jLabelEditar = new javax.swing.JLabel();
    jLabelEliminar = new javax.swing.JLabel();
    jLabelRegresar = new javax.swing.JLabel();
    jLabelEtiquetaRegresar = new javax.swing.JLabel();
    jLabelEtiquetaAdministrarUsuarios = new javax.swing.JLabel();
    jLabelLogoCc = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    addComponentListener(new java.awt.event.ComponentAdapter() {
      public void componentShown(java.awt.event.ComponentEvent evt) {
        formComponentShown(evt);
      }
    });
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
    jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {},
        {},
        {},
        {}
      },
      new String [] {

      }
    ));
    jScrollPaneAdministrarUsuarios.setViewportView(jTableUsuarios);

    jPanelMenu.add(jScrollPaneAdministrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 460, 280));

    jLabelAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelAñadir.png"))); // NOI18N
    jLabelAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelAñadirMouseClicked(evt);
      }
    });
    jPanelMenu.add(jLabelAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

    jLabelVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelVerMas.png"))); // NOI18N
    jLabelVer.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelVerMouseClicked(evt);
      }
    });
    jPanelMenu.add(jLabelVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

    jLabelEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelEditar.png"))); // NOI18N
    jLabelEditar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelEditarMouseClicked(evt);
      }
    });
    jPanelMenu.add(jLabelEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

    jLabelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelCerrar.png"))); // NOI18N
    jLabelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelEliminarMouseClicked(evt);
      }
    });
    jPanelMenu.add(jLabelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

    jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelBack.png"))); // NOI18N
    jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelRegresarMouseClicked(evt);
      }
    });
    jPanelMenu.add(jLabelRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

    jLabelEtiquetaRegresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabelEtiquetaRegresar.setText("Regresar");
    jPanelMenu.add(jLabelEtiquetaRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

    jLabelEtiquetaAdministrarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabelEtiquetaAdministrarUsuarios.setText("Administrar Usuarios ");
    jPanelMenu.add(jLabelEtiquetaAdministrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

    jLabelLogoCc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelLogoPequeñoCc.png"))); // NOI18N
    jPanelMenu.add(jLabelLogoCc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

    getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jLabelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMouseClicked
    this.setVisible(false);
    this.dispose();
    this.ventanaMenu.setVisible(true);
  }//GEN-LAST:event_jLabelRegresarMouseClicked

  private void jLabelAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAñadirMouseClicked
    creaPantallaAñadirUsuario();
  }//GEN-LAST:event_jLabelAñadirMouseClicked

  private void jLabelVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVerMouseClicked
    seleccionUsuario();
    if (identificadorFila != null) {
    creaPantallaVisualizar();
    }
  }//GEN-LAST:event_jLabelVerMouseClicked

  private void jLabelEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditarMouseClicked
    seleccionUsuario();
    if (identificadorFila != null) {
      creaPantallaModificar();
    }
  }//GEN-LAST:event_jLabelEditarMouseClicked

  private void jLabelEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEliminarMouseClicked
    seleccionUsuario();
    if (identificadorFila != null){
      int respuesta = JOptionPane.showConfirmDialog(VentanaAdministrarUsuarios.this, 
              "Deseas deshabilitar al usuario seleccionado?", "Deshabilitar usuario",
              JOptionPane.INFORMATION_MESSAGE);
    if (respuesta == JOptionPane.YES_OPTION) {
      if (VentanaAdministrarUsuarios.this.inventarioUsuario.eliminaUsuario(identificadorFila)) {
        despliegaAviso(USUARIODESHABILITADO);
      } else {
        despliegaAviso(PROCESONOTERMINADO);
      }
    }
   }
  }//GEN-LAST:event_jLabelEliminarMouseClicked

  private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    actualizaLista();
  }//GEN-LAST:event_formComponentShown
  
  private void seleccionUsuario() {
    try {
      identificadorFila = (String) jTableUsuarios.getModel().getValueAt(jTableUsuarios.getSelectedRow(), 0);
    } catch (ArrayIndexOutOfBoundsException Exception) {
      despliegaAviso(USUARIONOSELECCIONADO);
    }
  }
  
  private void despliegaAviso(int tipoAdvertencia) {

    switch (tipoAdvertencia) {
    case 1:
      JOptionPane.showMessageDialog(VentanaAdministrarUsuarios.this,
              "No haz seleccionado un usuario", "Advertencia", JOptionPane.ERROR_MESSAGE);
      break;
      
      case 2:
      JOptionPane.showMessageDialog(VentanaAdministrarUsuarios.this,
              "Usuario ha sido deshabilitado", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
      break;
      
      case 3:
      JOptionPane.showMessageDialog(VentanaAdministrarUsuarios.this,
              "Proceso no pudo ser terminado", "Advertencia", JOptionPane.ERROR_MESSAGE);
      break;

    default:
      break;
    }
  }
  
  private void creaPantallaAñadirUsuario() {
    AccesoDatosUsuarioInterface repositorioUsuario = new AccesoDatosUsuario();
    InventarioUsuarioInterface inventarioUsuario = InventarioUsuario.obtieneInstancia(repositorioUsuario);
    VentanaAñadirUsuario ventanaAgregarUsuarios = new VentanaAñadirUsuario(this, inventarioUsuario);
    ventanaAgregarUsuarios.setLocationRelativeTo(null);
    this.setVisible(false);
    ventanaAgregarUsuarios.setVisible(true);
  }
  
  private void creaPantallaModificar() {
    AccesoDatosUsuarioInterface repositorioUsuario = new AccesoDatosUsuario();
    InventarioUsuarioInterface inventarioUsuario = InventarioUsuario.obtieneInstancia(repositorioUsuario);
    VentanaModificarUsuario ventanaModificarUsuarios = new VentanaModificarUsuario(this, inventarioUsuario);
    ventanaModificarUsuarios.setLocationRelativeTo(null);
    this.setVisible(false);
    ventanaModificarUsuarios.setVisible(true);
  }
  
  private void creaPantallaVisualizar() {
    AccesoDatosUsuarioInterface repositorioUsuario = new AccesoDatosUsuario();
    InventarioUsuarioInterface inventarioUsuario = InventarioUsuario.obtieneInstancia(repositorioUsuario);
    VentanaVisualizarUsuario ventanaVisualizarUsuario = new VentanaVisualizarUsuario(this, inventarioUsuario);
    ventanaVisualizarUsuario.setLocationRelativeTo(null);
    this.setVisible(false);
    ventanaVisualizarUsuario.setVisible(true);
  }
   
  private DefaultTableModel llenaModelo() {
        DefaultTableModel modelUsuarios = new DefaultTableModel(
        new Object[][] {}, new String[] {"Identificador", "Nombres",
          "Apellidos", "Correo Institucional"});
    List<Usuario> listaUsuarios = 
            VentanaAdministrarUsuarios.this.inventarioUsuario.regresaListaUsuario();
        if (listaUsuarios == null || listaUsuarios.isEmpty()) {
         return null; 
        }
        for (Usuario usuario : listaUsuarios) {
          String identificador = usuario.getIdentificador();
          String nombres = usuario.getNombres();
          String apellidos = usuario.getApellido();
          String correo = usuario.getCorreoInstitucional();
          modelUsuarios.addRow(new String[]{identificador, nombres, apellidos,correo});
      }
        return modelUsuarios;
  }
  
  private boolean asignaTabla() {
    DefaultTableModel modeloUsuarios = VentanaAdministrarUsuarios.this.llenaModelo();
    if (modeloUsuarios == null) {
      return false;
    } else {
      jTableUsuarios.setModel(modeloUsuarios);
      return true;
    }
  }
  
  private void actualizaLista(){
   if (asignaTabla() == true) {
      alistarModelo();
      identificadorFila = null;
    }
   identificadorFila = null;
  }
  
  private void alistarModelo(){
    jTableUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    jTableUsuarios.setDefaultEditor(Object.class, null);
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabelAñadir;
  private javax.swing.JLabel jLabelEditar;
  private javax.swing.JLabel jLabelEliminar;
  private javax.swing.JLabel jLabelEtiquetaAdministrarUsuarios;
  private javax.swing.JLabel jLabelEtiquetaRegresar;
  private javax.swing.JLabel jLabelLogoCc;
  private javax.swing.JLabel jLabelRegresar;
  private javax.swing.JLabel jLabelVer;
  private javax.swing.JPanel jPanelMenu;
  private javax.swing.JScrollPane jScrollPaneAdministrarUsuarios;
  private javax.swing.JTable jTableUsuarios;
  // End of variables declaration//GEN-END:variables

}
