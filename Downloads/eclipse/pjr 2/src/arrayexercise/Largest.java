package arrayexercise;

import java.util.Arrays;

public class Largest {

	public static void main(String[] args) {
		int [] xo= {9,7,8,6,5};
		int rock=Arrays.stream(xo).max().getAsInt();
		System.out.println(rock);
	}

}
