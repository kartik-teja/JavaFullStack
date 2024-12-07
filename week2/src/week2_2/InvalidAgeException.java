package week2_2;

public class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
        super("Age must be between 18 and 59");
    }

    public InvalidAgeException(String message) {
        super(message);
    }

}
