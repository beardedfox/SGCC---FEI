/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.dataaccesobject;

import CentroComputo.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import repositorio.*;
import repositorio.interfaz.AccesoDatosResponsableInterface;

/**
 *
 * @author Alberto Sánchez
 */
public class AccesoDatosResponsable implements AccesoDatosResponsableInterface {

  private String consultaSql;
  private List<Responsable> listaResponsables;

  @Override
  public boolean actualizaResponsableRepositorio(Responsable responsable) {
    if (responsable.getNumeroPersonal() == null || responsable.getNumeroPersonal().isEmpty()) {
      return false;
    }
    consultaSql = "UPDATE responsables"
            + " SET matriculaempleado = (?), nombrecompleto = (?),"
            + " telefono = (?), correoinstitucional = (?)"
            + " WHERE matriculaempleado = (?);";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, responsable.getNumeroPersonal());
      consultaParametrizada.setString(2, responsable.getNombres());
      consultaParametrizada.setString(3, responsable.getTelefono());
      consultaParametrizada.setString(4, responsable.getCorreoinstitucional());
      consultaParametrizada.setString(5, responsable.getNumeroPersonal());
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
  public Responsable buscaResponsableRepositorio(String idResponsable) {
    if (idResponsable == null || idResponsable.isEmpty()) {
      return null;
    }
    consultaSql = "SELECT "
            + "matriculaempleado, nombrecompleto, telefono,"
            + " correoinstitucional, estado"
            + " FROM responsables "
            + "WHERE matriculaempleado = (?);";
    Responsable responsable = new Responsable();
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, idResponsable);
      ResultSet result = consultaParametrizada.executeQuery();
      if (result.next()) {
        responsable.setNumeroPersonal(result.getNString(1));
        responsable.setNombres(result.getNString(2));
        responsable.setTelefono(result.getNString(3));
        responsable.setCorreoinstitucional(result.getNString(4));
        responsable.setEstado(result.getInt(5));
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
      return null;
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    return responsable;
  }

  @Override
  public boolean eliminaResponsableRepositorio(String idResponsable) {
    if (idResponsable == null || idResponsable.isEmpty()) {
      return false;
    }
    consultaSql = "UPDATE responsables SET estado = 0 WHERE matriculaempleado = (?);";
    try (PreparedStatement consultaParametrizada
            = Conexion.obtieneConexionepositorio().prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, idResponsable);
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
  public boolean guardaResponsableRepositorio(Responsable responsable) {
    if (responsable == null) {
      return false;
    }
    if (this.existeIdentificador(responsable.getNumeroPersonal())) {
      return false;
    }
    consultaSql = "INSERT INTO responsables "
            + "(matriculaempleado, nombrecompleto, "
            + "telefono, correoinstitucional, estado)"
            + "VALUES (?,?,?,?,?);";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, responsable.getNumeroPersonal());
      consultaParametrizada.setString(2, responsable.getNombres());
      consultaParametrizada.setString(3, responsable.getTelefono());
      consultaParametrizada.setString(4, responsable.getCorreoinstitucional());
      consultaParametrizada.setInt(5, responsable.getEstado());
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
  public List<Responsable> regresaListaResponsableRepositorio() {
    consultaSql = "SELECT"
            + " matriculaempleado, nombrecompleto, telefono,"
            + " correoinstitucional, estado FROM responsables;";
    listaResponsables = new ArrayList<>();
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      try (ResultSet result = consultaParametrizada.executeQuery()) {
        while (result.next()) {
          Responsable responsable = new Responsable();
          responsable.setNumeroPersonal(result.getNString(1));
          responsable.setNombres(result.getNString(2));
          responsable.setTelefono(result.getNString(3));
          responsable.setCorreoinstitucional(result.getNString(4));
          listaResponsables.add(responsable);
        }
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
      return null;
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    if (listaResponsables == null || listaResponsables.isEmpty()) {
      return null;
    }
    return listaResponsables;

  }

  private boolean existeIdentificador(String numeroPersonal) {
    if (numeroPersonal == null || numeroPersonal.isEmpty()) {
      return false;
    }
    consultaSql = "SELECT matriculaempleado FROM responsables WHERE matriculaempleado = (?)";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, numeroPersonal);
      ResultSet resultSet = consultaParametrizada.executeQuery();
      if (!resultSet.next()) {
        return false;
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    return true;
  }
}
