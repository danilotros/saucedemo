package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.compra.PaginaCompra.TEXTO_CONFIRMACION_COMPRA;

public class ValidarMensajeCompra implements Question<Boolean> {
    private String mensaje;

    public ValidarMensajeCompra(String mensaje) {
        this.mensaje = mensaje;
    }

    public static ValidarMensajeCompra con(String mensaje){
        return new ValidarMensajeCompra(mensaje);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return TEXTO_CONFIRMACION_COMPRA.resolveFor(actor).getText().contains(mensaje);
    }
}
