package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import userinterface.SignupAddressPage;



public class RegisterAddress implements Task {
    public static RegisterAddress onThePage() {return Tasks.instrumented(RegisterAddress.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(SignupAddressPage.INPUT_CITY),
                Enter.theValue("Villavicencio").into(SignupAddressPage.INPUT_CITY),
                Enter.theValue("500001").into(SignupAddressPage.INPUT_POSTALCODE),

                Click.on(SignupAddressPage.INPUT_SEARCHCOUNTRY),
                Click.on(SignupAddressPage.INPUT_COUNTRY),
                Click.on(SignupAddressPage.NEXTDEVICES_BUTTON)

        );
    }
}
