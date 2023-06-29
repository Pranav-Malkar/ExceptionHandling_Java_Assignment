package Exception_Handling;
import java.util.*;

public class CapitalNameDemo {

	public static void main(String[] args) {
		
		try {
			
			
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			String lastname = sc.next();
			
			
			if(name.codePointAt(0) < 65 || name.codePointAt(0) > 90 || lastname.codePointAt(0) < 65 ||  lastname.codePointAt(0) > 90)
				throw new CapitalException();
			else
				System.out.println("Welcome "+name+" "+lastname);
				
		}
		catch(CapitalException e) {
			e.getMessage();
		}
		}

	

}
