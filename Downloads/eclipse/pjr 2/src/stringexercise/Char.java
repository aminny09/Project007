package stringexercise;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st=new String("my name is amin");
		
		char x=st.charAt(3);
		System.out.println(x);
		
		String d=st.substring(3,7);
		System.out.println(d);
		
		boolean o=st.equals(st);
		System.out.println(o);
		
		int y=st.length();
		System.out.println(y);
		
		String t=st.substring(6);
		System.out.println(t);
		
		

	}

}
