/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrocomputo.inventario;

import CentroComputo.Responsable;
import centrocomputo.interfaz.InventarioResponsableInterface;
import java.util.List;
import repositorio.interfaz.AccesoDatosResponsableInterface;

/**
 *
 * @author Alberto Sánchez
 */
public class InventarioResponsable implements InventarioResponsableInterface {
  
 private AccesoDatosResponsableInterface repositorioResponsable;
 private static InventarioResponsable inventarioResponsable = null;
 private List<Responsable> listaResponsable;
 
  private InventarioResponsable(AccesoDatosResponsableInterface repositorioResponsable){
    this.repositorioResponsable = repositorioResponsable;
  }
  
  public static InventarioResponsable obtieneInstancia(AccesoDatosResponsableInterface repositorioResponsable){
    if (InventarioResponsable.inventarioResponsable == null) {
      InventarioResponsable.inventarioResponsable = new InventarioResponsable(repositorioResponsable);
    }
    return InventarioResponsable.inventarioResponsable;    
  }

  @Override
  public boolean actualizaResponsable(Responsable responsable) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Responsable buscaResponsable(String idResponsable) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean eliminaResponsable(String idResponsable) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean guardaResponsable(Responsable responsable) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Responsable> regresaListaResponsable() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }  
}
