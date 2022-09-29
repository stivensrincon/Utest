package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestJoinPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//*[contains(@href, '/signup')]"));
}
