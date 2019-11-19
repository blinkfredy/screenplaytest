package com.saucedemo.tasks;

import com.saucedemo.interactions.Seleccionar;
import com.saucedemo.ui.ProductsPage;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProductos implements Task {

  private final List<String> lstProductos;

  public AgregarProductos(List<String> lstProdcutos) {
    super();
    this.lstProductos = lstProdcutos;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Seleccionar.losProductos(lstProductos));
    actor.attemptsTo(Click.on(ProductsPage.BOTON_CARRITO_COMPRAS));
  }

  public static AgregarProductos alCarritoDeCompras(List<String> lstProductos) {
    return Tasks.instrumented(AgregarProductos.class, lstProductos);
  }


}
