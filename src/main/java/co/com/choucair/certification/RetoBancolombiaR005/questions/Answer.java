package co.com.choucair.certification.RetoBancolombiaR005.questions;

import co.com.choucair.certification.RetoBancolombiaR005.model.BancolombiaData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean> {
    BancolombiaData bancolombiaData;

    public Answer(BancolombiaData bancolombiaData) {this.bancolombiaData = bancolombiaData; }

    public static Answer toThe(BancolombiaData bancolombiaData) { return new Answer(bancolombiaData); }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result = false;
        String currentUrl = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
        if (currentUrl.contains(bancolombiaData.getUrlText())) {
            result = true;
        }
        return result;
    }
}
