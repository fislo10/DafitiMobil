package com.tcs.trainingxi.dafitimovil.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static Target EMAIL=
            Target.the("Email").
                    locatedBy("//*[@resource-id='br.com.dafiti:id/user_identification']");

    public static Target PASSWORD=
            Target.the("Password").
                    locatedBy("//*[@resource-id='br.com.dafiti:id/user_password']");

    public static Target BUTTON_ENTRAR=
            Target.the("Entrar").
                    locatedBy("//*[@resource-id='br.com.dafiti:id/login_or_create_button']");

    public static Target LABELSBIENVENIDO=
            Target.the("Bienvenido").
                    locatedBy("//*[@resource-id='br.com.dafiti:id/account_name']");

}
