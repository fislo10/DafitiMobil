package com.tcs.trainingxi.dafitimovil.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MainPage {

public static Target CUENTA=
                     Target.the("INICIAR").
                             locatedBy("//*[@resource-id='br.com.dafiti:id/root' and @instance='11']");
////*[@resource-id='br.com.dafiti:id/root' and @instance='11']

    public static Target TO_ENTER=
            Target.the("IMG INIT").
                    locatedBy("//*[@resource-id='br.com.dafiti:id/label' and @instance='2']");

    public static Target INGRESAR_CON_EMAIL=
            Target.the("IMG INIT").
                    locatedBy("//*[@resource-id='br.com.dafiti:id/login_button']");

}
