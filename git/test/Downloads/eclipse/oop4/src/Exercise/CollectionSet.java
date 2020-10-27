 package Exercise;

import java.util.HashSet;

public class CollectionSet {

	public static void main(String[] args) {

		
		String a="i love usa";
		String b="i love ny";
		String e="i love allah";
		String t="i love my daughter";
		
		HashSet<String> st=new HashSet<String>();
		
		st.add(a);
		st.add(b);
		st.add(e);
		st.add(t);
		for(String g:st) {
			System.out.println(g);
		}	
			st.remove(b);
			System.out.println(st);
		
			int r=st.size();
			System.out.println(r);
		}

}
