package practice;
import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String[]args) {
		
		String a="usa";
		String b="bangladesh";
		String c="canada";
		
		ArrayList<String> st=new ArrayList<String>();
		
		st.add(a);
		st.add(b);
		st.add(c);
		
		System.out.println(st);
		
		for(String f:st) 
			System.out.println(f);
		
	}

}
