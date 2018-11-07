package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

import java.io.FileNotFoundException;

public interface IFormatExceptionHandler {
	/**
	 * Handle file not found exception
	 * @param e
	 */
	void handleFileNotFoundException(FileNotFoundException e);

	/* Handle file not found exception */
	/**
	 * Handle phone number format exception
	 * @param e
	 */
	void handlePhoneNumberFormatException(PhoneNumberFormatException e);

	/* Handle phone number format exception */
	/**
	 * Handle email format exception
	 * @param e
	 */
	void handleEmailFormatException(EmailAddressFormatException e);

	/* Handle email format exception */
	/**
	 * Handle name format exception
	 * @param e
	 */
	void handleNameFormatException(NameFormatException e);
	/* Handle name format exception */

}
