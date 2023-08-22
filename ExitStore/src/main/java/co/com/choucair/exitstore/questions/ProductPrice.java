package co.com.choucair.exitstore.questions;

import co.com.choucair.exitstore.userinterfaces.DetailProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class ProductPrice implements Question<Boolean> {
    @Step("{0} Show Name Product")
    @Override
    public Boolean answeredBy(Actor actor) {

        return DetailProductPage.PRODUCT_PRICE.resolveFor(actor).isVisible();
    }

    public static ProductPrice inStore() {
        return new ProductPrice();
    }
}
