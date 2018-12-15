/*
 * 
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
import repositorio.interfaz.AccesoDatosHardwareInterface;

/**
 *
 * @author Alberto Sánchez
 */
public class AccesoDatosHardware implements AccesoDatosHardwareInterface {

  private String consultaSql;
  private String contraseñaRecuperada;
  private List<Hardware> listaHardware;

  @Override
  public boolean actualizaHardwareRepositorio(Hardware hardware) {
    if (hardware.getNumeroInventario() == null) {
      return false;
    }
    consultaSql = "UPDATE hardware set numeroinventario = (?), marca = (?), "
            + "modelo = (?), numeroserie = (?), tipodispositivo = (?),"
            + " ubicacion = (?), fechaadquisicion = (?), estado = (?),"
            + " partesdispositivo = (?) WHERE numeroinventario = (?);";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, hardware.getNumeroInventario());
      consultaParametrizada.setString(2, hardware.getMarca());
      consultaParametrizada.setString(3, hardware.getModelo());
      consultaParametrizada.setString(4, hardware.getNumeroSerie());
      consultaParametrizada.setString(5, hardware.getTipoDispositivo());
      consultaParametrizada.setString(6, hardware.getUbicacion());
      consultaParametrizada.setDate(7, hardware.getFechaAdquisicion());
      consultaParametrizada.setInt(8, hardware.getEstado());
      consultaParametrizada.setString(9, hardware.getPartesdispositivo());
      consultaParametrizada.setString(10, hardware.getNumeroInventario());
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
  public Hardware buscaHardwareRepositorio(String idHardware) {
    if (idHardware == null) {
      return null;
    }
    consultaSql = "SELECT numeroinventario, marca, modelo, "
            + "numeroserie, ubicacion, tipodispositivo, estado,"
            + " fechaadquisicion, partesdispositivo FROM hardware "
            + "WHERE numeroinventario = (?);";
    Hardware hardware = new Hardware();
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, idHardware);
      ResultSet result = consultaParametrizada.executeQuery();
      if (result.next()) {
        hardware.setNumeroInventario(result.getNString(1));
        hardware.setMarca(result.getNString(2));
        hardware.setModelo(result.getNString(3));
        hardware.setNumeroSerie(result.getNString(4));
        hardware.setUbicacion(result.getNString(5));
        hardware.setTipoDispositivo(result.getNString(6));
        hardware.setEstado(result.getInt(7));
        hardware.setFechaAdquisicion(result.getDate(8));
        hardware.setPartesdispositivo(result.getNString(9));
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
      return null;
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    return hardware;
  }

  @Override
  public boolean eliminaHardwareRepositorio(String idHardware) {
    if (idHardware == null) {
      return false;
    }
    consultaSql = "UPDATE hardware SET estado = 0 WHERE numeroinventario = (?);";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio().prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, idHardware);
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
  public boolean guardaHardwareRepositorio(Hardware hardware) {
    if (hardware == null) {
      return false;
    }
    if (this.existeNumeroInventario(hardware.getNumeroInventario()) == true) {
      return false;
    }
    consultaSql = "INSERT INTO hardware "
            + "(numeroinventario, marca, modelo, numeroserie, tipodispositivo,"
            + " ubicacion, fechaadquisicion, estado, partesdispositivo)"
            + " VALUES (?,?,?,?,?,?,?,?,?);";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, hardware.getNumeroInventario());
      consultaParametrizada.setString(2, hardware.getMarca());
      consultaParametrizada.setString(3, hardware.getModelo());
      consultaParametrizada.setString(4, hardware.getNumeroSerie());
      consultaParametrizada.setString(5, hardware.getTipoDispositivo());
      consultaParametrizada.setString(6, hardware.getUbicacion());
      consultaParametrizada.setDate(7, hardware.getFechaAdquisicion());
      consultaParametrizada.setInt(8, hardware.getEstadoActivado());
      consultaParametrizada.setString(9, hardware.getPartesdispositivo());
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
  public List<Hardware> regresaListaHardwareRepositorio() {
    consultaSql = "SELECT numeroinventario, marca, modelo, ubicacion FROM hardware";
    listaHardware = new ArrayList<>();
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      try (ResultSet result = consultaParametrizada.executeQuery()) {
        while (result.next()) {
          Hardware hardware = new Hardware();
          hardware.setNumeroInventario(result.getNString(1));
          hardware.setMarca(result.getNString(2));
          hardware.setModelo(result.getNString(3));
          hardware.setUbicacion(result.getNString(4));
          listaHardware.add(hardware);
        }
      }
    } catch (SQLException exception) {
      exception.printStackTrace();
      Logger.getLogger(AccesoDatosUsuario.class.getName()).log(Level.SEVERE, null, exception);
      return null;
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    if (listaHardware == null || listaHardware.isEmpty()) {
      return null;
    }
    return listaHardware;
  }

  private boolean existeNumeroInventario(String numeroInventario) {
    consultaSql = "SELECT numeroinventario FROM hardware WHERE numeroinventario = (?)";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, numeroInventario);
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
