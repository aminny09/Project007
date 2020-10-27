package stringexercise;

public class Findoutnum {
	
	public static void main(String[]args) {
		
		String top=("i want to go bd");
		for(int x=0;x<top.length();x++) {
			if(top.charAt(x)=='g') {
				System.out.println(x);
			}
		}
	}

}
