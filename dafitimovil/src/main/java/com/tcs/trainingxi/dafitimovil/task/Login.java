package com.tcs.trainingxi.dafitimovil.task;
import com.tcs.trainingxi.dafitimovil.models.Credenciales;
import com.tcs.trainingxi.dafitimovil.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
public class Login implements Task {
    private Credenciales credenciales;

    public Login(Credenciales credenciales) {
        this.credenciales = credenciales;
    }

    @Step("login with  #credenciales")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(LoginPage.EMAIL, WebElementStateMatchers.isPresent()));

        actor.attemptsTo(Enter.theValue(credenciales.getUsuario())
                        .into(LoginPage.EMAIL),
                Enter.theValue(credenciales.getPassword())
                        .into(LoginPage.PASSWORD), Click.on(LoginPage.BUTTON_ENTRAR));
    }
    public static Login with(Credenciales credenciales) {

        return Tasks.instrumented(Login.class,credenciales);
    }

}
