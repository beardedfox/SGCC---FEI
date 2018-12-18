package CentroComputo;

import java.sql.Date;

public class Dictamen {
  
  private String idDictamen;
  private String tipoDictamen;
  private String descripcioDetalladanDictamen;
  private String descripcionProblema;
  private String tipoMantenimiento;
  private String tipoFalla;
  private String partesDispositivo;
  private String estado;
  private String observaciones;
  private String tipoBorrado;

  /**
   *Constructor de Dictamen.
   *Encargado de recibir datos de dictamen
   *y crear un dictamen de forma óptima
   * @param idDictamen
   * Identificador de dictamen
   * @param tipoDictamen
   * Tipo de dictamen
   * @param descripcionProblema
   * Descripcion de problema
   * @param tipoMantenimiento
   * tipo de mantenimiento
   * @param tipoFalla
   * Tipo de falla
   * @param partesDispositivo
   * Partes de dispositivo
   * @param descripcioDetalladanDictamen
   * Descripcion d dictamen
   * @param estado
   * Estado de dictamen
   */
  public Dictamen(String idDictamen, String tipoDictamen, String descripcioDetalladanDictamen,
          String descripcionProblema, String tipoMantenimiento, String tipoFalla,
          String partesDispositivo, String estado) {
    this.idDictamen = idDictamen;
    this.tipoDictamen = tipoDictamen;
    this.descripcioDetalladanDictamen = descripcioDetalladanDictamen;
    this.descripcionProblema = descripcionProblema;
    this.tipoMantenimiento = tipoMantenimiento;
    this.tipoFalla = tipoFalla;
    this.partesDispositivo = partesDispositivo;
    this.estado = estado;
  }

  public Dictamen() {
    
  }

  public String getObservaciones() {
    return observaciones;
  }

  public String getTipoBorrado() {
    return tipoBorrado;
  }

  public String getIdDictamen() {
    return idDictamen;
  }

  public String getTipoDictamen() {
    return tipoDictamen;
  }

  public String getDescripcioDetalladanDictamen() {
    return descripcioDetalladanDictamen;
  }

  public String getDescripcionProblema() {
    return descripcionProblema;
  }

  public String getTipoMantenimiento() {
    return tipoMantenimiento;
  }

  public String getTipoFalla() {
    return tipoFalla;
  }

  public String getPartesDispositivo() {
    return partesDispositivo;
  }

  public String getEstado() {
    return estado;
  }

  public void setIdDictamen(String idDictamen) {
    this.idDictamen = idDictamen;
  }

  public void setTipoDictamen(String tipoDictamen) {
    this.tipoDictamen = tipoDictamen;
  }

  public void setObservaciones(String observaciones) {
    this.observaciones = observaciones;
  }

  public void setTipoBorrado(String tipoBorrado) {
    this.tipoBorrado = tipoBorrado;
  }
  
  

  public void setDescripcioDetalladanDictamen(String descripcioDetalladanDictamen) {
    this.descripcioDetalladanDictamen = descripcioDetalladanDictamen;
  }

  public void setDescripcionProblema(String descripcionProblema) {
    this.descripcionProblema = descripcionProblema;
  }

  public void setTipoMantenimiento(String tipoMantenimiento) {
    this.tipoMantenimiento = tipoMantenimiento;
  }

  public void setTipoFalla(String tipoFalla) {
    this.tipoFalla = tipoFalla;
  }

  public void setPartesDispositivo(String partesDispositivo) {
    this.partesDispositivo = partesDispositivo;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
}
