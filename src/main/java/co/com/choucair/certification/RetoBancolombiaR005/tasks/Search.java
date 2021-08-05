package co.com.choucair.certification.RetoBancolombiaR005.tasks;


import co.com.choucair.certification.RetoBancolombiaR005.interactions.SwitchWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

import static co.com.choucair.certification.RetoBancolombiaR005.userinterface.BancolombiaPage.*;

public class Search implements Task {

    public static Search toThe() { return Tasks.instrumented(Search.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ACERCA_DE_NOSOTROS_BUTTON),
                Click.on(INFORMACION_CORPORATIVA_BUTTON),
                Click.on(PROVEEDORES_BUTTON),
                Click.on(DESCARGAR_DOCUMENTO_BUTTON),
                SwitchWindow.setWindow());
    }
}
