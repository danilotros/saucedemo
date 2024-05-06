package tasks.compra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;

import static userinterfaces.compra.PaginaCompra.*;

public class Completar implements Task {
    private Random random=new Random();

    public static Completar formulario() {
        return Tasks.instrumented(Completar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CHECKOUT),
                Enter.theValue(generarNombres()).into(CAMPO_NOMBRE_COMPRADOR),
                Enter.theValue(generarApellidos()).into(CAMPO_APELLIDO_COMPRADOR),
                Enter.theValue(generarCodigoPostal()).into(CAMPO_CODIGO_POSTAL_COMPRADOR),
                Click.on(BOTON_CONTINUAR),
                Click.on(BOTON_FINALIZAR)
        );

    }
    private String generarNombres(){
        String[] nombres = {
                "Juan", "María", "Carlos", "Laura", "Pedro",
                "Ana", "Luis", "Sofía", "Diego", "Elena",
                "Miguel", "Lucía", "José", "Valeria", "Andrés"
        };
        return nombres[random.nextInt(nombres.length)];
    }
    private String generarApellidos(){
        String[] apellidos = {
                "García", "Fernández", "González", "Rodríguez", "López",
                "Martínez", "Sánchez", "Pérez", "Martín", "Gómez",
                "Díaz", "Hernández", "Moreno", "Muñoz", "Jiménez"
        };
        return apellidos[random.nextInt(apellidos.length)];
    }
    private String generarCodigoPostal(){
        return String.valueOf(random.nextInt(500000-100000)+100000);
    }
}
