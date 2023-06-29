package Exception_Handling;
import java.util.*;

public class UserRegister {
	public static void main(String[] args) {
		
		try {
				Scanner sc = new Scanner (System.in);
				System.out.println("Enter location and name");
				String name = sc.next();
				String loc  = sc.next();
				sc.close();
				
				registerUser(name,loc);
			}
		
		catch(InvalidCountryException e) {
			System.out.println(e.getMessage());
			}
		}
		
		public static void registerUser(String name, String location) throws  InvalidCountryException{
			
			if(location.equals("India"))
				System.out.println("User registeration done successfully");
			else
				throw new InvalidCountryException();
		}

}
