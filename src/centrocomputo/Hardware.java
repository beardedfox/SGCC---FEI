package CentroComputo;

import java.sql.Date;

public class Hardware {
	
  private String numeroInventario;
  private String numeroSerie;
  private String modelo;
  private String marca;
  private String tipoDispositivo;
  private String estado;
  private String ubicacion;
  private Date fechaAdquisicion;
  private int partesdispositivo;
	
  public Hardware(String noInventarioUv, String numeroSerie, String modelo, String marca, 
          String tipoDispositivo, String estado, String ubicacion, Date fechaAdquisicion,
          int partesdispositivo) {
    this.numeroInventario = noInventarioUv;
    this.numeroSerie = numeroSerie;
    this.modelo = modelo;
    this.marca = marca;
    this.tipoDispositivo = tipoDispositivo;
    this.estado = estado;
    this.ubicacion = ubicacion;
    this.fechaAdquisicion = fechaAdquisicion;
    this.partesdispositivo = partesdispositivo;
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

  public String getEstado() {
    return estado;
  }

  public String getUbicacion() {
    return ubicacion;
  }

  public Date getFechaAdquisicion() {
    return fechaAdquisicion;
  }

  public int getPartesdispositivo() {
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

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  public void setFechaAdquisicion(Date fechaAdquisicion) {
    this.fechaAdquisicion = fechaAdquisicion;
  }

  public void setPartesdispositivo(int partesdispositivo) {
    this.partesdispositivo = partesdispositivo;
  }
  
  

  
}
