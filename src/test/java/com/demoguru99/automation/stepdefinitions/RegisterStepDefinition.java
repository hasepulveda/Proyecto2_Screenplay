package com.demoguru99.automation.stepdefinitions;

import com.demoguru99.automation.tasks.OpenTheBrowser;
import com.demoguru99.automation.tasks.enterThe;
import com.demoguru99.automation.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static com.demoguru99.automation.userinterface.HomePage.*;

public class RegisterStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private Actor henry = Actor.named("Henry");

    private HomePage homePage;

    @Before
    public void setUp(){
        henry.can(BrowseTheWeb.with(hisBrowser));
        henry.wasAbleTo(OpenTheBrowser.on(homePage));
    }

    @Given("^On the main page enter the registration option$")
    public void onTheMainPageEnterTheRegistrationOption() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        henry.attemptsTo(enterThe.option(REGISTER));
    }

    @When("^he mandatory registration data is entered userName:\"([^\"]*)\" and password:\"([^\"]*)\"$")
    public void heMandatoryRegistrationDataIsEnteredUserNameAndPassword(String arg1, String arg2) throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^should see a message with your name$")
    public void shouldSeeAMessageWithYourName() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

}
