/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.dataaccesobject;

import CentroComputo.Usuario;
import herramientas.Contraseña;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repositorio.Conexion;
import repositorio.interfaz.AccesoDatosUsuarioInterface;

/**
 *
 * @author Alberto Sánchez
 */
public class AccesoDatosUsuario implements AccesoDatosUsuarioInterface{
  
   private String consultaSql;

  @Override
  public boolean actualizaUsuaraioRepositorio(Usuario usuario) {
    return false;
  }

  @Override
  public Usuario buscaUsuaraioRepositorio(String idUsuario) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean eliminaUsuarioRepositorio(String idUsuario) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean guardaUsuarioRepositorio(Usuario usuario) {
    if (usuario == null) {
      return false;
    }
    if (this.existeIdentificador(usuario.getIdentificador()) == true) {
      return false;
    }
    Contraseña contraseña = new Contraseña();
    String contraseñaHasheada
            = contraseña.devuelveContraseñaHasheada(usuario.getContrasenia());
    consultaSql = "INSERT INTO sgcc.usuario "
            + "(idnumeropersonal, contraseña, nombres, apellidos,"
            + " correoinstitucional, rol, telefono, estado)"
            + " VALUES "
            + "(?,?,?,?,?,?,?,?)";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, usuario.getIdentificador());
      consultaParametrizada.setString(2, contraseñaHasheada);
      consultaParametrizada.setString(3, usuario.getNombres());
      consultaParametrizada.setString(4, usuario.getApellido());
      consultaParametrizada.setString(5, usuario.getCorreoInstitucional());
      consultaParametrizada.setString(6, usuario.getRol());
      consultaParametrizada.setString(7, usuario.getTelefonoConExtension());
      consultaParametrizada.setInt(8, usuario.getEstadoHabilitado());
      consultaParametrizada.executeUpdate();
    } catch (SQLException exception) {
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    return true;
  }

  @Override
  public List<Usuario> regresaListaUsuarioRepositorio() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public boolean validaCredencialesRepositorio(String usuario, String contrasenia) {

    return false;
  }
  
  private boolean existeIdentificador(String identificador) {
    consultaSql = "SELECT idnumeropersonal FROM usuario WHERE idnumeropersonal = (?)";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, identificador);
      ResultSet resultSet = consultaParametrizada.executeQuery();
      if (!resultSet.next()) {
        return false;
      }
    } catch (SQLException exception) {
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    return true;
  }
}
