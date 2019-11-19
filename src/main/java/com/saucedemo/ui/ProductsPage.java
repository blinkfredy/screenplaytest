package com.saucedemo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {

  public static final Target BOTON_AGREGAR =
      Target.the("el botón agregar del producto {0}")
          .locatedBy("//div[contains(text(),'{0}')]/../../..//button[text()='ADD TO CART']");

  public static final Target BOTON_CARRITO_COMPRAS =
      Target.the("el botón carrito de compras")
          .located(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
}
