package com.saucedemo.questions;

import com.saucedemo.ui.PurchaseFinishPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Mensaje implements Question<String> {

  public static Mensaje es() {
    return new Mensaje();
  }

  @Override
  public String answeredBy(Actor actor) {
    return Text.of(PurchaseFinishPage.MENSAJE_CONFIRMACION_COMPRA)
        .viewedBy(actor)
        .asString();
  }
}
