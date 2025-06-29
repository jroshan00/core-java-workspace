package implementingExceptionHandling.customException;

public class UnderAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnderAgeException() {
		super("Invalid age");
	}

}
