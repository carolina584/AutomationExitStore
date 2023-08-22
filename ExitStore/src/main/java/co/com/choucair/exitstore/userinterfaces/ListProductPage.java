package co.com.choucair.exitstore.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ListProductPage {


    public static final Target CLOSE = Target.the("CLOSED").locatedBy("//*[@class='exito-geolocation-3-x-cursorPointer']");
    public static final Target LIST_PRODUCT = Target.the("List Product").locatedBy("//*[@class='vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4']");

}
