package tasks.inventario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import utils.Almacen;

import java.util.Random;

import static userinterfaces.inventario.PaginaInventario.*;

public class Seleccionar implements Task {
    private String articuloSeleccionado;
    private String articuloSeleccionado2;
    private Random random=new Random();

    public static Seleccionar productos() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        seleccionarArticulos();
        Almacen almacen= Almacen.getAlmacen();
        almacen.almacenar("titulo Articulo 1",articuloSeleccionado);
        almacen.almacenar("titulo Articulo 2",articuloSeleccionado2);
        almacen.almacenar("Detalle Articulo 1",TEXTO_DESCRIPCION_PRODUCTO_SELECCIONADO.of(articuloSeleccionado).resolveFor(actor).getText());
        almacen.almacenar("Detalle Articulo 2",TEXTO_DESCRIPCION_PRODUCTO_SELECCIONADO.of(articuloSeleccionado2).resolveFor(actor).getText());
        actor.attemptsTo(
                Click.on(BOTON_AGREGAR_PRODUCTO_SELECCIONADO.of(articuloSeleccionado)),
                Click.on(BOTON_AGREGAR_PRODUCTO_SELECCIONADO.of(articuloSeleccionado2)),
                Click.on(BOTON_CARRITO_DE_COMPRAS)
        );
    }
    private void seleccionarArticulos(){
        String [] inventario={"Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"};
        articuloSeleccionado=inventario[random.nextInt(inventario.length)];
        do {
            articuloSeleccionado2=inventario[random.nextInt(inventario.length)];
        }while (articuloSeleccionado.equals(articuloSeleccionado2));
    }

}
