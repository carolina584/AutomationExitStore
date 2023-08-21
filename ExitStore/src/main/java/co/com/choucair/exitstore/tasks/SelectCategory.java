package co.com.choucair.exitstore.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.choucair.exitstore.exceptions.ExitStoreException;
import co.com.choucair.exitstore.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class SelectCategory implements Task {

	@Step("Select Category Product")
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			actor.attemptsTo(Click.on(HomePage.SELECT_CATEGORY_MENU),
					Click.on(HomePage.SELECT_MERCADO),
					Click.on(HomePage.SELECT_FRUTAS));
		} catch (Exception e) {
			throw new ExitStoreException(ExitStoreException.FOUND_NOT_ELEMENT, e);
		}}
	
	public static SelectCategory forProduct() {
		return instrumented(SelectCategory.class);
	}
}
