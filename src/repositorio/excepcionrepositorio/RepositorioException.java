/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.excepcionrepositorio;

import java.sql.*;

/**
 *
 * @author Alberto Sánchez
 */
public class RepositorioException extends Exception {

  public RepositorioException() {
  }

  public RepositorioException(String message) {
    super(message);
  }

  public RepositorioException(String message, Throwable cause) {
    super(message, cause);
  }

  public RepositorioException(SQLException exception) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

}

