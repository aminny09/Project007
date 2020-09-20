package day3;

public class returnmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a = addition (52,40);
		int b;
		b = addition (24,6);
		int result=addition (52,40)-addition(24,6);
		System.out.println(result);
		
	}

	public static int addition (int x,int y) {
		                   int z = x+y;
		                   return z;
	}
}
