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
public class CentroComputoException extends Exception {

  public CentroComputoException() {
  }

  public CentroComputoException(String message) {
    super(message);
  }

  public CentroComputoException(String message, Throwable cause) {
    super(message, cause);
  }

  public CentroComputoException(Throwable cause) {
    super(cause);
  }

  public CentroComputoException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
