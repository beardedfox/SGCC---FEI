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
 *
 * @author Alberto Sánchez
 */
public class InventarioHardware implements InventarioHardwareInterface {
  
  private AccesoDatosHardwareInterface repositorioHardware;
  private static InventarioHardware inventarioHardware = null;
  private List<Hardware> listaHardware;
  
  private InventarioHardware(AccesoDatosHardwareInterface repositorioHardware){
      this.repositorioHardware = repositorioHardware;
  }
  
  public static InventarioHardware obtieneInstancia(AccesoDatosHardwareInterface repositorioHardware){
    if (InventarioHardware.inventarioHardware == null) {
      InventarioHardware.inventarioHardware = new InventarioHardware(repositorioHardware);
    }
    return InventarioHardware.inventarioHardware;    
  }

  @Override
  public boolean actualizaHardware(Hardware hardware) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Hardware buscaHardware(String idHardware) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean eliminaHardware(String idHardware) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean guardaHardware(Hardware hardware) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Hardware> regresaListaHardware() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
