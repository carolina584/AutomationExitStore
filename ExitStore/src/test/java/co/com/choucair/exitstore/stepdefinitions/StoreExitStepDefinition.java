package co.com.choucair.exitstore.stepdefinitions;

import org.openqa.selenium.WebDriver;
import co.com.choucair.exitstore.tasks.SelectCategory;
import co.com.choucair.exitstore.userinterfaces.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

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
		System.out.println("iniico sesión");
	}
	
	
	@When("^user select different products$")
	public void userSelectDifferentProducts() {
	    
		user.attemptsTo(SelectCategory.forProduct());
		System.out.println("inicie en el when");
	}
	
	@Then("^user verify the product and their characteristics$")
	public void userVerifyTheProductAndTheirCharacteristics() {
	    
	 //  user.attemptsTo(SearchHotel.forReserve(data.get(0)));
	   System.out.println("then");
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
