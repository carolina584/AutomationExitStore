package co.com.choucair.exitstore.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import co.com.choucair.exitstore.exceptions.ExitStoreException;
import co.com.choucair.exitstore.interactions.SelectProduct;
import co.com.choucair.exitstore.userinterfaces.HomePage;
import co.com.choucair.exitstore.userinterfaces.ListProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class ChooseProductExit implements Task {

	@Step("Select Choose Product")
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			actor.attemptsTo(
					Click.on(HomePage.SELECT_CATEGORY_MENU),
					Click.on(HomePage.SELECT_MERCADO),
					Click.on(HomePage.SELECT_FRUTAS),
					Scroll.to(ListProductPage.LIST_PRODUCT),
					 WaitUntil.the(ListProductPage.CLOSE, isVisible()),
					 Click.on(ListProductPage.CLOSE),
					 Scroll.to(ListProductPage.LIST_PRODUCT),
					 SelectProduct.inExit());
		} catch (Exception e) {
			throw new ExitStoreException(ExitStoreException.FOUND_NOT_ELEMENT, e);
		}}
	
	public static ChooseProductExit forProduct() {
		return instrumented(ChooseProductExit.class);
	}
}
