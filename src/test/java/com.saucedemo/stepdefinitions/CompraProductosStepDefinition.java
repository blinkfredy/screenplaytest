package com.saucedemo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import com.saucedemo.models.Persona;
import com.saucedemo.questions.Factura;
import com.saucedemo.questions.Mensaje;
import com.saucedemo.tasks.AbrirPagina;
import com.saucedemo.tasks.ConfirmarCompra;
import com.saucedemo.tasks.DiligenciarDatos;
import com.saucedemo.tasks.HacerCheckOut;
import com.saucedemo.tasks.IngresarCredenciales;
import com.saucedemo.tasks.AgregarProductos;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.util.List;
import net.serenitybdd.screenplay.abilities.BrowsingTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CompraProductosStepDefinition {

  @Managed(driver = "chrome")
  private WebDriver navegadorWeb;

  @Before
  public void configurarAmbiente() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Dado("^que (.*) ingresó al sitio web Swag Labs con usuario (.*) y contraseña (.*)$")
  public void queIngresoAlSitioWebSwagLabsConUsuarioYContrasena(String nombre,
      String usuario, String clave) {
    theActorCalled(nombre).can(BrowsingTheWeb.with(navegadorWeb));
    theActorInTheSpotlight().wasAbleTo(AbrirPagina.sauceDemo());
    theActorInTheSpotlight().wasAbleTo(IngresarCredenciales.deAcceso(usuario, clave));
  }

  @Cuando("^agregue al carrito de compras los productos$")
  public void agregueAlCarritoDeComprasLosProductos(DataTable productos) {
    List<String> lstProductos = productos.asList(String.class);
    theActorInTheSpotlight().attemptsTo(AgregarProductos.alCarritoDeCompras(lstProductos));
  }

  @Cuando("^realice el checkout$")
  public void realiceElCheckout() {
    theActorInTheSpotlight().attemptsTo(HacerCheckOut.deLaCompra());
  }

  @Cuando("^digite nombre completo (.*) (.*) y codigo postal (.*)$")
  public void digiteNombreCompletoYCodigoPostal(String nombre, String apellido,
      String codigoPostal) {
    Persona persona = new Persona(nombre, apellido, codigoPostal);
    theActorInTheSpotlight().attemptsTo(DiligenciarDatos.personalesDe(persona));
  }

  @Entonces("^en pantalla se indicará un valor neto a pagar de (.*)$")
  public void enPantallaSeIndicaraElValorNetoAPagar(String valorNetoFactura) {
    theActorInTheSpotlight().should(seeThat(Factura.es(), equalTo(valorNetoFactura)));
  }

  @Entonces("^se mostrará el mensaje (.*) al confirmar la compra$")
  public void seMostraraElMensajeAlConfirmarLaCompra(String mensajeEsperado) {
    theActorInTheSpotlight().attemptsTo(ConfirmarCompra.confirmar());
    theActorInTheSpotlight().should(seeThat(Mensaje.es(), equalTo(mensajeEsperado)));
  }


}
