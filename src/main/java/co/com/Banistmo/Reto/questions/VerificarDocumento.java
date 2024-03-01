package co.com.Banistmo.Reto.questions;

import co.com.Banistmo.Reto.utils.ExtraerPDF;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarDocumento implements Question {


    public static VerificarDocumento resultado() {
        return new VerificarDocumento() ;
    }

    @Override
    public Object answeredBy(Actor actor) {
        ExtraerPDF extraerPDF = new ExtraerPDF(actor);
        return extraerPDF.contenidoPDF();
    }
}
