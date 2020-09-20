package arrayexercise;

import java.util.Arrays;

public class Lg3 {

	public static void main(String[] args) {

		int []tree= {1,2,3,4,5};
		int pit=Arrays.stream(tree).max().getAsInt();
		System.out.println(pit);
	}

}
