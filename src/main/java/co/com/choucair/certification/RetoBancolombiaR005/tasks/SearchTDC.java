package co.com.choucair.certification.RetoBancolombiaR005.tasks;

import co.com.choucair.certification.RetoBancolombiaR005.interactions.SwitchWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.RetoBancolombiaR005.userinterface.BancolombiaPage.*;

public class SearchTDC implements Task {
    public static SearchTDC toThe() { return Tasks.instrumented(SearchTDC.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TDC_BUTTON),
        Click.on(TASAS_BUTTON),
        SwitchWindow.setWindow());
    }
}
