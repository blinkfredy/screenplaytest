# languaje: es

Feature: Compra de productos a través del sitio web Swag Labs
  Yo como usuario final de Swag Labs
  Quiero ingresar al sitio web saucedemo con mi usuario y contraseña asignados
  Para comprar productos deportivos

  Scenario Outline: Realizar un proceso completo de compra
    Given que <nombre> ingresó al sitio web Swag Labs con usuario <usuario> y contraseña secret_sauce
    When agregue al carrito de compras los productos
      | Sauce Labs Backpack      |
      | Sauce Labs Fleece Jacket |
      | Sauce Labs Bike Light    |
    And realice el checkout
    And digite nombre completo <nombre> <apellido> y codigo postal <codigo postal>
    Then en pantalla se indicará un valor neto a pagar de 89.97
    And se mostrará el mensaje THANK YOU FOR YOUR ORDER al confirmar la compra
    Examples:
      | usuario                 | nombre | apellido | codigo postal |
      | standard_user           | John   | Clavijo  | 500050        |
      | problem_user            | Fredy  | Parra    | 100010        |
      | performance_glitch_user | Aldo   | Pistolas | 200002        |