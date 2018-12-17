/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import java.util.*;

/**
 *
 * @author Alberto Sánchez
 */
public class GeneraIdentificador {
  
  public String generaUid(){
    String uniqueID = UUID.randomUUID().toString();
    return uniqueID;
  } 
}
