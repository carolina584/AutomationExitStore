package co.com.choucair.exitstore.interactions;

import co.com.choucair.exitstore.userinterfaces.DetailProductPage;
import co.com.choucair.exitstore.userinterfaces.ListProductPage;
import kotlin.random.Random;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProduct implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        int listProduct = ListProductPage.LIST_PRODUCT.resolveAllFor(actor).size();
        Random rand = new Random() {
            @Override
            public int nextBits(int i) {
                return 0;
            }
        };
        int index = rand.nextInt(ListProductPage.LIST_PRODUCT.resolveAllFor(actor).size()-1);
        ListProductPage.LIST_PRODUCT.resolveAllFor(actor).get(rand.nextBits(index)).click();
    }

    public static SelectProduct inExit() {
        return instrumented(SelectProduct.class);
    }
}
