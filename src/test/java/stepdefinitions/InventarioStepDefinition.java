package stepdefinitions;

import io.cucumber.java.es.Cuando;
import tasks.inventario.Seleccionar;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InventarioStepDefinition {
    @Cuando("el usuario selecciona un producto")
    public void elUsuarioSeleccionaUnProducto() {
        theActorInTheSpotlight().attemptsTo(
                Seleccionar.productos()
        );
    }
}
