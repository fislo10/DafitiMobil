package com.tcs.trainingxi.dafitimovil.task;

import com.tcs.trainingxi.dafitimovil.userinterface.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class NavigateToLogin implements Task {



    public NavigateToLogin() {

    }

    @Step("Navigate to Login")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(MainPage.CUENTA, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(Click.on(MainPage.CUENTA));
        actor.attemptsTo(WaitUntil.the(MainPage.TO_ENTER, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(Click.on(MainPage.TO_ENTER));

        actor.attemptsTo(WaitUntil.the(MainPage.INGRESAR_CON_EMAIL, WebElementStateMatchers.isPresent()));
        actor.attemptsTo(Click.on(MainPage.INGRESAR_CON_EMAIL));

    }

    public static NavigateToLogin with() {

        return Tasks.instrumented(NavigateToLogin.class);
    }

}
