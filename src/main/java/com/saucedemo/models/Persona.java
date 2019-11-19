package com.saucedemo.models;

public class Persona {

  private String nombre;
  private String apellido;
  private String codigoPostal;

  public Persona(String nombre, String apellido, String codigoPostal) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.codigoPostal = codigoPostal;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }

}
