package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.SignupDevicesPage;


public class RegisterDevices implements Task {
    public static RegisterDevices onThePage() {return Tasks.instrumented(RegisterDevices.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(SignupDevicesPage.INPUT_SEARCHSYSTEM),
                Click.on(SignupDevicesPage.INPUT_SYSTEM),

                Click.on(SignupDevicesPage.INPUT_SEARCHVERSION),
                Click.on(SignupDevicesPage.INPUT_VERSION),

                Click.on(SignupDevicesPage.INPUT_SEARCHLANGUAGE),
                Click.on(SignupDevicesPage.INPUT_LANGUAGE),

                Click.on(SignupDevicesPage.INPUT_SEARCHDEVICE),
                Click.on(SignupDevicesPage.INPUT_DEVICE),

                Click.on(SignupDevicesPage.INPUT_SEARCHMODEL),
                Click.on(SignupDevicesPage.INPUT_MODEL),

                Click.on(SignupDevicesPage.INPUT_SEARCHSYSTEMDEVICE),
                Click.on(SignupDevicesPage.INPUT_SYSTEMDEVICE),

                Click.on(SignupDevicesPage.NEXTLASTSTEP_BUTTON)

        );

    }
}
