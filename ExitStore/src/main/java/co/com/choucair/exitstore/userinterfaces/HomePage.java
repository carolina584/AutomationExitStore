package co.com.choucair.exitstore.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.exito.com/")
public class HomePage extends PageObject{

	public static final Target SELECT_CATEGORY_MENU= Target.the("Select category menu").locatedBy("//div[@id='category-menu']");
	public static final Target SELECT_MERCADO = Target.the("Select Mercado").locatedBy("//p[@id='undefined-nivel2-Mercado']");
	public static final Target SELECT_FRUTAS = Target.the("Select Frutas").locatedBy("//a[@href='/mercado/frutas-y-verduras']");

}




