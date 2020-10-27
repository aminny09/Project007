package method;

public class Separatemethod {
	
	int v1=10;
	int v2=20;
	
	public static void main(String[]args) {
	
		int result=add(10,20);
		int t=multiplication(10,20);
		int r=result+t;
		System.out.println(r);
	}
	
	public static int add(int x,int y) {
		    int z=x+y;
		    return z;
	}
	
	public static int multiplication(int a,int b) {
		int c=a*b;
		return c;
	}

}
