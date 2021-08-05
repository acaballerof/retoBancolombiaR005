package co.com.choucair.certification.RetoBancolombiaR005.questions;

import co.com.choucair.certification.RetoBancolombiaR005.model.BancolombiaData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AnswerTDC implements Question<Boolean>{
    BancolombiaData bancolombiaData;

    public AnswerTDC(BancolombiaData bancolombiaData) {this.bancolombiaData = bancolombiaData; }

    public static AnswerTDC toThe(BancolombiaData bancolombiaData) { return new AnswerTDC(bancolombiaData); }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result = false;
        String currentUrl = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
        if (currentUrl.contains(bancolombiaData.getUrlTextTarjetaDeCredito())) {
            result = true;
        }
        return result;
    }
}
