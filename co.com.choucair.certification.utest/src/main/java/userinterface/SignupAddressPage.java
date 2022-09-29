package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SignupAddressPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("entrada ciudad").located(By.xpath("//*[contains(@name, 'city')]"));
    public static final Target INPUT_POSTALCODE = Target.the("entrada codigo postal").located(By.xpath("//*[contains(@name, 'zip')]"));
    public static final Target INPUT_SEARCHCOUNTRY = Target.the("seleccionar busqueda pais").located(By.xpath("//*[contains(@name, 'countryId')]"));
    public static final Target INPUT_COUNTRY = Target.the("entrada pais").located(By.xpath("(//*[text()='Colombia'])[2]"));
    public static final Target NEXTDEVICES_BUTTON = Target.the("boton que valida el formulario y pasa a dispositivos").located(By.xpath("//*[contains(@class, 'btn btn-blue')]"));



}