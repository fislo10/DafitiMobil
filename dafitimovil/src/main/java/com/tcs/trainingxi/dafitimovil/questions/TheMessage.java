package com.tcs.trainingxi.dafitimovil.questions;

import com.tcs.trainingxi.dafitimovil.task.Login;
import com.tcs.trainingxi.dafitimovil.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TheMessage implements Question<String> {

    private String option;

    public TheMessage(String option) {
        this.option = option;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(LoginPage.LABELSBIENVENIDO, WebElementStateMatchers.isPresent()));
        return LoginPage.LABELSBIENVENIDO.of(option).resolveFor(actor).getText();
    }

    public static TheMessage was(String opt) {
        return new TheMessage(opt);
    }


}
