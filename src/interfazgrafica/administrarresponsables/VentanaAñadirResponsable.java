/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica.administrarresponsables;

import CentroComputo.*;
import centrocomputo.interfaz.*;
import interfazgrafica.administrarusuarios.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Alberto Sánchez
 */
public class VentanaAñadirResponsable extends javax.swing.JFrame {
  
  private static final int NUMEROMAXIMOACEPTADO = 25;
  private static final int INGRESOSATISFACTORIO = 1;
  private static final int DATOSINVALIDOS = 2;
  private static final int INGRESOINVALIDO = 3;
  InventarioResponsableInterface inventarioResponsable;
  VentanaAdministrarResponsables ventanaCrudResponsables = null;
  private static VentanaAñadirResponsable ventanaAgregar = null;
  ArrayList<JTextField> textFields = new ArrayList<>();
  String rolNecesario = "JCC";

  /**
   * Creates new form VentanaAñadirResponsable
   */
  public VentanaAñadirResponsable(VentanaAdministrarResponsables ventanaCrudResponsables, InventarioResponsableInterface inventarioResponsable) {
    this.inventarioResponsable = inventarioResponsable;
    this.ventanaAgregar = ventanaAgregar;
    this.ventanaCrudResponsables = ventanaCrudResponsables;
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
    jLabelEtiquetaAñadirResponsables = new javax.swing.JLabel();
    jLabelEtiquetaRegresar = new javax.swing.JLabel();
    jLabelRegresar = new javax.swing.JLabel();
    jLabelNombre = new javax.swing.JLabel();
    jTextFieldNombre = new javax.swing.JTextField();
    jLabelNumeroPersonal = new javax.swing.JLabel();
    jTextFieldNumeroPersonal = new javax.swing.JTextField();
    jTextFieldTelefono = new javax.swing.JTextField();
    jLabelTelefono = new javax.swing.JLabel();
    jLabelCorreo = new javax.swing.JLabel();
    jTextFieldCorreo = new javax.swing.JTextField();
    jButtonGuardar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabelEtiquetaAñadirResponsables.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelEtiquetaAñadirResponsables.setText("Añadir Responsable");

    jLabelEtiquetaRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelEtiquetaRegresar.setText("Regresar");

    jLabelRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelBack.png"))); // NOI18N
    jLabelRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelRegresarMouseClicked(evt);
      }
    });

    jLabelNombre.setText("Nombre(s):");

    jLabelNumeroPersonal.setText("No. personal:");

    jLabelTelefono.setText("Telefono:");

    jLabelCorreo.setText("Correo:");

    jButtonGuardar.setText("Guardar");
    jButtonGuardar.setBorder(null);
    jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonGuardarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jLabelRegresar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelEtiquetaRegresar))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(65, 65, 65)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabelNombre)
              .addComponent(jLabelNumeroPersonal)
              .addComponent(jLabelTelefono)
              .addComponent(jLabelCorreo))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTextFieldNumeroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(82, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(jLabelEtiquetaAñadirResponsables)
            .addGap(98, 98, 98))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(110, 110, 110))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabelRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabelEtiquetaRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(9, 9, 9)
        .addComponent(jLabelEtiquetaAñadirResponsables)
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelNombre)
          .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelNumeroPersonal)
          .addComponent(jTextFieldNumeroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelTelefono)
          .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelCorreo)
          .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
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
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
    this.textFields = this.regresaListaTextBox();
    if (!listaTextBoxEsValida(textFields)) {
      despliegaAviso(DATOSINVALIDOS);
    } else {
      if (añadeResponsable(obtieneValoresTextBox())) {
        despliegaAviso(INGRESOSATISFACTORIO);
      } else {
        despliegaAviso(INGRESOINVALIDO);
      }
    }
  }//GEN-LAST:event_jButtonGuardarActionPerformed

  private void jLabelRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresarMouseClicked
    regresaVentana();
  }//GEN-LAST:event_jLabelRegresarMouseClicked

  private void despliegaAviso(int tipoAdvertencia) {

    switch (tipoAdvertencia) {
    case 1:
      JOptionPane.showMessageDialog(VentanaAñadirResponsable.this,
              "EL responsable ha sido agregado satisfactoriamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
      this.limpiaCampos();
      break;

    case 2:
      JOptionPane.showMessageDialog(VentanaAñadirResponsable.this,
              "Los datos del responsable son inválidos o estaban vacíos", "Advertencia", JOptionPane.WARNING_MESSAGE);
      this.limpiaCampos();
      break;

    case 3:
      JOptionPane.showMessageDialog(VentanaAñadirResponsable.this,
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
    this.ventanaCrudResponsables.setVisible(true);
  }
  
  private boolean añadeResponsable(Responsable responsablePorAñadir) {
    if (VentanaAñadirResponsable.this.inventarioResponsable.guardaResponsable(responsablePorAñadir)) {
      return true;
    } else {
      return false;
    }
  }
  
  private Responsable obtieneValoresTextBox(){
    Responsable responsable = new Responsable();
    responsable.setNombres(this.jTextFieldNombre.getText());
    responsable.setNumeroPersonal(this.jTextFieldNumeroPersonal.getText());
    responsable.setTelefono(this.jTextFieldTelefono.getText());
    responsable.setCorreoinstitucional(this.jTextFieldCorreo.getText());
    responsable.setEstadoActivado();
    return responsable;
  }
  
  private ArrayList<JTextField> regresaListaTextBox(){
     ArrayList<JTextField> textFields = new ArrayList<>();
            textFields.add(jTextFieldNombre);
            textFields.add(jTextFieldNumeroPersonal);
            textFields.add(jTextFieldTelefono);
            textFields.add(jTextFieldCorreo);
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
  private javax.swing.JLabel jLabelCorreo;
  private javax.swing.JLabel jLabelEtiquetaAñadirResponsables;
  private javax.swing.JLabel jLabelEtiquetaRegresar;
  private javax.swing.JLabel jLabelNombre;
  private javax.swing.JLabel jLabelNumeroPersonal;
  private javax.swing.JLabel jLabelRegresar;
  private javax.swing.JLabel jLabelTelefono;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField jTextFieldCorreo;
  private javax.swing.JTextField jTextFieldNombre;
  private javax.swing.JTextField jTextFieldNumeroPersonal;
  private javax.swing.JTextField jTextFieldTelefono;
  // End of variables declaration//GEN-END:variables
}
