package Exception_Handling;

public class InvalidCountryException extends Exception {
String message;
	
	
	public InvalidCountryException() {
		message = "User Outside India";
	}
	
	
	public String getMessage() {
		return message;
	}

}
