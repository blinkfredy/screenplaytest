package com.saucedemo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/index.html")
public class LoginPage extends PageObject {

  public static final Target CAMPO_USUARIO = Target
      .the("el campo nombre de usuario").located(By.id("user-name"));

  public static final Target CAMPO_CLAVE = Target
      .the("el campo clave").located(By.id("password"));

  public static final Target BOTON_LOGIN = Target
      .the("el boton login").located(By.xpath("//input[@value='LOGIN']"));
}
