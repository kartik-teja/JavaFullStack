package week2_2;

public class NegativeValueException extends Exception {

	private static final long serialVersionUID = 1L;
	String message;

	public NegativeValueException() {
		super();
		message = "Negative Value";
	}

	public NegativeValueException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return message;
	}
}
