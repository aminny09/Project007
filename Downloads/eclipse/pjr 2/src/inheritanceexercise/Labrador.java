package inheritanceexercise;

public class Labrador extends Dog{

	String color;
	
	public Labrador(String nm,String col) {
		super(nm);
		color=col;
		System.out.println("dog color:"+color);
	}
		
	public 	int getweight(int a) {
		int breedweight=a;
		return breedweight;
		
		
	}
	
	


}