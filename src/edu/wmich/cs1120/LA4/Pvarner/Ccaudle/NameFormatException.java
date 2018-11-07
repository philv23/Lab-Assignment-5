package edu.wmich.cs1120.LA4.Pvarner.Ccaudle;

public class NameFormatException extends Exception {

	private String name;
	/**
	 * Handle name format exception
	 * @param String name
	 */
	public NameFormatException(String name) {
		this.name = name;
	}
	/**
	 * gets name
	 * @return String name
	 */
	public String getName() {
		return name;
	}
	/**
	 * sets name
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
