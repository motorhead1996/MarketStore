package exception;

public class InvalidPriceException extends IllegalArgumentException {

	public InvalidPriceException(String text) {
		super(text);
	}
}
