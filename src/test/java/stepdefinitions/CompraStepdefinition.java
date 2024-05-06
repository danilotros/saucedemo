package stepdefinitions;

import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import questions.ValidarCarrito;
import questions.ValidarMensajeCompra;
import tasks.compra.Completar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraStepdefinition {
    @Y("visualiza el carrito de compras")
    public void visualizaElCarritoDeCompras() {
        theActorInTheSpotlight().should(seeThat(ValidarCarrito.contenido()));
    }

    @Y("completa el formulario de compra")
    public void completaElFormularioDeCompra() {
        theActorInTheSpotlight().attemptsTo(
                Completar.formulario()
        );
    }

    @Entonces("^se valida el mensaje de finalizancion de compra (.*)$")
    public void seValidaElMensajeDeFinalizancionDeCompra(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidarMensajeCompra.con(mensaje)));
    }
}
