package co.com.choucair.certification.utest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.*;

public class UtestStepDefintions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Stivens wants to go through the registration process$")
    public void thanStivensWantsToGoThroughTheRegistrationProcess() {
        OnStage.theActorCalled("Stivens").wasAbleTo(OpenUp.thePage(), Join.onThePage());

    }

    @When("^you enter utest registration form$")
    public void youEnterUtestRegistrationForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterPersonal.onThePage(), RegisterAddress.onThePage(), RegisterDevices.onThePage());

    }

    @Then("^the utest registration process ends$")
    public void theUtestRegistrationProcessEnds() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterComplete.OnThePage());


    }


}
