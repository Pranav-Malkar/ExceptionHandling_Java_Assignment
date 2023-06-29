package Exception_Handling;

public class CapitalException extends Exception {
String message;
	
	
	public CapitalException() {
		message = "Pls enter start letter as Capital ";
	}
	
	public String getMessage() {
		return message;
	}

}
