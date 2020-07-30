package com.tcs.trainingxi.dafitimovil.stepsdefinitions;

import com.tcs.trainingxi.dafitimovil.models.Credenciales;
import com.tcs.trainingxi.dafitimovil.questions.TheMessage;
import com.tcs.trainingxi.dafitimovil.task.Login;
import com.tcs.trainingxi.dafitimovil.task.NavigateToLogin;
import com.tcs.trainingxi.dafitimovil.utils.TheApp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


import java.util.List;

public class LoginStepsDefinition {


    @Managed
    private WebDriver appium;

    @Before
    public void setUp() {

        OnStage.setTheStage(Cast.ofStandardActors());

        OnStage.theActorCalled("Juan");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(TheApp.onThePhone().getDriver()));

    }

    @Given("^that the user is in the login section$")
    public void thatTheUserIsInTheLoginSection() {

        OnStage.theActorInTheSpotlight().wasAbleTo(NavigateToLogin.with());
    }

    @When("^I access  account$")
    public void iAccessAccount(List<Credenciales> credenciales) {

        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(credenciales.get(0)));
    }

    @Then("^He should watch a error to password$")
    public void heShouldWatchAErrorToPassword() {
        System.out.println("El deberia ver un error");
    }


    @Then("^He should watch a error to user$")
    public void heShouldWatchAErrorToUser() {
        System.out.println("El deberia ver un error");
    }



    @Then("^He should see (.*)$")
    public void heShouldSeeJdlopezLopez(String op) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheMessage.was(op), Matchers.is(Matchers.equalTo("jdlopez lopez"))));
    }





}
