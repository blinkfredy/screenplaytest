package com.saucedemo.tasks;

import com.saucedemo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarCredenciales implements Task {

  private String usuario;
  private String clave;

  public IngresarCredenciales(String usuario, String clave) {
    super();
    this.usuario = usuario;
    this.clave = clave;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(usuario).into(LoginPage.CAMPO_USUARIO));
    actor.attemptsTo(Enter.theValue(clave).into(LoginPage.CAMPO_CLAVE));
    actor.attemptsTo(Click.on(LoginPage.BOTON_LOGIN));
  }

  public static IngresarCredenciales deAcceso(String usuario, String clave) {
    return Tasks.instrumented(IngresarCredenciales.class, usuario, clave);
  }


}
