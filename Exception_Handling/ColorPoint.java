package Exception_Handling;

public class ColorPoint extends Point {
	String color;
	static String []arr;
	
	
	static {
		 arr = new String []{"black", "blue", "voilet", "red", "green"};
	}
	
	
	public ColorPoint() {
		super();
		color  = "empty";
	}
	public ColorPoint(int x, int y,String color) {
		 super(x,y);
		 this.color = color;
		}
	
	public void checkColor(String c) throws InvalidInputException{
		
		boolean flag = true;
		
		for(int i=0; i<arr.length; i++) {
			if(!c.equalsIgnoreCase(arr[i]))
				flag = false;
		}
		if(flag == false)
			throw new InvalidInputException();
		else
			System.out.println(c);
	}
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + " " + super.toString() + "]";
	}
	
	
	

}
