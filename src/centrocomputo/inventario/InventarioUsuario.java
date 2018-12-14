/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrocomputo.inventario;

import CentroComputo.Usuario;
import centrocomputo.interfaz.InventarioUsuarioInterface;
import java.util.List;
import repositorio.interfaz.AccesoDatosUsuarioInterface;

/**
 *
 * @author Alberto Sánchez
 */
public class InventarioUsuario implements InventarioUsuarioInterface{
  
  private AccesoDatosUsuarioInterface repositorioUsuario;
  private static InventarioUsuario inventarioUsuario = null;
  private List<Usuario> listaUsuarios;
  
  private InventarioUsuario(AccesoDatosUsuarioInterface repositorioUsuario){
    this.repositorioUsuario = repositorioUsuario;
  }
  
  public static InventarioUsuario obtieneInstancia(AccesoDatosUsuarioInterface repositorioUsuario){
    if (InventarioUsuario.inventarioUsuario == null) {
      InventarioUsuario.inventarioUsuario = new InventarioUsuario(repositorioUsuario);
    }
    return InventarioUsuario.inventarioUsuario;    
  }

  @Override
  public boolean actualizaUsuario(Usuario usuario) {
    if (this.repositorioUsuario.actualizaUsuarioRepositorio(usuario)) {
      return true;
    }
    return false;
  }

  @Override
  public Usuario buscaUsuario(String idUsuario) {
    Usuario usuarioEncontrado = this.repositorioUsuario.buscaUsuarioRepositorio(idUsuario);
    if (usuarioEncontrado == null) {
      return null;
    } else {
      return usuarioEncontrado;
    }
  }

  @Override
  public boolean eliminaUsuario(String idUsuario) {
    if (this.repositorioUsuario.eliminaUsuarioRepositorio(idUsuario)) {
      return true;
    }
    return false;
  }

  @Override
  public boolean guardaUsuario(Usuario usuario) {
    if (this.repositorioUsuario.guardaUsuarioRepositorio(usuario)) {
      return true;
    }
    return false;
  }

  @Override
  public List<Usuario> regresaListaUsuario() {
    this.listaUsuarios = this.repositorioUsuario.regresaListaUsuarioRepositorio();
    if (this.listaUsuarios == null || this.listaUsuarios.isEmpty()) {
      return null;
    } else {
    return this.listaUsuarios;
    }
  }

  @Override
  public boolean validaCredenciales(String usuario, String contrasenia) {
    if  (this.repositorioUsuario.validaCredencialesRepositorio(usuario, contrasenia) == true ){
      return true;
    }
    return false;
  }
  
}
