package Condition;

public class Evenorodd {

	public static void main(String[] args) {

		evenandodd(10);
		evenandodd(30);
		
		
	}
	
	public static void evenandodd(int x) {
		if(x%2==0) {
			System.out.println(x+" is even");
		}
		else {
			System.out.println(x+" is odd");
		}
	}

}
