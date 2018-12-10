package CentroComputo;

public class Usuario {  
  
  private static final String ROLTECNICOACADEMICO = "TA";
  private String identificador;
  private String nombres;
  private String apellido;
  private String correoInstitucional;
  private String contrasenia;
  private String rol;
  private int estado;
  private static final int ESTADOHABILITADO = 1;
  private static final int ESTADODESHABILITADO = 0;
  private String telefonoConExtension;

  public Usuario() {
  }
  		
  public Usuario(String identificador, String nombres, String apellido,
          String correoInstitucional, String contrasenia, String rol,
          String telefonoConExtension) {
    this.identificador = identificador;
    this.nombres = nombres;
    this.apellido = apellido;
    this.correoInstitucional = correoInstitucional;
    this.contrasenia = contrasenia;
    this.rol = ROLTECNICOACADEMICO;
    this.telefonoConExtension = telefonoConExtension;
  }

  public int getEstado() {
    return estado;
  }
  
  public String getIdentificador() {
    return identificador;
  }

  public String getContrasenia() {
    return contrasenia;
  }
	  
  public String getNombres() {
    return nombres;
  }

  public String getApellido() {
    return apellido;
  }

  public String getCorreoInstitucional() {
    return correoInstitucional;
  }

  public String getRol() {
    return ROLTECNICOACADEMICO;
  }

  public int getEstadoHabilitado() {
    return ESTADOHABILITADO;
  }
  
  public int getEstadoDesHabilitado() {
    return ESTADODESHABILITADO;
  }

  public String getTelefonoConExtension() {
    return telefonoConExtension;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setCorreoInstitucional(String correoInstitucional) {
    this.correoInstitucional = correoInstitucional;
  }

  public void setContrasenia(String contrasenia) {
    this.contrasenia = contrasenia;
  }

  public void setRolTecnicoAcademico() {
    this.rol = ROLTECNICOACADEMICO;
  }

  public void setTelefonoConExtension(String telefonoConExtension) {
    this.telefonoConExtension = telefonoConExtension;
  }
  
  
  
}
