package com.saucedemo.questions;

import com.saucedemo.ui.PurchaseSummaryPage;
import com.saucedemo.utils.Utilidades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Factura implements Question<String> {

  @Override
  public String answeredBy(Actor actor) {
    String totalFacturado = Text.of(PurchaseSummaryPage.LABEL_VALOR_NETO_FACTURA).viewedBy(actor)
        .resolve();
    return Utilidades.obtenerPrecio(totalFacturado);
  }

  public static Factura es() {
    return new Factura();
  }
}
