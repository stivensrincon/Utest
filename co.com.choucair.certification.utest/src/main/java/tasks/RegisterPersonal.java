package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.SignupPersonalPage;

public class RegisterPersonal implements Task {
    public static RegisterPersonal onThePage() { return Tasks.instrumented(RegisterPersonal.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue("Juanito").into(SignupPersonalPage.INPUT_FIRSTNAME),
                Enter.theValue("Perez").into(SignupPersonalPage.INPUT_LASTNAME),
                Enter.theValue("juanitoperez12@gmail.com").into(SignupPersonalPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("July").from(SignupPersonalPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText("8").from(SignupPersonalPage.INPUT_DAY),
                SelectFromOptions.byVisibleText("1993").from(SignupPersonalPage.INPUT_YEAR),
                Enter.theValue("Spanish").into(SignupPersonalPage.INPUT_LANGUAGES),
                Click.on(SignupPersonalPage.NEXTLOCATION_BUTTON)

        );

    }
}
