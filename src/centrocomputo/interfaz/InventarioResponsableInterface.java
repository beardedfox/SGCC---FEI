/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrocomputo.interfaz;

import CentroComputo.Responsable;
import java.util.List;

/**
 *
 * @author Alberto Sánchez
 */
public interface InventarioResponsableInterface {
  
  public boolean guardaResponsable(Responsable responsable);
  
  public List<Responsable> regresaListaResponsable();
  
  public boolean eliminaResponsable(String idResponsable);
  
  public boolean actualizaResponsable(Responsable responsable);
  
  public Responsable buscaResponsable(String idResponsable);
  
}
