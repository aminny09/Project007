package Arrayexer;

public class Dup {
	
	public static void main(String []args) {
		
		int [] us= {1,1,3,5,5,3,4,9,9,8,8,10,10};
		
		for(int r=0;r<us.length;r++) {
			
			for(int i=r+1;i<us.length;i++) {
				
				if(us[r]==us[i]) {
					
					System.out.println(us[i]);
				
			}
		}
	}
}
}
