package Exception_Handling;

public class PasswordTooShortException extends RuntimeException{
String message;
	
	
	public PasswordTooShortException() {
		message = "Password too short need to be over 8 char !!";
	}
	
	
	public String getMessage() {
		return message;
	}

}
