package arrayexercise;

import java.util.Arrays;

public class Lg11 {
	
	public static void main(String[]args) {
		
		int []st= {1,2,3,4,5,6,7,8,20};
		int pig=Arrays.stream(st).max().getAsInt();
		System.out.println(pig);
		
	}

}
