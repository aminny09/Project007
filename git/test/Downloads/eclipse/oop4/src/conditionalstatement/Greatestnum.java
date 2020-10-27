package conditionalstatement;

public class Greatestnum {
	
	public static void main (String[]args) {
	
		int x=25,y=5,z=45;
		
			if(x>=y && x>=z) {
		
			System.out.println(x+" is the largest number");
			}
		
		else if(y>=x && y>=z) {
			System.out.println(y+" is the largest number");
		}
		else {
		System.out.println(z +" is the largest number");
	}
}
}


