package co.com.choucair.certification.RetoBancolombiaR005.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SwitchWindow implements Interaction {

    public static SwitchWindow setWindow(){
        return new SwitchWindow();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> theWindow = driver.getWindowHandles();
        for (String currWindow:theWindow){
            driver.switchTo().window(currWindow);
        }
    }
}
