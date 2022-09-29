package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SignupCompletePage;


public class RegisterComplete implements Task {

    public static RegisterComplete OnThePage() {return Tasks.instrumented(RegisterComplete.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Abcde12345.@").into(SignupCompletePage.INPUT_PASSWORD),
                Enter.theValue("Abcde12345.@").into(SignupCompletePage.INPUT_CONFIRMPASSWORD),
                Click.on(SignupCompletePage.INPUT_TERMOFUSE),
                Click.on(SignupCompletePage.INPUT_PRIVACYSETTING),
                Click.on(SignupCompletePage.INPUT_COMPLETESETUP)

        );

    }
}
