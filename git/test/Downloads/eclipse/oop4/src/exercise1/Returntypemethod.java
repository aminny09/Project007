package exercise1;

public class Returntypemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= addition (30,40);
		int t=addition (2,6);
		int u= a+t;	
		System.out.println(u);
	}
 
	public static int addition (int x,int y) {
		          int result = x+y;
		          return result;
	}
}
