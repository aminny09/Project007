package conditionalstatement;

public class Greatnum {

 public static void main (String []args) {
	 System.out.println(greatnum(7,1));
		System.out.println(greatnum(3,4));
		System.out.println(greatnum(13,6));
		System.out.println(greatnum(1,5));
	 
	 
 } 
		public static boolean greatnum(int a,int b) {
			if(a==7 || b==7) {
				return true;
			}else if(a+b==7) {
				return true;	
			}else if(a-b==7) {
				return true;
			}else {
				return false;
				
			}
			
	}

}
