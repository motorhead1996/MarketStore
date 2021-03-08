package exception;

public class InvalidTurnoverException extends IllegalArgumentException {

	public InvalidTurnoverException(String text) {
		super(text);
	}
}
