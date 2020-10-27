package collectionshit;
import java.util.Iterator;
import java.util.HashSet;

public class Iteratorex {
	public static void main(String []args) {
	
	
	HashSet<String> s= new HashSet<String>();
	
	s.add("usa");
	s.add("ny");
	s.add("queens");
	s.add("jamaica");
	
	Iterator<String> st=s.iterator();
	while(st.hasNext()) {
		System.out.println(st.next());
	}
		
	}	

}
