package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

public class PhoneNumberFormatException extends Exception {

	private String phoneNumber;
	/**
	 * Handle phone number format exception
	 * @param String phoneNumber
	 */
	public PhoneNumberFormatException(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * gets phoneNumber
	 * @return String phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * sets phoneNumber
	 * @param String phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
