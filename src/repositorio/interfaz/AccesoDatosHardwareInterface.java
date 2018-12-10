/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.interfaz;

import CentroComputo.Hardware;
import java.util.List;

/**
 *
 * @author Alberto Sánchez
 */
public interface AccesoDatosHardwareInterface {
  
  public boolean guardaHardwareRepositorio (Hardware hardware);
  
  public List<Hardware> regresaListaHardwareRepositorio ();
  
  public boolean eliminaHardwareRepositorio (String idHardware);
  
  public boolean actualizaHardwareRepositorio (Hardware hardware);
  
  public Hardware buscaHardwareBd(String idHardware);
  
}
