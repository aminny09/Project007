package arrayexercise;

public class Lg {

	public static void main(String[]args) {
		System.out.println(large());
	}

          static int [] us= {2,6,5,3,9,50};
          
	

	static int large( ) {
		int max=us[0];
		for(int i=0;i<us.length;i++) {
			if(us[i]>max) {
				max=us[i];
			 
			
		}
	}
		return max;

}
}
