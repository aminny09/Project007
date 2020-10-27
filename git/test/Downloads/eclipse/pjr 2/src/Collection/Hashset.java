package Collection;

import java.util.*;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> dog=new HashSet<String>();
		
		String a=new String ("animal");
		String b=new String ("cat");
		String c=new String ("fish");
		String d=new String ("dolphin");
		dog.add(a);
		dog.add(b);
		dog.add(c);
		dog.add(d);
		for(String i:dog) {
			System.out.println(i);
		}

	}

}
