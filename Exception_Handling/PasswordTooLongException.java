package Exception_Handling;

public class PasswordTooLongException extends RuntimeException{
String message;
	
	
	public PasswordTooLongException() {
		message = "Password too long need to be under 12 char !!";
	}
	
	
	public String getMessage() {
		return message;
	}

}
