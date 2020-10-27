package arrayexercise;

import java.util.Arrays; 

public class Largestnum { 

	public static void main(String[] args) {

		
	int [] x= {10, 21, 303, 50, 34, 409, 20, 11, 33,100};

	int dog=Arrays.stream(x).max().getAsInt();
	System.out.println("largest num:"+dog);
}
}
