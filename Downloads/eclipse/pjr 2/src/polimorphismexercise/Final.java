package polimorphismexercise;

public class Final extends Parents {
	
	
	public static void print(int x,int y) {
		int z=x+y;
		System.out.println(z);
	}
	private void print(int a,int b,int c ){
		int d=a+b+c; 
		System.out.println(d);
	}
	
	//final void print () {
	//	System.out.println("fly usa");
	}
//}
