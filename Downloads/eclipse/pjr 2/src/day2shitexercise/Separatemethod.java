package day2shitexercise;

public class Separatemethod {

	static int v1=10;
	static int v2=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result= addition(v1,v2)+multiplication(v1,v2);
		System.out.println(result);
	}

	public static int addition (int x,int y) {
		                    int z=x+y;
		                    return z;
	}
		                    
	public static int multiplication (int a,int b) {
		                      int p = a*b;
		                      return p;
		                      
	}
}
