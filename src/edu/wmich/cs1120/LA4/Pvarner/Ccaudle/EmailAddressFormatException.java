package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

public class EmailAddressFormatException extends Exception {
	private String email;
	/**
	 * Handle email format exception
	 * @param String email
	 */
	public EmailAddressFormatException(String email) {
		this.email = email;
	}
	/**
	 * gets email
	 * @return String email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * sets email
	 * @param String email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
