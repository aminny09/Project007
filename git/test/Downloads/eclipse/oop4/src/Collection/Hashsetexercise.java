package Collection;
import java.util.*;

public class Hashsetexercise {

	public static void main(String[] args) {
		
		HashSet<String> st=new HashSet<String>();
		
		String b=new String("10");
		String c=new String("20");
		String d=new String("30");
		String e=new String("40");
		
		st.add(b);
		st.add(c);
		st.add(d);
		st.add(e);
		for(String i:st) { 
			System.out.println(i);
		} 	
		

		
	}

}
