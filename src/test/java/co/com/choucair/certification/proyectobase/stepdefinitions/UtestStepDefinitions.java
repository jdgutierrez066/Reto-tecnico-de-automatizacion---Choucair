package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.UtestData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.JoinToday;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Dado que Juan quiere probar su codigo automatizacion abrimos la pagina Utest.com$")
    public void dadoQueJuanQuiereProbarSuCodigoAutomatizacionAbrimosLaPaginaUtestCom() throws Exception {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUp.thePage());
    }


    @When("^Cuando abre el formulario registro, se llenan todos los campos$")
    public void cuandoAbreElFormularioRegistroSeLlenanTodosLosCampos(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(JoinToday.onThePage(utestData.get(0).getStrFirtsName(),
                utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(),utestData.get(0).getStrMoth(),
                utestData.get(0).getStrDay(),utestData.get(0).getStrYear(), utestData.get(0).getStrPassword(),
                utestData.get(0).getStrRepassword()));
    }

    @Then("^Luego se registra correctamente el usuario encuentra el mensaje$")
    public void luegoSeRegistraCorrectamenteElUsuarioEncuentraElMensajeWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getQuestion())));
    }
}
