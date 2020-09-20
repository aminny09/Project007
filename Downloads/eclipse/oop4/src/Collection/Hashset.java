package Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		
		Set<String> ct=new HashSet<String>();
		
		ct.add("50");
		ct.add("60");
		ct.add("70");
		ct.add("80");
		System.out.println(ct);
		
		System.out.println("Hashset empty:"+ct.isEmpty());
		
		ct.remove("70");
		System.out.println(ct);
		System.out.println("HashSet size:"+ ct.size());
		System.out.println("Hashset index:"+ ct.contains("50"));
		Iterator ko=ct.iterator();
		while(ko.hasNext()) {
			System.out.println(ko.next());
			
		}
			
		
		
		

	}

}
