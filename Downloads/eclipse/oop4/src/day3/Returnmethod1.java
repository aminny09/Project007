package day3;

public class Returnmethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t;
		t = substract (500,200);
		int u;
		u = substract (200,100);
		int result  = t-u;
		System.out.println(result);
				
	}
 
	public static int substract (int x,int y) {
		                     int z = x-y;
		                     return z;
	}
}
