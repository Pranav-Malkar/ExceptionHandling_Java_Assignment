package Exception_Handling;

public class ColorPointExceptionDemo {

	public static void main(String[] args) {
		
		try {
			ColorPoint c = new ColorPoint(1,2,"green");
			
			System.out.println(c.toString());
			
			c.checkColor("n");
			
			}
		
		catch(InvalidInputException e) {
				System.out.print(e.getMessage());
			}

	}

}
