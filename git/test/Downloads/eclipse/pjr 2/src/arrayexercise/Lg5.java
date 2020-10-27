package arrayexercise;

 import java.util.Arrays;
public class Lg5 {

	public static void main(String[] args) {
		int[] ko= {1,9000,3,900,7};
		int po=Arrays.stream(ko).max().getAsInt();
		System.out.println(po);

		
	}

}
