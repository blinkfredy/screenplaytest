package com.saucedemo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage extends PageObject {

  public static final Target BOTON_CHECKOUT =
      Target.the("el botón checkout")
          .located(By.linkText("CHECKOUT"));
}
