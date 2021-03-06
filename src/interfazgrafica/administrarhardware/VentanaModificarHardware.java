/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica.administrarhardware;

import CentroComputo.*;
import centrocomputo.interfaz.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Alberto Sánchez
 */
public class VentanaModificarHardware extends javax.swing.JFrame {
  
  private static final int NUMEROMAXIMOACEPTADO = 25;
  private static final int INGRESOSATISFACTORIO = 1;
  private static final int DATOSINVALIDOS = 2;
  private static final int INGRESOINVALIDO = 3;
  private static final int NOSEPUDORECUPERAR = 4;
  InventarioHardwareInterface inventarioHardware;
  VentanaAdministrarHardware ventanaCrudHardware = null;
  private static VentanaModificarHardware ventanaModificar = null;
  ArrayList<JTextField> textFields = new ArrayList<>();
  private String identificadorFila = null;
  String rolNecesario = "JCC";

  /**
   * Creates new form VentanaModificarHardware
   */
  VentanaModificarHardware(VentanaAdministrarHardware ventanaCrudHardware, InventarioHardwareInterface inventarioHardware) {
    this.inventarioHardware = inventarioHardware;
    this.ventanaModificar = ventanaModificar;
    this.ventanaCrudHardware = ventanaCrudHardware;
    identificadorFila = ventanaCrudHardware.getIdentificadorFila();
    initComponents();
    if (!asignaValores()){
      despliegaAviso(NOSEPUDORECUPERAR);
    }
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
    jLabelMarca = new javax.swing.JLabel();
    jLabelTipo = new javax.swing.JLabel();
    jLabelFecha = new javax.swing.JLabel();
    jLabelTipo2 = new javax.swing.JLabel();
    jTextFieldMarca = new javax.swing.JTextField();
    jLabelModelo = new javax.swing.JLabel();
    jLabelNumeroSerie = new javax.swing.JLabel();
    jLabelUbicacion = new javax.swing.JLabel();
    jLabelPartes = new javax.swing.JLabel();
    jTextFieldNumeroSerie = new javax.swing.JTextField();
    jTextFieldModelo = new javax.swing.JTextField();
    jButtonGuardar = new javax.swing.JButton();
    jComboBoxPartes = new javax.swing.JComboBox<>();
    jComboBoxUbicacion = new javax.swing.JComboBox<>();
    jComboBoxTipo = new javax.swing.JComboBox<>();
    dateChooserComboFechaAadquisicion = new com.toedter.calendar.JDateChooser();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanelAñadir.setBackground(new java.awt.Color(255, 255, 255));

    jLabelRegresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazgrafica/imagenes/LabelBack.png"))); // NOI18N
    jLabelRegresar1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelRegresar1MouseClicked(evt);
      }
    });

    jLabelEtiquetaRegresar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabelEtiquetaRegresar1.setText("Regresar");

    jLabelEtiquetaModificarHardware.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabelEtiquetaModificarHardware.setText("Modificar hardware");

    jLabelMarca.setText("Marca:");

    jLabelTipo.setText("Tipo:");

    jLabelFecha.setText("Fecha Adquisición:");

    jLabelModelo.setText("Modelo:");

    jLabelNumeroSerie.setText("No. serie:");

    jLabelUbicacion.setText("Ubicacion:");

    jLabelPartes.setText("Partes:");

    jButtonGuardar.setText("Guardar");
    jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButtonGuardarMouseClicked(evt);
      }
    });

    jComboBoxPartes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completo", "Incompleto", " " }));

    jComboBoxUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Area de apoyo técnico ", "Area de impresiones", "Aula cc4", "Aula cc3 ", "Aula cc2 ", "Aula cc1" }));

    jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monitor ", "Tarjeta madre", "Procesador ", "Memoria Ram ", "Unidad de energía ", "Disco duro sólido", "Disco duro", "Teclado ", "Mouse", " " }));

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
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabelTipo)
                .addComponent(jLabelMarca)
                .addComponent(jLabelFecha, javax.swing.GroupLayout.Alignment.LEADING))
              .addComponent(jLabelPartes))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jTextFieldMarca)
              .addComponent(jComboBoxTipo, 0, 1, Short.MAX_VALUE)
              .addComponent(dateChooserComboFechaAadquisicion, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
              .addComponent(jComboBoxPartes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanelAñadirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabelNumeroSerie)
                  .addComponent(jLabelModelo)))
              .addGroup(jPanelAñadirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelUbicacion)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jTextFieldModelo)
              .addComponent(jTextFieldNumeroSerie)
              .addComponent(jComboBoxUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAñadirLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAñadirLayout.createSequentialGroup()
            .addComponent(jLabelEtiquetaModificarHardware)
            .addGap(168, 168, 168))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAñadirLayout.createSequentialGroup()
            .addComponent(jButtonGuardar)
            .addGap(180, 180, 180))))
    );
    jPanelAñadirLayout.setVerticalGroup(
      jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAñadirLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabelRegresar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabelEtiquetaRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(2, 2, 2)
        .addComponent(jLabelEtiquetaModificarHardware)
        .addGap(26, 26, 26)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelModelo)
          .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelMarca))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabelNumeroSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
            .addComponent(jLabelTipo)
            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jTextFieldNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanelAñadirLayout.createSequentialGroup()
            .addComponent(dateChooserComboFechaAadquisicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanelAñadirLayout.createSequentialGroup()
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabelUbicacion)
              .addComponent(jComboBoxUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanelAñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabelPartes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jComboBoxPartes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(30, 30, 30)))
        .addComponent(jButtonGuardar)
        .addGap(46, 46, 46)
        .addComponent(jLabelTipo2)
        .addGap(31, 31, 31))
    );

    getContentPane().add(jPanelAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked
    this.textFields = this.regresaListaTextBox();
    if (!listaTextBoxEsValida(textFields)|| !validaFechaIngresada()) {
      despliegaAviso(DATOSINVALIDOS);
    } else {
      if (actualizaHardware(obtieneValoresTextBox())) {
        despliegaAviso(INGRESOSATISFACTORIO);
      } else {
        despliegaAviso(INGRESOINVALIDO);
      }
    }
  }//GEN-LAST:event_jButtonGuardarMouseClicked

  private void jLabelRegresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegresar1MouseClicked
    regresaVentana();
  }//GEN-LAST:event_jLabelRegresar1MouseClicked

  private void regresaVentana() {
    this.setVisible(false);
    this.dispose();
    this.ventanaCrudHardware.setVisible(true);
  }
  
     private void despliegaAviso(int tipoAdvertencia) {

    switch (tipoAdvertencia) {
    case 1:
      JOptionPane.showMessageDialog(VentanaModificarHardware.this,
              "EL hardware ha sido modificado satisfactoriamente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
      this.limpiaCampos();
      regresaVentana();
      break;

    case 2:
      JOptionPane.showMessageDialog(VentanaModificarHardware.this,
              "Los datos del hardware son inválidos o estaban vacíos", "Advertencia", JOptionPane.WARNING_MESSAGE);
      this.limpiaCampos();
      regresaVentana();
      break;

    case 3:
      JOptionPane.showMessageDialog(VentanaModificarHardware.this,
              "No se ha podido ingresar el hardware", "Advertencia", JOptionPane.ERROR_MESSAGE);
      this.limpiaCampos();
      regresaVentana();
      break;
      
      case 4:
      JOptionPane.showMessageDialog(this.ventanaCrudHardware,
              "No se ha podido recuperar la información del hardware", "Advertencia", JOptionPane.WARNING_MESSAGE);
      regresaVentana();
      break;

    default:
      break;
    }
  }
     
     private boolean actualizaHardware(Hardware hardwarePorAñadir) {
    if (VentanaModificarHardware.this.inventarioHardware.actualizaHardware(hardwarePorAñadir)) {
      return true;
    } else {
      return false;
    }
  }
    
  private boolean asignaValores(){
    Hardware hardware = VentanaModificarHardware.this.inventarioHardware.buscaHardware(identificadorFila);
    if (hardware!= null) {
    this.jTextFieldNumeroSerie.setText(hardware.getNumeroSerie());
    this.jTextFieldMarca.setText(hardware.getMarca());
    this.jTextFieldModelo.setText(hardware.getModelo());
    this.jComboBoxPartes.setSelectedItem(hardware.getPartesdispositivo());
    this.jComboBoxTipo.setSelectedItem(hardware.getTipoDispositivo());
    this.jComboBoxUbicacion.setSelectedItem(hardware.getUbicacion());
    return true;
    }
    return false;
  }
  
  private Hardware obtieneValoresTextBox(){
    Hardware hardware = new Hardware();
    hardware.setNumeroInventario(identificadorFila);
    hardware.setNumeroSerie(this.jTextFieldNumeroSerie.getText());
    hardware.setMarca(this.jTextFieldMarca.getText());
    hardware.setModelo(this.jTextFieldModelo.getText());
    hardware.setTipoDispositivo(this.jComboBoxTipo.getSelectedItem().toString());
    hardware.setPartesdispositivo(this.jComboBoxPartes.getSelectedItem().toString());
    hardware.setUbicacion(this.jComboBoxUbicacion.getSelectedItem().toString());
    return hardware;
  }
  
  private ArrayList<JTextField> regresaListaTextBox(){
     ArrayList<JTextField> textFields = new ArrayList<>();
            textFields.add(jTextFieldNumeroSerie);
            textFields.add(jTextFieldMarca);
            textFields.add(jTextFieldModelo);
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
  
  private boolean validaFechaIngresada(){
    if (this.dateChooserComboFechaAadquisicion.getDate()== null){
      return false;
    }
    return true;
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private com.toedter.calendar.JDateChooser dateChooserComboFechaAadquisicion;
  private javax.swing.JButton jButtonGuardar;
  private javax.swing.JComboBox<String> jComboBoxPartes;
  private javax.swing.JComboBox<String> jComboBoxTipo;
  private javax.swing.JComboBox<String> jComboBoxUbicacion;
  private javax.swing.JLabel jLabelEtiquetaModificarHardware;
  private javax.swing.JLabel jLabelEtiquetaRegresar1;
  private javax.swing.JLabel jLabelFecha;
  private javax.swing.JLabel jLabelMarca;
  private javax.swing.JLabel jLabelModelo;
  private javax.swing.JLabel jLabelNumeroSerie;
  private javax.swing.JLabel jLabelPartes;
  private javax.swing.JLabel jLabelRegresar1;
  private javax.swing.JLabel jLabelTipo;
  private javax.swing.JLabel jLabelTipo2;
  private javax.swing.JLabel jLabelUbicacion;
  private javax.swing.JPanel jPanelAñadir;
  private javax.swing.JTextField jTextFieldMarca;
  private javax.swing.JTextField jTextFieldModelo;
  private javax.swing.JTextField jTextFieldNumeroSerie;
  // End of variables declaration//GEN-END:variables
}
