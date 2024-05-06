package models.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.login.PaginaLogin.CAMPO_NOMBRE_USUARIO;
import static userinterfaces.login.PaginaLogin.CAMPO_CLAVE_USUARIO;
import static userinterfaces.login.PaginaLogin.BOTON_INGRESAR;

public class IngresarDatos implements Task {
    private TablaDatosUsuario tablaDatosUsuario;

    public IngresarDatos(TablaDatosUsuario tablaDatosUsuario) {
        this.tablaDatosUsuario = tablaDatosUsuario;
    }

    public static IngresarDatos con(TablaDatosUsuario tablaDatosUsuario){
        return Tasks.instrumented(IngresarDatos.class,tablaDatosUsuario);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tablaDatosUsuario.getNombre()).into(CAMPO_NOMBRE_USUARIO),
                Enter.theValue(tablaDatosUsuario.getClave()).into(CAMPO_CLAVE_USUARIO),
                Click.on(BOTON_INGRESAR)
        );
    }
}
