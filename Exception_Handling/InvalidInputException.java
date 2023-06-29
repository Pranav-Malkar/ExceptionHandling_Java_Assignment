package Exception_Handling;

public class InvalidInputException extends Exception {
String message;
	
	
	public InvalidInputException() {
		message = "Invald input";
	}
	

	public String getMessage() {
		return message;
	}
	

}
