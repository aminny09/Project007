package stringexercise;

public class Num {
	public static void main(String[]args) {
		String trump=("life is so much hard");
		
		for(int r=0;r<trump.length();r++) {
			if(trump.charAt(r)=='u') {
				System.out.println(r);
			}
		}
		
	}

}
