package exercise;

public class Stringreverse {

	public static void main(String[] args) {

		String st="I love my daughter";
		
		for(int x=st.length()-1;x>=0;x--) {
			
			char c=st.charAt(x);
			System.out.print(c);
		}
	}

}
