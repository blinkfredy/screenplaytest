package com.saucedemo.tasks;

import com.saucedemo.ui.ShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class HacerCheckOut implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(ShoppingCartPage.BOTON_CHECKOUT));
  }

  public static HacerCheckOut deLaCompra() {
    return Tasks.instrumented(HacerCheckOut.class);
  }

}
