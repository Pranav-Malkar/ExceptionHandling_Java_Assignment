package Exception_Handling;
import java.util.*;

public class ExceptionPwdDemo {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a String\n");
			String str = sc.next();
			sc.close();
			
			
			if(str.length() > 12)
				throw new PasswordTooLongException();
			else
				throw new PasswordTooShortException();
			
			}
		
		catch(PasswordTooLongException e) {
			System.out.println(e.getMessage());
			}
		catch(PasswordTooShortException e) {
			System.out.println(e.getMessage());
			}
			

	}

}
