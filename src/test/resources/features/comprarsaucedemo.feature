  #language: es
 Característica: Verificar la compra en la pagina de saucedemo
   Yo como usuario
   Quiero ingresar a la pagina de saucedemo
   Para realizar la compra de diferentes productos

  Antecedentes:
    Dado que el usuario ingresa a la pagina de saucedemo
    Cuando ingresa sus credenciales
      | nombre        | clave        |
      | standard_user | secret_sauce |

    Escenario: Validar Flujo de compras
      Cuando el usuario selecciona un producto
      Y visualiza el carrito de compras
      Y completa el formulario de compra
      Entonces se valida el mensaje de finalizancion de compra Thank you for your order!
