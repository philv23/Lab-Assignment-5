package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

public interface IContactInformationFormatter {
	/**
	 * reads contact information from a list of files given the file paths
	 * @param String[] filePaths
	 */
	void readContactInformation(String[] filePaths);

	/* read contact information from a list of files given the file paths */
	/**
	 * format the contact information in one file
	 * @param String fileName
	 */
	void formatContactInformation(String fileName);

	/* format the contact information in one file */
	/**
	 * format one email address
	 * @param email
	 * @throws EmailAddressFormatException
	 */
	void formatEmail(String email) throws EmailAddressFormatException;

	/* format one email address */
	/**
	 * Format one phone number
	 * @param String phoneNumber
	 * @throws PhoneNumberFormatException
	 */
	void formatPhoneNumber(String phoneNumber) throws PhoneNumberFormatException;

	/* Format one phone number */
	/**
	 * format one name
	 * @param String name
	 * @throws NameFormatException
	 */
	void formatName(String name) throws NameFormatException;
	/* format one name */

}
