/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrocomputo.inventario;

import CentroComputo.Dictamen;
import centrocomputo.interfaz.InventarioDictamenInterface;
import repositorio.interfaz.AccesoDatosDictamenInterface;

/**
 *
 * @author Alberto Sánchez
 */
public class InventarioDictamen implements InventarioDictamenInterface {

  private AccesoDatosDictamenInterface repositorioDictamen;
  private static InventarioDictamen inventarioDictamen = null;
  
  private InventarioDictamen(AccesoDatosDictamenInterface repositorioDictamen) {
    this.repositorioDictamen = repositorioDictamen;
  }

  public static InventarioDictamen obtieneInstancia(AccesoDatosDictamenInterface repositorioDictamen) {
    if (InventarioDictamen.inventarioDictamen == null) {
      InventarioDictamen.inventarioDictamen = new InventarioDictamen(repositorioDictamen);
    }
    return InventarioDictamen.inventarioDictamen;
  }
  
  @Override
  public boolean guardaDictamen(Dictamen dictamen) {
   return false;
  }
  
}
