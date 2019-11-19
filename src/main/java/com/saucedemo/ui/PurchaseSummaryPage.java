package com.saucedemo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseSummaryPage extends PageObject {

  public static final Target BOTON_FINALIZAR = Target.the("el botón confirmar")
      .located(By.linkText("FINISH"));
  public static final Target LABEL_VALOR_NETO_FACTURA = Target.the("el label resumen de compra")
      .located(By.cssSelector("div.summary_subtotal_label"));
}
