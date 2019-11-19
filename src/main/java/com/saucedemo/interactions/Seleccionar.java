package com.saucedemo.interactions;

import com.saucedemo.ui.ProductsPage;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Interaction {

  private List<String> lstProductos;

  private Seleccionar(List<String> lstProdcutos) {
    this.lstProductos = lstProdcutos;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    for (String producto : lstProductos) {
      actor.attemptsTo(Click.on(ProductsPage.BOTON_AGREGAR.of(producto)));
    }
  }

  public static Seleccionar losProductos(List<String> lstProductos) {
    return new Seleccionar(lstProductos);
  }

}
