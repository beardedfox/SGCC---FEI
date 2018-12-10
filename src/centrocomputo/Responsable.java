package CentroComputo;

public class Responsable {
  
  private String nombres;
  private String numeroPersonal;
  private String telefono;
  private String correoinstitucional;
  private int estado;

  public Responsable(String nombres, String numeroPersonal, String telefono,
          String correoinstitucional) {
    this.nombres = nombres;
    this.numeroPersonal = numeroPersonal;
    this.telefono = telefono;
    this.correoinstitucional = correoinstitucional;
  }

  public String getNombres() {
    return nombres;
  }

  public int getEstado() {
    return estado;
  }
  
  public String getNumeroPersonal() {
    return numeroPersonal;
  }

  public String getTelefono() {
    return telefono;
  }

  public String getCorreoinstitucional() {
    return correoinstitucional;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public void setNumeroPersonal(String numeroPersonal) {
    this.numeroPersonal = numeroPersonal;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }
  
  public void setCorreoinstitucional(String correoinstitucional) {
    this.correoinstitucional = correoinstitucional;
  }
}
