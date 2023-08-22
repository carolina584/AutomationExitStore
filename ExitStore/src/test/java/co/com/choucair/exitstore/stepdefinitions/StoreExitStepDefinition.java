package co.com.choucair.exitstore.stepdefinitions;

import co.com.choucair.exitstore.questions.ProductName;
import co.com.choucair.exitstore.questions.ProductPrice;
import org.openqa.selenium.WebDriver;
import co.com.choucair.exitstore.tasks.ChooseProductExit;
import co.com.choucair.exitstore.userinterfaces.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StoreExitStepDefinition {

	@Managed(driver= "chrome")
	private WebDriver hisBrowser;

	private Actor user = Actor.named("Carolina");
	private HomePage page;

	@Before
	public void setUp() {
		user.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^a user i want to enter the exit page$")
	public void aUserIWantToEnterTheExitPage() {
		user.wasAbleTo(Open.browserOn(page));
	}

	@When("^user select different products$")
	public void userSelectDifferentProducts() {
		user.attemptsTo(ChooseProductExit.forProduct());
	}
	
	@Then("^user verify the product and their characteristics$")
	public void userVerifyTheProductAndTheirCharacteristics() {
		user.should(seeThat(ProductName.validate()));
		user.should(seeThat(ProductPrice.inStore()));
	}
}
