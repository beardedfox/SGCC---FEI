/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package centrocomputo.inventario;

import CentroComputo.Dictamen;
import CentroComputo.Hardware;
import centrocomputo.interfaz.InventarioDictamenInterface;
import repositorio.interfaz.AccesoDatosDictamenInterface;

/**
 * Clase Inventario dictamen.
 * Clase para interactuar
 * con clases de base de datos
 * @author Alberto Sánchez
 */
public class InventarioDictamen implements InventarioDictamenInterface {

  private AccesoDatosDictamenInterface repositorioDictamen;
  private static InventarioDictamen inventarioDictamen = null;
  
  private InventarioDictamen(AccesoDatosDictamenInterface repositorioDictamen) {
    this.repositorioDictamen = repositorioDictamen;
  }

  /**
  *Metodo obtieneInstancia.
  *Encargado obtener instancia 
  *del inventario de dictamen
  * @param repositorioDictamen
  * Respositorio a agregar
  */ 
  public static InventarioDictamen obtieneInstancia(
          AccesoDatosDictamenInterface repositorioDictamen) {
    if (InventarioDictamen.inventarioDictamen == null) {
      InventarioDictamen.inventarioDictamen = new InventarioDictamen(repositorioDictamen);
    }
    return InventarioDictamen.inventarioDictamen;
  }
  
  @Override
  public boolean guardaDictamen(Dictamen dictamen) {
    if (this.repositorioDictamen.guardaDictamenRepositorio(dictamen)) {
      return true;
    }
    return false;
  }

  @Override
  public boolean guardaDictamen_Hardware(Dictamen dictamen, Hardware hardware) {
    if (this.repositorioDictamen.guardaDictamen_HardwareRepositorio(dictamen, hardware)) {
      return true;
    }
    return false;
  }
}
