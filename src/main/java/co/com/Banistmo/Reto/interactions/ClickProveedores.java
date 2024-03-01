package co.com.Banistmo.Reto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.Banistmo.Reto.userinterface.MenusBanistmo.*;
import static co.com.Banistmo.Reto.userinterface.MenusBanistmo.BTN_CONOCERMAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class ClickProveedores implements Task {


    public static ClickProveedores clicks() {
        return Tasks.instrumented(ClickProveedores.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_ACEPTARCOOKIES));
        actor.attemptsTo(Click.on(BTN_NOSOTROS));
        actor.attemptsTo(WaitUntil.the(BTN_INFOCORPORAIVA, isCurrentlyVisible()).forNoMoreThan(20).seconds());
        actor.attemptsTo(Click.on(BTN_INFOCORPORAIVA));
        actor.attemptsTo(Click.on(BTN_PROVEEDORES));
        actor.attemptsTo(WaitUntil.the(BTN_CONOCERMAS, isCurrentlyVisible()).forNoMoreThan(20).seconds());
        actor.attemptsTo(Click.on(BTN_CONOCERMAS));
    }
}
