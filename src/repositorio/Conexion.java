package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
  
  private static Connection conexion;

  private static Connection haceConexionConRepositorio(){
    try {
      String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true"
          + "&useLegacyDatetimeCode=false&serverTimezone=UTC";
      String nombreBaseDatos = "sgcc";
      String url = "jdbc:mysql://127.0.0.1:3306/"
          + nombreBaseDatos + timezone;
      String nombreUsuario = "sgccuser";
      String contraseniaUsuario = "123456";
      conexion = DriverManager
          .getConnection(url,nombreUsuario,contraseniaUsuario); 
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return conexion;
  }
  
  public static Connection obtieneConexionepositorio(){
    return haceConexionConRepositorio();
  }
  
  public static void cierraConexionRepositorio(){
    if (conexion!=null) {
      try {
        if (!conexion.isClosed()) {
          conexion.close();
        }
      } catch (SQLException ex) {
        ex.printStackTrace();
      }
    }
  }
}
