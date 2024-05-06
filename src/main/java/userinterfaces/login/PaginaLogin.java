package userinterfaces.login;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class PaginaLogin {
    private PaginaLogin(){}
    public static final Target CAMPO_NOMBRE_USUARIO=Target.the("Campo nombre de usuario").located(id("user-name"));
    public static final Target CAMPO_CLAVE_USUARIO=Target.the("Campo clave de usuario").located(id("password"));
    public static final Target BOTON_INGRESAR=Target.the("Boton ingresar usuario").located(id("login-button"));
}
