package exercise;

public class Reverseint {

	public static void main(String[] args) {

		int num=12345;
		
		int x=0;
		
		while(num !=0) {
			x=x*10+num%10;
			
			num=num/10;
		}
		System.out.println(x);
	}
	
}
