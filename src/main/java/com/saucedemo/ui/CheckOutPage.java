package com.saucedemo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutPage extends PageObject {

  public static final Target CAMPO_NOMBRE = Target.the("el campo nombre")
      .located(By.id("first-name"));
  public static final Target CAMPO_APELLIDO = Target.the("el campo apellido")
      .located(By.id("last-name"));
  public static final Target CAMPO_COD_POSTAL = Target.the("el campo código postal")
      .located(By.id("postal-code"));
  public static final Target BOTON_CONTINUAR = Target.the("el botón continuar")
      .located(By.xpath("//input[@value='CONTINUE']"));

}
