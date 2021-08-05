package co.com.choucair.certification.RetoBancolombiaR005.stepdefinitions;

import co.com.choucair.certification.RetoBancolombiaR005.model.BancolombiaData;
import co.com.choucair.certification.RetoBancolombiaR005.questions.Answer;
import co.com.choucair.certification.RetoBancolombiaR005.questions.AnswerTDC;
import co.com.choucair.certification.RetoBancolombiaR005.tasks.OpenUp;
import co.com.choucair.certification.RetoBancolombiaR005.tasks.SearchTDC;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class ValidateTarjetaDeCreditoStepDefinitions {

    @Before
    public void setStage() { setTheStage(new OnlineCast());}

    @Given("^than Helen want to search data about tarjetas de credito$")
    public void thanHelenWantToSearchDataAboutTarjetasDeCredito()  {
        theActorCalled("Helen").wasAbleTo(OpenUp.thePage());
    }

    @When("^she search for information$")
    public void sheSearchForInformation(){
        theActorInTheSpotlight().attemptsTo(SearchTDC.toThe());
    }

    @Then("^she finds the PDF document about Tasas de Tarjetas de crédito$")
    public void sheFindsThePDFDocumentAboutTasasDeTarjetasDeCrédito(List<BancolombiaData> bancolombiaData)  {
        theActorInTheSpotlight().should(seeThat(AnswerTDC.toThe(bancolombiaData.get(0))));
    }
}
