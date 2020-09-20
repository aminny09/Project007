package Exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
	
	public static void main (String []args) {
		
	
	ArrayList<String> st=new ArrayList<String>();

	
	String a=("A");
	String b=("Boss");
	String c="joo";
	String d="ko";
	
	st.add(a);
	st.add(b);
	st.add(c);
	st.add(d);
	
	for(String h:st) {
		System.out.println(h);
	}
	st.remove(2);
	System.out.println(st);
	
		st.get(0);
		System.out.println(st.size());
		
		Iterator<String> fr=st.iterator();
	}
   
	
	
	
	}

