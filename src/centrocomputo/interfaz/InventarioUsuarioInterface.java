/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrocomputo.interfaz;

import CentroComputo.Usuario;
import java.util.List;

/**
 *
 * @author Alberto Sánchez
 */
public interface InventarioUsuarioInterface {
  
  public boolean validaCredenciales(String usuario, String contrasenia);
  
  public boolean guardaUsuario(Usuario usuario);
  
  public List<Usuario> regresaListaUsuario();
  
  public boolean eliminaUsuario(String idUsuario);
  
  public boolean actualizaUsuario(Usuario usuario);
  
  public Usuario buscaUsuario(String idUsuario);
  
}
