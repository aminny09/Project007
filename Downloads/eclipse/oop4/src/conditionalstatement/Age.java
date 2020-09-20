package conditionalstatement;

public class Age {

	public static void main(String[] args) {
		
		display(20);
		display(15);
		
	}
		public static void display(int x) {		
			
			if(x>=13&&x<=19) {
			System.out.println("you are teen");
			
		}
		else {
			System.out.println("you are not teen");
		}
		
	}
}
