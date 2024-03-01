package co.com.Banistmo.Reto.stepdefinitions;

import co.com.Banistmo.Reto.questions.VerificarDocumento;
import co.com.Banistmo.Reto.questions.VerificarVentana;
import co.com.Banistmo.Reto.tasks.AbrirPagina;
import co.com.Banistmo.Reto.tasks.DescarDocumento;
import co.com.Banistmo.Reto.tasks.InformacionCorporativa;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class BanistmoDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("abro la pagina principal de Banistmo")
    public void abroLaPaginaPrincipalDeBanistmo() {
        OnStage.theActorCalled("Aaron").wasAbleTo(AbrirPagina.url());
    }
    @When("ingreso a infomacion coorporativa y proveedores")
    public void accedoAlMenu() {
        OnStage.theActorInTheSpotlight().wasAbleTo(InformacionCorporativa.ingreso());
    }

    @Then("debo validar la ventana emergente")
    public void deboValidarLaVentanaEmergente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarVentana.emergente(), Matchers.equalTo("Aviso de Convocatoria")));
    }

    @And("Descargo el PDF")
    public void descargoPDF() {
        OnStage.theActorInTheSpotlight().attemptsTo(DescarDocumento.descargar());
    }

    @Then("Valido el documento")
    public void validoeldocumento() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarDocumento.resultado(), Matchers.containsString("BANISTMO, S.A.")));

    }



}
