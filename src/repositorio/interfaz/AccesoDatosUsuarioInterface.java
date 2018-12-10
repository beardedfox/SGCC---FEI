/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.interfaz;

import CentroComputo.Usuario;
import java.util.List;

/**
 *
 * @author Alberto Sánchez
 */
public interface AccesoDatosUsuarioInterface {
  
  public boolean validaCredencialesRepositorio (String usuario, String contrasenia);
  
  public boolean guardaUsuarioRepositorio (Usuario usuario);
  
  public List<Usuario> regresaListaUsuarioRepositorio ();
  
  public boolean eliminaUsuarioRepositorio (String idUsuario);
  
  public boolean actualizaUsuaraioRepositorio (Usuario usuario);
  
  public Usuario buscaUsuaraioRepositorio (String idUsuario);
  
}
