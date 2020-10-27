package inheritanceshitexercise;

public class Labrador extends Dog{

	String color;
	int breedweight;
	
	public Labrador(String nm,String col,int b) {
		super(nm);
		color=col;
		breedweight=b;		
	}
		
	public 	int getweight( ) {
		return breedweight;		
	}
	public void display() {
		super.display();
		System.out.println(color);
		System.out.println(getweight());
	}
	
	


}