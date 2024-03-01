package co.com.Banistmo.Reto.tasks;


import co.com.Banistmo.Reto.interactions.ClickProveedores;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.Banistmo.Reto.userinterface.MenusBanistmo.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class InformacionCorporativa implements Task {


    public static InformacionCorporativa ingreso() {
        return Tasks.instrumented(InformacionCorporativa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickProveedores.clicks());
    }
}
