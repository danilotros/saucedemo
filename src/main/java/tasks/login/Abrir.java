package tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.login.PaginaSauceDemo;

public class Abrir implements Task {
    private PaginaSauceDemo paginaSauceDemo;

    public static Abrir laPaginaSauceDemo(){
        return Tasks.instrumented(Abrir.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaSauceDemo)
        );
    }
}
