package userinterfaces.carrito;

import net.serenitybdd.screenplay.targets.Target;



public class PaginaCarritoCompras {
    private PaginaCarritoCompras(){}
    public static final Target TEXTO_DESCRIPCION_PRODUCTO=Target.the("Texto descripcion producto").locatedBy("//div[text()=\"{0}\"]");
    public static final Target TITULO_PRODUCTO=Target.the("Titulo del producto").locatedBy("//div[contains(text(),\"{0}\")]");
}
