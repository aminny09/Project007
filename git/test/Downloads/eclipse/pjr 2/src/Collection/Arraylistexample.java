package Collection;
import java.util.ArrayList;

public class Arraylistexample {

public static void main(String []args) {
	
	
	String a=new String("A");
	String b=new String("B");
	String c=new String("C");
	String d=new String("D");
	
	ArrayList<String> st=new ArrayList<String>();
		
	st.add(a);
	st.add(b);
	st.add(c);
	st.add(d);
	
	for(String i:st) { 
		System.out.println(i);
  
}
}
}