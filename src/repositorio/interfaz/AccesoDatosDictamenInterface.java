/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.interfaz;

import CentroComputo.*;

/**
 *
 * @author Alberto Sánchez
 */
public interface AccesoDatosDictamenInterface {
  
  public boolean guardaDictamenRepositorio (Dictamen dictamen);
  
  public boolean guardaDictamen_HardwareRepositorio (Dictamen dictamen, Hardware hardware);
  
  
}
