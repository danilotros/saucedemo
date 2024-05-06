package userinterfaces.inventario;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;


public class PaginaInventario {
    private PaginaInventario(){}
    public static final Target TEXTO_DESCRIPCION_PRODUCTO_SELECCIONADO=Target.the("Texto descripcion producto seleccionado").locatedBy("//div[contains(text(),'{0}')]//parent::a//parent::div//div[@data-test='inventory-item-desc']");
    public static final Target BOTON_AGREGAR_PRODUCTO_SELECCIONADO=Target.the("Boton agregar producto seleccionado").locatedBy("//div[contains(text(),'{0}')]//parent::a//parent::div//parent::div//div[@class='pricebar']//button");
    public static final Target BOTON_CARRITO_DE_COMPRAS=Target.the("Boton carrito de compras").located(xpath("//a[@data-test='shopping-cart-link']"));
}
