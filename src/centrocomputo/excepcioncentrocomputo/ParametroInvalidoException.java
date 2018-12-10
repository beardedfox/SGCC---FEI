/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrocomputo.excepcioncentrocomputo;

/**
 *
 * @author Alberto Sánchez
 */
public class ParametroInvalidoException extends CentroComputoException {

  public ParametroInvalidoException() {
  }

  public ParametroInvalidoException(String message) {
    super(message);
  }

  public ParametroInvalidoException(String message, Throwable cause) {
    super(message, cause);
  }

  public ParametroInvalidoException(Throwable cause) {
    super(cause);
  }

  public ParametroInvalidoException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
