/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.excepcionrepositorio;

/**
 *
 * @author Alberto Sánchez
 */

public class RepositorioSinResultadosException extends RepositorioException {

  public RepositorioSinResultadosException() {
  }

  public RepositorioSinResultadosException(String message) {
    super(message);
  }

  public RepositorioSinResultadosException(String message, Throwable cause) {
    super(message, cause);
  }

}

