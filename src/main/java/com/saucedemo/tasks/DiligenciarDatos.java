package com.saucedemo.tasks;

import com.saucedemo.models.Persona;
import com.saucedemo.ui.CheckOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenciarDatos implements Task {

  private final Persona persona;

  public DiligenciarDatos(Persona persona) {
    super();
    this.persona = persona;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(persona.getNombre()).into(CheckOutPage.CAMPO_NOMBRE));
    actor.attemptsTo(
        Enter.theValue(persona.getApellido()).into(CheckOutPage.CAMPO_APELLIDO));
    actor.attemptsTo(
        Enter.theValue(persona.getCodigoPostal()).into(CheckOutPage.CAMPO_COD_POSTAL));
    actor.attemptsTo(Click.on(CheckOutPage.BOTON_CONTINUAR));
  }

  public static DiligenciarDatos personalesDe(Persona persona) {
    return Tasks.instrumented(DiligenciarDatos.class, persona);
  }
}
