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

  private InventarioResponsable(AccesoDatosResponsableInterface repositorioResponsable) {
    this.repositorioResponsable = repositorioResponsable;
  }

  public static InventarioResponsable obtieneInstancia(AccesoDatosResponsableInterface repositorioResponsable) {
    if (InventarioResponsable.inventarioResponsable == null) {
      InventarioResponsable.inventarioResponsable = new InventarioResponsable(repositorioResponsable);
    }
    return InventarioResponsable.inventarioResponsable;
  }

  @Override
  public boolean actualizaResponsable(Responsable responsable) {
    if (this.repositorioResponsable.actualizaResponsableRepositorio(responsable)) {
      return true;
    }
    return false;
  }

  @Override
  public Responsable buscaResponsable(String idResponsable) {
    Responsable responsableEncontrado
            = this.repositorioResponsable.buscaResponsableRepositorio(idResponsable);
    if (responsableEncontrado == null) {
      return null;
    } else {
      return responsableEncontrado;
    }
  }

  @Override
  public boolean eliminaResponsable(String idResponsable) {
    if (this.repositorioResponsable.eliminaResponsableRepositorio(idResponsable)) {
      return true;
    }
    return false;
  }

  @Override
  public boolean guardaResponsable(Responsable responsable) {
    if (this.repositorioResponsable.guardaResponsableRepositorio(responsable)) {
      return true;
    }
    return false;
  }

  @Override
  public List<Responsable> regresaListaResponsable() {
    this.listaResponsable = this.repositorioResponsable.regresaListaResponsableRepositorio();
    if (this.listaResponsable == null || this.listaResponsable.isEmpty()) {
      return null;
    } else {
      return this.listaResponsable;
    }
  }
}
