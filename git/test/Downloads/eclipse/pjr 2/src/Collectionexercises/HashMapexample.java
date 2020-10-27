package Collectionexercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapexample {
	
	public static void main(String[]args) {
	
 Map<Integer, String> st = new HashMap<Integer, String>();
 
 st.put(1,"first");
 st.put(2,"second");
 st.put(3,"third");
 st.put(4,"four");
 System.out.println(st);
 System.out.println("value of second:"+st.get(2));
 System.out.println("is HashMap empty:"+st.isEmpty());
 st.remove(3);
 System.out.println(st);
 System.out.println(st.size());
 Set<Integer> key=st.keySet();
 for(Integer i:key) {
	 System.out.println("Value of: "+i + " Is: "+ st.get(i));
 }
		

		
	}

}
