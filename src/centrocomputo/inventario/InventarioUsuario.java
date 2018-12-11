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
  public boolean actualizaUsuaraio(Usuario usuario) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Usuario buscaUsuario(String idUsuario) {
    Usuario usuarioEncontrado = this.repositorioUsuario.buscaUsuaraioRepositorio(idUsuario);
    if (usuarioEncontrado == null) {
      return null;
    } else {
      return usuarioEncontrado;
    }
  }

  @Override
  public boolean eliminaUsuario(String idUsuario) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean guardaUsuario(Usuario usuario) {
    if (this.repositorioUsuario.guardaUsuarioRepositorio(usuario) == true) {
      return true;
    }
    return false;
  }

  @Override
  public List<Usuario> regresaListaUsuario() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean validaCredenciales(String usuario, String contrasenia) {
    if  (this.repositorioUsuario.validaCredencialesRepositorio(usuario, contrasenia) == true ){
      return true;
    }
    return false;
  }
  
}
