package week2_2;

public class OutOfRangeException extends Exception {
	private static final long serialVersionUID = 1L;
	String message;

	public OutOfRangeException() {
		super();
		message = "out of range";
	}

	public OutOfRangeException(String message) {
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
