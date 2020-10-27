package Collectionexercises;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetexample {

	public static void main(String[] args) {
		
		Set<String>fish=new HashSet<String>();
		
		fish.add("1");
		fish.add("2");
		fish.add("3");
		fish.add("4");
		fish.add("1");
		System.out.println(fish);
		System.out.println("is hashset empty:"+ fish.isEmpty());
		
		fish.remove("3");
		System.out.println(fish);
		System.out.println("Size of the Hashset:" + fish.size());
		System.out.println("does hashset contain firsh element:"+ fish.contains("3"));

		Iterator<String>st=fish.iterator();
		while(st.hasNext()) {
			System.out.println(st.hasNext());
		}
	}

}
