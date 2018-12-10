/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.dataaccesobject;

import CentroComputo.Hardware;
import java.util.List;
import repositorio.interfaz.AccesoDatosHardwareInterface;

/**
 *
 * @author Alberto Sánchez
 */
public class AccesoDatosHardware implements AccesoDatosHardwareInterface {

  @Override
  public boolean actualizaHardwareRepositorio(Hardware hardware) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Hardware buscaHardwareBd(String idHardware) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean eliminaHardwareRepositorio(String idHardware) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean guardaHardwareRepositorio(Hardware hardware) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Hardware> regresaListaHardwareRepositorio() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


  
}
