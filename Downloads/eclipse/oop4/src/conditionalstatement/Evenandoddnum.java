package conditionalstatement;

public class Evenandoddnum {

	public static void main(String[] args) {
		
		method(10);
		method(17);
		
	}
	public static void method(int x) {
		if(x%2==0) {
			System.out.println("This is the even number:" +x);
		}
		else {
			System.out.println("This is the odd number:" +x);
		}
	}

}
		
		