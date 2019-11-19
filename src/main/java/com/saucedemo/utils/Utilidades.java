package com.saucedemo.utils;

public class Utilidades {

  public static String obtenerPrecio(String valor) {
    String[] valorFinal = valor.split("\\$");
    return valorFinal[1];
  }
}
