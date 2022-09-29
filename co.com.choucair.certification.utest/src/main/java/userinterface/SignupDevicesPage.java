package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SignupDevicesPage extends PageObject{
    public static final Target INPUT_SEARCHSYSTEM = Target.the("seleccionar busqueda sistema operativo").located(By.xpath("//*[contains(@name, 'osId')]"));
    public static final Target INPUT_SYSTEM = Target.the("entrada sistema operativo").located(By.xpath("(//*[text()='Windows'])[2]"));
    public static final Target INPUT_SEARCHVERSION = Target.the("seleccionar busqueda version").located(By.xpath("//*[contains(@name, 'osVersionId')]"));
    public static final Target INPUT_VERSION = Target.the("entrada version").located(By.xpath("//*[text()='Windows 10 ']"));
    public static final Target INPUT_SEARCHLANGUAGE = Target.the("seleccionar busqueda idioma").located(By.xpath("//*[contains(@name, 'osLanguageId')]"));
    public static final Target INPUT_LANGUAGE = Target.the("entrada idioma").located(By.xpath("//*[text()='English']"));
    public static final Target INPUT_SEARCHDEVICE = Target.the("seleccionar busqueda dispositivo").located(By.xpath("//*[contains(@name, 'handsetMakerId')]"));
    public static final Target INPUT_DEVICE = Target.the("entrada dispositivo").located(By.xpath("//*[text()='Xiaomi']"));
    public static final Target INPUT_SEARCHMODEL = Target.the("seleccionar busqueda modelo dispositivo").located(By.xpath("//*[contains(@name, 'handsetModelId')]"));
    public static final Target INPUT_MODEL = Target.the("entrada modelo dispositivo").located(By.xpath("//*[text()='Redmi Note 9S']"));
    public static final Target INPUT_SEARCHSYSTEMDEVICE = Target.the("seleccionar busqueda sistema operativo dispositivo").located(By.xpath("//*[contains(@name, 'handsetOSId')]"));
    public static final Target INPUT_SYSTEMDEVICE = Target.the("entrada sistema operativo dispositivo").located(By.xpath("//*[text()='Android 11']"));
    public static final Target NEXTLASTSTEP_BUTTON = Target.the("boton que valida el formulario y pasa a contraseña").located(By.xpath("//*[contains(@aria-label, 'Next - final step')]"));
}
