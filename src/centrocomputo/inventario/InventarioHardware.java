/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package centrocomputo.inventario;

import CentroComputo.Hardware;
import centrocomputo.interfaz.InventarioHardwareInterface;
import java.util.List;
import repositorio.interfaz.AccesoDatosHardwareInterface;

/**
 * Clase Inventario hardware.
 * Clase para interactuar
 * con clases de base de datos
 * @author Alberto Sánchez
 */
public class InventarioHardware implements InventarioHardwareInterface {
  
  private AccesoDatosHardwareInterface repositorioHardware;
  private static InventarioHardware inventarioHardware = null;
  private List<Hardware> listaHardware;
  
  private InventarioHardware(AccesoDatosHardwareInterface repositorioHardware) {
    this.repositorioHardware = repositorioHardware;
  }
  
  /**
   *Constructor de Hardware.
   *Encargado de recibir datos de hardware
   *y crear un dictamen de forma óptima
   */
  public static InventarioHardware obtieneInstancia(
          AccesoDatosHardwareInterface repositorioHardware) {
    if (InventarioHardware.inventarioHardware == null) {
      InventarioHardware.inventarioHardware = new InventarioHardware(repositorioHardware);
    }
    return InventarioHardware.inventarioHardware;    
  }

  @Override
  public boolean actualizaHardware(Hardware hardware) {
    if (this.repositorioHardware.actualizaHardwareRepositorio(hardware)) {
      return true;
    }
    return false;
  }

  @Override
  public Hardware buscaHardware(String idHardware) {
    Hardware hardwareEncontrado = this.repositorioHardware.buscaHardwareRepositorio(idHardware);
    if (hardwareEncontrado == null) {
      return null;
    } else {
      return hardwareEncontrado;
    }
  }

  @Override
  public boolean eliminaHardware(String idHardware) {
    if (this.repositorioHardware.eliminaHardwareRepositorio(idHardware)) {
      return true;
    }
    return false;
  }

  @Override
  public boolean guardaHardware(Hardware hardware) {
    if (this.repositorioHardware.guardaHardwareRepositorio(hardware)) {
      return true;
    }
    return false;
  }

  @Override
  public List<Hardware> regresaListaHardware() {
    this.listaHardware = this.repositorioHardware.regresaListaHardwareRepositorio();
    if (this.listaHardware == null || this.listaHardware.isEmpty()) {
      return null;
    } else {
      return this.listaHardware;
    }
  }
  
}
