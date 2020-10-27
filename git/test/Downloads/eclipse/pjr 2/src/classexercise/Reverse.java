package classexercise;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String st=("we are doing exercise");
		int l=st.length();
		for(int i=l-1;i>=0;i--) {
			char c=st.charAt(i);
			if( c=='d') {
				System.out.println(i);
				
			}
		}
	}

}
