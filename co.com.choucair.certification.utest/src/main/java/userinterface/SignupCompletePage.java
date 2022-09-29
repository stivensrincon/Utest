package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SignupCompletePage extends PageObject {


    public static final Target INPUT_PASSWORD = Target.the("entrada contraseña").located(By.xpath("//*[contains(@name, 'password')]"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("entrada confirmar contraseña").located(By.xpath("//*[contains(@name, 'confirmPassword')]"));
    public static final Target INPUT_TERMOFUSE = Target.the("aceptar terminos de uso").located(By.xpath("//*[contains(@name, 'termOfUse')]"));
    public static final Target INPUT_PRIVACYSETTING = Target.the("aceptar politicas de privacidad").located(By.xpath("//*[contains(@name, 'privacySetting')]"));
    public static final Target INPUT_COMPLETESETUP = Target.the("completar registro").located(By.xpath("//*[contains(@aria-label, 'Complete Setup')]"));

}
