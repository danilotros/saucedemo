package userinterfaces.compra;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;


public class PaginaCompra {
    private PaginaCompra(){}
    public static final Target BOTON_CHECKOUT=Target.the("Boton checkout").located(id("checkout"));
    public static final Target CAMPO_NOMBRE_COMPRADOR=Target.the("Campo nombre comprador").located(id("first-name"));
    public static final Target CAMPO_APELLIDO_COMPRADOR=Target.the("Campo apellido comprador").located(id("last-name"));
    public static final Target CAMPO_CODIGO_POSTAL_COMPRADOR=Target.the("Campo codigo postal comprador").located(id("postal-code"));
    public static final Target BOTON_CONTINUAR=Target.the("Boton continuar").located(id("continue"));
    public static final Target BOTON_FINALIZAR=Target.the("Boton finalizar").located(id("finish"));
    public static final Target TEXTO_CONFIRMACION_COMPRA=Target.the("Texto de confirmacion de compra").located(xpath("//h2[@data-test='complete-header']"));
}
