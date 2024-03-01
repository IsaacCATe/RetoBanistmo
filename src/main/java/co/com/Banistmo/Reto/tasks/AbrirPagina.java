package co.com.Banistmo.Reto.tasks;

import co.com.Banistmo.Reto.userinterface.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private PaginaPrincipal paginaPrincipal;


    public static AbrirPagina url() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaPrincipal));
    }
}
