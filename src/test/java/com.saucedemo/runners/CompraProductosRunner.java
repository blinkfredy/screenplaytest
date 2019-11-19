package com.saucedemo.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/compra_productos.feature",
    glue = {"com.saucedemo.stepdefinitions"}
)
public class CompraProductosRunner {

}
