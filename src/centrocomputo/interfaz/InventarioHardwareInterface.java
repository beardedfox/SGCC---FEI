/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrocomputo.interfaz;

import CentroComputo.Hardware;
import java.util.List;

/**
 *
 * @author Alberto Sánchez
 */
public interface InventarioHardwareInterface {
  
  public boolean guardaHardware(Hardware hardware);
  
  public List<Hardware> regresaListaHardware();
  
  public boolean eliminaHardware(String idHardware);
  
  public boolean actualizaHardware(Hardware hardware);
  
  public Hardware buscaHardware(String idHardware);
}
