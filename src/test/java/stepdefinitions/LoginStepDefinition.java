package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import models.login.IngresarDatos;
import models.login.TablaDatosUsuario;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.login.Abrir;


import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {
    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }
    @DataTableType
    public TablaDatosUsuario tablaDatosUsuario(Map<String, String> entry) {
        return new TablaDatosUsuario(entry.get("nombre"), entry.get("clave"));
    }
    @Dado("que el usuario ingresa a la pagina de saucedemo")
    public void queElUsuarioIngresaALaPaginaDeSaucedemo() {
        theActorCalled("Daniel").wasAbleTo(Abrir.laPaginaSauceDemo());
    }

    @Cuando("ingresa sus credenciales")
    public void ingresaSusCredenciales(List<TablaDatosUsuario> tablaDatosUsuarios) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatos.con(tablaDatosUsuarios.get(0))
        );
    }
}
