package Collection;

import java.util.*;

public class Listexercise {

	public static void main(String[] args) {
		
		ArrayList<String> st=new ArrayList<String>();
		
		String a=new String("Aminal");
		String b=new String("bee");
		String c=new String("fly");
		String d=new String("eat");
		
		st.add(a);
		st.add(b);
		st.add(c);
		st.add(d);
		for(String i:st) {
		System.out.println(i);

		}		
	}

}
