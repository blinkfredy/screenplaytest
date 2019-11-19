package com.saucedemo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchaseFinishPage extends PageObject {

  public static final Target MENSAJE_CONFIRMACION_COMPRA = Target
      .the("el label de confirmación de compra")
      .located(By.cssSelector("#checkout_complete_container > h2"));
}
