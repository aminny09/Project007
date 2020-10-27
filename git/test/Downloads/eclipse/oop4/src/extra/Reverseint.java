package extra;

public class Reverseint {

	public static void main(String[] args) {

		int x=987654321;
		
		int sum=0;
		while(x!=0) {
		sum=sum*10+x%10;
		
		x=x/10;
		}
		System.out.print(sum);
	
	}
}
