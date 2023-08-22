package co.com.choucair.exitstore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DetailProductPage {

    public static final Target NAME_PRODUCT = Target.the("Name Product").locatedBy("//*[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-0-x-flexRow--product-detail-name']");
    public static final Target PRODUCT_PRICE = Target.the("Name Price").locatedBy("(//*[@class='exito-vtex-components-4-x-currencyContainer'])[3]");

}
