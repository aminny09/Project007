package collectionshit;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {

	public static void main(String[] args) {

ArrayList<String> name=new ArrayList<String>();
		
		name.add("Your");
		name.add("method");
		name.add("should");
		name.add("switch");
		name.add("the");
		name.add("order");
		
		System.out.println("The Orginal List is :"+name);
		
		// Switch element pair wise
		
		for(int i=0;i<name.size();i=i+2) {
			Collections.swap(name, i, i+1);
		
		System.out.println("The new list is : "+name);
		}	
	}
}