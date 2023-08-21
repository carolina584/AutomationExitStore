package co.com.choucair.exitstore.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class ExitStoreException extends SerenityManagedException{
	/**
	 * 
	*/
	private static final long serialVersionUID = 1L;
	public static final String FOUND_NOT_ELEMENT = "Found Not Element";

	public ExitStoreException(String message, Throwable testErrorException) {
		super(message, testErrorException);
	}
}
