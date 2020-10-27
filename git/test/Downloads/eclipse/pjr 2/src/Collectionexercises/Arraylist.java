package Collectionexercises;

import java.util.List;
import java.util.ArrayList;
public class Arraylist{
	public static void main(String []args) {
		
		List<Integer> st=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) 
			st.add(i);
			System.out.println(st);
			
			st.remove(5);
			System.out.println(st);
			
			for(int i=0;i<st.size();i++)
				st.get(i);
				System.out.println(st);
			
			
		
		
	}
	
	
}