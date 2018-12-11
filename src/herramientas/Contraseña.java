/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import java.util.logging.*;
import org.mindrot.jbcrypt.BCrypt;
import repositorio.dataaccesobject.*;

/**
 *
 * @author Alberto Sánchez
 */
public class Contraseña {

  private static final int COMPLEJIDAD = 12;

  public String devuelveContraseñaHasheada(String contraseña) {
    String contraseñaHasheada = BCrypt.hashpw(contraseña, BCrypt.gensalt(COMPLEJIDAD));
    return contraseñaHasheada;
  }
  
  public boolean evaluaSiExiste(String contraseñaCandidata, String contraseñaHasheada) {
    if (BCrypt.checkpw(contraseñaCandidata, contraseñaHasheada) == true) {
      return true;
    } else {
      return false;
    }
  }
}
