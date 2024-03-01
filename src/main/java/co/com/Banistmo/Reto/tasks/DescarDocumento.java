package co.com.Banistmo.Reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actions.SwitchToNewWindow;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.Banistmo.Reto.userinterface.MenusBanistmo.*;

public class DescarDocumento implements Task {


    public static DescarDocumento descargar() {
        return Tasks.instrumented(DescarDocumento.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_DESCARGAR));
        OnStage.theActorInTheSpotlight().attemptsTo(Switch.toNewWindow());
    }
}
