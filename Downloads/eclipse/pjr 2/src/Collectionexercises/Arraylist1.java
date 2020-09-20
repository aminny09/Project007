package Collectionexercises;
import java.util.*;

public class Arraylist1 {

	public static void main(String[] args) {
		
		String a=new String("A");
		String b=new String("B");
		String c=new String("c");
		String d=new String("d");
		
     ArrayList<String> st=new ArrayList<String>();
         st.add(a);
         st.add(b);
         st.add(c);
         st.add(d);
         
    	   System.out.println(st);
    	   
          st.remove(b);
      System.out.println(st);
    
      for(String s:st) {
    	 System.out.println(s);
    	 
  	   st.size();
  	   System.out.println(st);

     }
    	 
      
       
	}
}
