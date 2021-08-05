package co.com.choucair.certification.RetoBancolombiaR005.stepdefinitions;

import co.com.choucair.certification.RetoBancolombiaR005.model.BancolombiaData;
import co.com.choucair.certification.RetoBancolombiaR005.questions.Answer;
import co.com.choucair.certification.RetoBancolombiaR005.tasks.OpenUp;
import co.com.choucair.certification.RetoBancolombiaR005.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class validateDocumentStepDefinitions {

    @Before
    public void setStage() { setTheStage(new OnlineCast());}

    @Given("^than Helen want to search an PDF document$")
    public void thanHelenWantToSearchAnPDFDocument() {
        theActorCalled("Helen").wasAbleTo(OpenUp.thePage());
    }

    @When("^she search for the document$")
    public void sheSearchForTheDocument() {
        theActorInTheSpotlight().attemptsTo(Search.toThe());
    }

    @Then("^she finds the PDF document about Politicas de tratamiento y de proteccion de datos personales$")
    public void sheFindsThePDFDocumentAboutPoliticasDeTratamientoYDeProteccionDeDatosPersonales(List<BancolombiaData> bancolombiaData) {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(bancolombiaData.get(0))));
    }
}
