package Collection;

import java.util.ArrayList;

public class Duplist{
	
	public static void main(String []args) {
		
		ArrayList<String> cat=new ArrayList<String>();
		
		String a=new String("amin");
		String b=new String("abir");
		String c=new String("krishna");
		String d=new String("ajit");
		cat.add(a);
		cat.add(b);
		cat.add(c);
		cat.add(d);
		cat.add(a);
		for(String i:cat) {
			System.out.println(i);
		}



	}
}