package Collectionexercises;
import java.util.ArrayList;
import java.util.List;

public class Exercise5 {

	public static void main(String[] args) {

		List<String> st=new ArrayList<String>();
		
		st.add("life");
		
		for(String r:st) {
			System.out.println(r);
			
			st.remove("life");
			System.out.println(st);
		}
		
	}

}
