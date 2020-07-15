package org.simplenativehooks.events;

@SuppressWarnings("serial")
public class InvalidKeyEventException extends Exception {
	private final String error;

	public InvalidKeyEventException(String error) {
		this.error = error;
	}

	public String getError() {
		return error;
	}
}
