package exception;

public class InvalidNameException extends IllegalArgumentException {

	public InvalidNameException(String text) {
		super(text);
	}
}
