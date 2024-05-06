package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.Almacen;

import static userinterfaces.carrito.PaginaCarritoCompras.TEXTO_DESCRIPCION_PRODUCTO;
import static userinterfaces.carrito.PaginaCarritoCompras.TITULO_PRODUCTO;

public class ValidarCarrito implements Question<Boolean> {
    private Almacen almacen=Almacen.getAlmacen();

    public static ValidarCarrito contenido() {
        return new ValidarCarrito();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TEXTO_DESCRIPCION_PRODUCTO.of(almacen.obtenerValores("Detalle Articulo 1")).isVisibleFor(actor) && TITULO_PRODUCTO.of(almacen.obtenerValores("titulo Articulo 1")).isVisibleFor(actor) && TEXTO_DESCRIPCION_PRODUCTO.of(almacen.obtenerValores("Detalle Articulo 2")).isVisibleFor(actor) && TITULO_PRODUCTO.of(almacen.obtenerValores("titulo Articulo 2")).isVisibleFor(actor) ;
    }
}
