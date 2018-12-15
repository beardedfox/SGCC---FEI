package CentroComputo;

import java.sql.Date;

public class Hardware {
	
  private final int ACTIVADO = 1;
  private String numeroInventario;
  private String numeroSerie;
  private String modelo;
  private String marca;
  private String tipoDispositivo;
  private int estado;
  private String ubicacion;
  private Date fechaAdquisicion;
  private String partesdispositivo;

  public Hardware(String numeroInventario, String numeroSerie, String modelo,
          String marca, String tipoDispositivo, int estado, String ubicacion,
          Date fechaAdquisicion, String partesdispositivo) {
    this.numeroInventario = numeroInventario;
    this.numeroSerie = numeroSerie;
    this.modelo = modelo;
    this.marca = marca;
    this.tipoDispositivo = tipoDispositivo;
    this.estado = ACTIVADO;
    this.ubicacion = ubicacion;
    this.fechaAdquisicion = fechaAdquisicion;
    this.partesdispositivo = partesdispositivo;
  }
	
  public Hardware() {
  }


  public String getNumeroInventario() {
    return numeroInventario;
  }

  public String getNumeroSerie() {
    return numeroSerie;
  }

  public String getModelo() {
    return modelo;
  }

  public String getMarca() {
    return marca;
  }

  public String getTipoDispositivo() {
    return tipoDispositivo;
  }

  public int getEstado() {
    return estado;
  }
  
  public int getEstadoActivado() {
    return ACTIVADO;
  }

  public String getUbicacion() {
    return ubicacion;
  }

  public Date getFechaAdquisicion() {
    return fechaAdquisicion;
  }

  public String getPartesdispositivo() {
    return partesdispositivo;
  }

  public void setNumeroInventario(String numeroInventario) {
    this.numeroInventario = numeroInventario;
  }

  public void setNumeroSerie(String numeroSerie) {
    this.numeroSerie = numeroSerie;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
 
  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setTipoDispositivo(String tipoDispositivo) {
    this.tipoDispositivo = tipoDispositivo;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  public void setFechaAdquisicion(Date fechaAdquisicion) {
    this.fechaAdquisicion = fechaAdquisicion;
  }

  public void setPartesdispositivo(String partesdispositivo) {
    this.partesdispositivo = partesdispositivo;
  }
}
