/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.interfaz;

import CentroComputo.Responsable;
import java.util.List;

/**
 *
 * @author Alberto Sánchez
 */
public interface AccesoDatosResponsableInterface {
  
  public boolean guardaResponsableRepositorio (Responsable responsable);
  
  public List<Responsable> regresaListaResponsableRepositorio ();
  
  public boolean eliminaResponsableRepositorio (String idResponsable);
  
  public boolean actualizaResponsableRepositorio (Responsable responsable);
  
  public Responsable buscaResponsableRepositorio (String idResponsable);
  
}
