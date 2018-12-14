/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica.administrarusuarios;

import CentroComputo.*;
import centrocomputo.interfaz.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Alberto Sánchez
 */
public class VentanaAñadirUsuario extends javax.swing.JFrame {
  
  private static final int NUMEROMAXIMOACEPTADO = 25;
  private static final int INGRESOSATISFACTORIO = 1;
  private static final int DATOSINVALIDOS = 2;
  private static final int INGRESOINVALIDO = 3;
  InventarioUsuarioInterface inventarioUsuario;
  VentanaAdministrarUsuarios ventanaCrudUsuarios = null;
  private static VentanaAñadirUsuario ventanaAgregar = null;
  ArrayList<JTextField> textFields = new ArrayList<>();
  String rolNecesario = "JCC";
  
  /**
   * Creates new form VentanaAñadirUsuario
   */
  VentanaAñadirUsuario(VentanaAdministrarUsuarios ventanaCrudUsuarios, InventarioUsuarioInterface inventarioUsuario) {
    this.inventarioUsuario = inventarioUsuario;
    this.ventanaAgregar = ventanaAgregar;
    this.ventanaCrudUsuarios = ventanaCrudUsuarios;
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

    jLabelEtiquetaAdministrarUsuarios = new javax.swing.JLabel();
    jPanelAñadir = new javax.swing.JPanel();
    jLabelNombre = new javax.swing.JLabel();
    jLabelApellido = new javax.swing.JLabel();
    jLabelNumeroPersonal = new javax.swing.JLabel();
    jLabelTelefono = new javax.swing.JLabel();
    jLabelCorreo = new javax.swing.JLabel();
    jTextFieldNombre = new javax.swing.JTextField();
    jTextFieldCorreo = new javax.swing.JTextField();
    jTextFieldNumeroPersonal = new javax.swing.JTextField();
    jButtonGuardar = new javax.swing.JButton();
    jTextFieldApellido = new javax.swing.JTextField();
    jLabelEtiquetaRegresar = new javax.swing.JLabel();
    jTextFieldTelefono = new javax.swing.JTextField();
    jLabelRegresar = new javax.swing.JLabel();
    jLabelEtiquetaAñadirUsuarios = new javax.swing.JLabel();
    jLabelContrasenia = new javax.swing.JLabel();
    jTextFieldContraseña = new javax.swing.JTextField();

    jLabelEtiquetaAdministrarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabelEtiquetaAdministrarUsuarios.setText("Administrar Usuarios");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));

    jPanelAñadir.setBackground(new java.awt.Color(255, 255, 255));

    jLabelNombre.setText("Nombre(s):");

    jLabelApellido.setText("Apellido(s):");

    jLabelNumeroPersonal.setText("No. personal:");

    jLabelTelefono.setText("Telefono:");

    jLabelCorreo.setText("Correo:");

    jButtonGuardar.setText("Guardar");
    jButtonGuardar.setBorder(null);
    jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonGuardarMouseClicked(evt);
      }
    });

    jLabelEtiquetaRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelEtiquetaRegresar.setText("Regresar");

    jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelBack.png"))); // NOI18N
    jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelRegresarMouseClicked(evt);
      }
    });

    jLabelEtiquetaAñadirUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelEtiquetaAñadirUsuarios.setText("Añadir Usuario (TA)");

    jLabelContrasenia.setText("Contraseña:");

    javax.swing.GroupLayout jPanelAñadirLayout = new javax.swing.GroupLayout(jPanelAñadir);
    jPanelAñadir.setLayout(jPanelAñadirLayout);
    jPanelAñadirLayout.setHorizontalGroup(
      jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelAñadirLayout.createSequentialGroup()
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanelAñadirLayout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jLabelRegresar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelEtiquetaRegresar))
          .addGroup(jPanelAñadirLayout.createSequentialGroup()
            .addGap(117, 117, 117)
            .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanelAñadirLayout.createSequentialGroup()
            .addGap(65, 65, 65)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabelApellido)
              .addComponent(jLabelNombre)
              .addComponent(jLabelNumeroPersonal)
              .addComponent(jLabelContrasenia)
              .addComponent(jLabelTelefono)
              .addComponent(jLabelCorreo))
            .addGap(18, 18, 18)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTextFieldNumeroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(jPanelAñadirLayout.createSequentialGroup()
            .addGap(101, 101, 101)
            .addComponent(jLabelEtiquetaAñadirUsuarios)))
        .addContainerGap(79, Short.MAX_VALUE))
    );
    jPanelAñadirLayout.setVerticalGroup(
      jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelAñadirLayout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabelRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabelEtiquetaRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabelEtiquetaAñadirUsuarios)
        .addGap(24, 24, 24)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelNombre)
          .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelApellido)
          .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(13, 13, 13)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelContrasenia)
          .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelNumeroPersonal)
          .addComponent(jTextFieldNumeroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelTelefono))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelCorreo)
          .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(23, 23, 23))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanelAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanelAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jLabelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMouseClicked
    regresaVentana();
  }//GEN-LAST:event_jLabelRegresarMouseClicked

  private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked
    this.textFields = this.regresaListaTextBox();
    if (!listaTextBoxEsValida(textFields)) {
      despliegaAviso(DATOSINVALIDOS);
    } else {
      if (añadeUsuario(obtieneValoresTextBox())) {
        despliegaAviso(INGRESOSATISFACTORIO);
      } else {
        despliegaAviso(INGRESOINVALIDO);
      }
    }
  }//GEN-LAST:event_jButtonGuardarMouseClicked
  
  private void despliegaAviso(int tipoAdvertencia) {

    switch (tipoAdvertencia) {
    case 1:
      JOptionPane.showMessageDialog(VentanaAñadirUsuario.this,
              "EL usuario ha sido agregado satisfactoriamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
      this.limpiaCampos();
      break;

    case 2:
      JOptionPane.showMessageDialog(VentanaAñadirUsuario.this,
              "Los datos del usuario son inválidos o estaban vacíos", "Advertencia", JOptionPane.WARNING_MESSAGE);
      this.limpiaCampos();
      break;

    case 3:
      JOptionPane.showMessageDialog(VentanaAñadirUsuario.this,
              "No se ha podido ingresar el usuario", "Advertencia", JOptionPane.ERROR_MESSAGE);
      this.limpiaCampos();
      break;

    default:
      break;
    }
  }
   
  private void regresaVentana() {
    this.setVisible(false);
    this.dispose();
    this.ventanaCrudUsuarios.setVisible(true);
  }
  
  private boolean añadeUsuario(Usuario usuarioPorAñadir) {
    if (VentanaAñadirUsuario.this.inventarioUsuario.guardaUsuario(usuarioPorAñadir) == true) {
      return true;
    } else {
      return false;
    }
  }
  
  private Usuario obtieneValoresTextBox(){
    Usuario usuario = new Usuario();
    usuario.setNombres(this.jTextFieldNombre.getText());
    usuario.setApellido(this.jTextFieldApellido.getText());
    usuario.setContrasenia(this.jTextFieldContraseña.getText());
    usuario.setRolTecnicoAcademico();
    usuario.setIdentificador(this.jTextFieldNumeroPersonal.getText());
    usuario.setTelefonoConExtension(this.jTextFieldTelefono.getText());
    usuario.setCorreoInstitucional(this.jTextFieldCorreo.getText());
    return usuario;
  }
  
  private ArrayList<JTextField> regresaListaTextBox(){
     ArrayList<JTextField> textFields = new ArrayList<>();
            textFields.add(jTextFieldNombre);
            textFields.add(jTextFieldApellido);
            textFields.add(jTextFieldNumeroPersonal);
            textFields.add(jTextFieldTelefono);
            textFields.add(jTextFieldCorreo);
            textFields.add(jTextFieldContraseña);
            return textFields;
  }
  
  private boolean listaTextBoxEsValida(ArrayList<JTextField> textFields) {
    for (JTextField textbox : textFields) {
            if (textbox.getText().trim().isEmpty() || 
                    textbox.getText().toString().length() > NUMEROMAXIMOACEPTADO) {
                return false;  
            }
        }
    return true;
  }
 
  private void limpiaCampos() {
    for (JTextField textbox : this.textFields) {
      textbox.setText("");
    }
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonGuardar;
  private javax.swing.JLabel jLabelApellido;
  private javax.swing.JLabel jLabelContrasenia;
  private javax.swing.JLabel jLabelCorreo;
  private javax.swing.JLabel jLabelEtiquetaAdministrarUsuarios;
  private javax.swing.JLabel jLabelEtiquetaAñadirUsuarios;
  private javax.swing.JLabel jLabelEtiquetaRegresar;
  private javax.swing.JLabel jLabelNombre;
  private javax.swing.JLabel jLabelNumeroPersonal;
  private javax.swing.JLabel jLabelRegresar;
  private javax.swing.JLabel jLabelTelefono;
  private javax.swing.JPanel jPanelAñadir;
  private javax.swing.JTextField jTextFieldApellido;
  private javax.swing.JTextField jTextFieldContraseña;
  private javax.swing.JTextField jTextFieldCorreo;
  private javax.swing.JTextField jTextFieldNombre;
  private javax.swing.JTextField jTextFieldNumeroPersonal;
  private javax.swing.JTextField jTextFieldTelefono;
  // End of variables declaration//GEN-END:variables
}
