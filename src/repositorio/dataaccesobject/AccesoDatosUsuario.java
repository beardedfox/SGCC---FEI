/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.dataaccesobject;

import CentroComputo.Usuario;
import herramientas.Contraseña;
import java.sql.*;
import java.util.ArrayList;
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
   private List<Usuario> listaUsuarios;

  @Override
  public boolean actualizaUsuaraioRepositorio(Usuario usuario) {
    if (this.existeIdentificador(usuario.getIdentificador()) == true) {
      return false;
    }
    consultaSql = "UPDATE sgcc.usuario "
            + "SET nombres = (?), apellidos = (?),"
            + "idnumeropersonal = (?), telefono = (?),"
            + " correoinstitucional = (?) "
            + "WHERE idnumeropersonal = (?);";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio().prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, usuario.getNombres());
      consultaParametrizada.setString(2, usuario.getApellido());
      consultaParametrizada.setString(3, usuario.getIdentificador());
      consultaParametrizada.setString(4, usuario.getTelefonoConExtension());
      consultaParametrizada.setString(5, usuario.getCorreoInstitucional());
      consultaParametrizada.setString(6, usuario.getIdentificador());
      consultaParametrizada.executeUpdate();
    } catch (SQLException exception) {
      exception.printStackTrace();
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
      return false;
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    return true;
  }

  @Override
  public Usuario buscaUsuaraioRepositorio(String idUsuario) {
    if (idUsuario == null){
      return null;
    }
    consultaSql = "SELECT nombres, apellidos, idnumeropersonal, correoinstitucional,"
            + " rol, telefono, estado FROM usuario WHERE idnumeropersonal = (?);";
   Usuario usuario = new Usuario();
   try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio().prepareStatement(consultaSql)){
     consultaParametrizada.setString(1, idUsuario);
     ResultSet result = consultaParametrizada.executeQuery();
     if(result.next()){
       usuario.setNombres(result.getNString(1));
       usuario.setApellido(result.getNString(2));
       usuario.setIdentificador(result.getNString(3));
       usuario.setCorreoInstitucional(result.getNString(4));
       usuario.setRol(result.getNString(5));
       usuario.setTelefonoConExtension(result.getNString(6));
       usuario.setEstado(result.getInt(7));
     }
   } catch (SQLException exception) {
        exception.printStackTrace();
        Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
        return null;
      }  finally {
     Conexion.cierraConexionRepositorio();
    }
   return usuario;
  }

  @Override
  public boolean eliminaUsuarioRepositorio(String idUsuario) {
    if (idUsuario == null) {
      return false;
    }
    consultaSql = "delete from articulodb.articulo where idarticulo = (?)";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio().prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, idUsuario);
      consultaParametrizada.executeUpdate();
    } catch (SQLException exception) {
      exception.printStackTrace();
      return false;
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    return true;
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
      exception.printStackTrace();
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    return true;
  }

  @Override
  public List<Usuario> regresaListaUsuarioRepositorio() {
    consultaSql = "SELECT idnumeropersonal, contraseña, nombres, apellidos,"
            + " correoinstitucional, rol, telefono, estado  "
            + "FROM usuario "
            + "WHERE idnumeropersonal != 'ADMINISTRADOR'; ";
    listaUsuarios = new ArrayList<>();
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      try (ResultSet result = consultaParametrizada.executeQuery()) {
        while (result.next()) {
          Usuario usuario = new Usuario();
          usuario.setIdentificador(result.getNString(1));
          usuario.setContrasenia(result.getNString(2));
          usuario.setNombres(result.getNString(3));
          usuario.setApellido(result.getNString(4));
          usuario.setCorreoInstitucional(result.getNString(5));
          usuario.setRol(result.getNString(result.getNString(6)));
          usuario.setTelefonoConExtension(result.getNString(7));
          usuario.setEstado(result.getInt(8));
          listaUsuarios.add(usuario);
        }
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
      return null;
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    if (listaUsuarios.isEmpty()){
      return null;
    }
    return listaUsuarios;
  }

  @Override
  public boolean validaCredencialesRepositorio(String usuario) {
    String contrasenia = "";
    consultaSql = "SELECT contraseña FROM usuario WHERE idnumeropersonal = (?)";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)){
      consultaParametrizada.setString(1, usuario);
      ResultSet resultSet = consultaParametrizada.executeQuery();
      if (resultSet.next()){
        contrasenia = resultSet.getNString(1);
      }
    } catch (SQLException exception) {
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
    } finally {
      Conexion.cierraConexionRepositorio();
    }
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
