package co.com.choucair.exitstore.questions;

import co.com.choucair.exitstore.userinterfaces.DetailProductPage;
import co.com.choucair.exitstore.userinterfaces.ListProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductName implements Question<Boolean> {

    @Step("{0} Show Name Product")
    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(DetailProductPage.NAME_PRODUCT, isVisible());
        System.out.println("Espero hasta que elemento esté visible");
        return DetailProductPage.NAME_PRODUCT.resolveFor(actor).isVisible();
    }

    public static ProductName validate() {
        return new ProductName();
    }
}
