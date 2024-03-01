package co.com.Banistmo.Reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.Banistmo.Reto.userinterface.MenusBanistmo.LBL_CONVOCATORIA;

public class VerificarVentana implements Question {

    public static VerificarVentana emergente() {
        return new VerificarVentana();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LBL_CONVOCATORIA).answeredBy(actor);
    }
}
