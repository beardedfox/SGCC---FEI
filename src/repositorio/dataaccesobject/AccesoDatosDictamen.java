/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.dataaccesobject;

import CentroComputo.*;
import java.sql.*;
import java.util.logging.*;
import repositorio.*;
import repositorio.interfaz.AccesoDatosDictamenInterface;

/**
 *
 * @author Alberto Sánchez
 */
public class AccesoDatosDictamen implements AccesoDatosDictamenInterface {

  private String consultaSql;
  private String consultaSqlUnion;
  
  @Override
  public boolean guardaDictamenRepositorio(Dictamen dictamen) {
    if (dictamen == null) {
      return false;
    }
    if (this.existeIdentificador(dictamen.getIdDictamen()) == true) {
      return false;
    } 
        consultaSql = "INSERT INTO dictamen (identificadordictamen, tipodictamen, descripciondictamen, descripcionproblema, tipomantenimiento, tipofalla, observacionesequipo, tipoborrado) values (?,?,?,?,?,?,?,?);";

    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio().prepareStatement(consultaSql))
      { 
      consultaParametrizada.setString(1, dictamen.getIdDictamen());
      consultaParametrizada.setString(2, dictamen.getTipoDictamen());
      consultaParametrizada.setString(3, dictamen.getDescripcioDetalladanDictamen());
      consultaParametrizada.setString(4, dictamen.getDescripcionProblema());
      consultaParametrizada.setString(5, dictamen.getTipoMantenimiento());
      consultaParametrizada.setString(6, dictamen.getTipoFalla());
      consultaParametrizada.setString(7, dictamen.getObservaciones());
      consultaParametrizada.setString(8, dictamen.getTipoBorrado());
      consultaParametrizada.executeUpdate();
      } catch (SQLException exception) {
        exception.printStackTrace();
      Logger.getLogger(AccesoDatosDictamen.class.getName()).log(Level.SEVERE, null, exception);
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    return true;
  }

  @Override
  public boolean guardaDictamen_HardwareRepositorio(Dictamen dictamen, Hardware hardware) {
    consultaSqlUnion = "INSERT INTO hardware_dictamen (hardware, dictamen) VALUES (?,?);";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio().prepareStatement(consultaSqlUnion))
      { 
        System.out.println("base datos dic_hard");
        System.out.println(hardware.getNumeroInventario());
        System.out.println(dictamen.getIdDictamen());
        consultaParametrizada.setString(1, hardware.getNumeroInventario());
      consultaParametrizada.setString(2, dictamen.getIdDictamen());
      consultaParametrizada.executeUpdate();
      } catch (SQLException ex) {
      Logger.getLogger(AccesoDatosDictamen.class.getName()).log(Level.SEVERE, null, ex);
      return false;
    } finally {
      Conexion.cierraConexionRepositorio();
    }
    return true;
  }
  
  

  private boolean existeIdentificador(String idDictamen) {
    consultaSql = "SELECT identificadordictamen FROM dictamen WHERE identificadordictamen = (?)";
    try (PreparedStatement consultaParametrizada = Conexion.obtieneConexionepositorio()
            .prepareStatement(consultaSql)) {
      consultaParametrizada.setString(1, idDictamen);
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
