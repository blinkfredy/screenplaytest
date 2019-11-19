package com.saucedemo.tasks;

import com.saucedemo.ui.PurchaseSummaryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConfirmarCompra implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(PurchaseSummaryPage.BOTON_FINALIZAR));
  }

  public static ConfirmarCompra confirmar() {
    return Tasks.instrumented(ConfirmarCompra.class);
  }


}
