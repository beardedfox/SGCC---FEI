/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import centrocomputo.interfaz.InventarioUsuarioInterface;
import centrocomputo.inventario.*;
import interfazgrafica.iniciarsesion.VentanaIniciarSesion;
import repositorio.dataaccesobject.*;
import repositorio.interfaz.*;

/**
 *
 * @author ValeriaBerenice
 */
public class CentroComputo {

  InventarioUsuarioInterface inventarioUsuario;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    inicializarVentanaInicio();
  }

  public static void inicializarVentanaInicio() {
    AccesoDatosUsuarioInterface repo = new AccesoDatosUsuario();
    InventarioUsuarioInterface inventario = InventarioUsuario.obtieneInstancia(repo);
    VentanaIniciarSesion ventanaInicio = new VentanaIniciarSesion(inventario);
    ventanaInicio.setLocationRelativeTo(null);
    ventanaInicio.setVisible(true);
  }
}
