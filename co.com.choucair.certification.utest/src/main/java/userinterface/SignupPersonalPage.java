package userinterface;

        import net.serenitybdd.core.annotations.findby.By;
        import net.serenitybdd.core.pages.PageObject;
        import net.serenitybdd.screenplay.targets.Target;

public class SignupPersonalPage extends PageObject {

    public static final Target INPUT_FIRSTNAME = Target.the("entrada nombre").located(By.xpath("//*[contains(@name, 'firstName')]"));
    public static final Target INPUT_LASTNAME = Target.the("entrada apellido").located(By.xpath("//*[contains(@name, 'lastName')]"));
    public static final Target INPUT_EMAIL = Target.the("entrada correo").located(By.xpath("//*[contains(@name, 'email')]"));
    public static final Target INPUT_MONTH = Target.the("entrada mes").located(By.xpath("//*[contains(@name, 'birthMonth')]"));
    public static final Target INPUT_DAY = Target.the("entrada dia").located(By.xpath("//*[contains(@name, 'birthDay')]"));
    public static final Target INPUT_YEAR = Target.the("entrada año").located(By.xpath("//*[contains(@name, 'birthYear')]"));
    public static final Target INPUT_LANGUAGES = Target.the("entrada lenguaje").located(By.xpath("//*[contains(@type, 'search')]"));
    public static final Target NEXTLOCATION_BUTTON = Target.the("boton que valida el formulario y pasa a direccion").located(By.xpath("//*[contains(@aria-label, 'location')]"));
}