package inheritanceexercise;

public class Toptest {
	
	public static void main(String args[]) {
		
		Top view=new Top();
		double bee=view.addition(10.10,20.10);
		System.out.println(bee);
		
		
		Top2 pot=new Top2();
		pot.result(12.12,23.23);
	}

}