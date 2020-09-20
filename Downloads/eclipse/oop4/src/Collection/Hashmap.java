package Collection;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		Map <Integer,String> pk=new HashMap<Integer,String>();
		
		pk.put(1,"Make money");
		pk.put(2,"Active");
		pk.put(3,"Travel");
		pk.put(4,"update");
		
		System.out.println(pk);
		System.out.println(pk.get(3));
		System.out.println(pk.isEmpty());
		pk.remove(3);
		System.out.println(pk);
		System.out.println(pk.size());
		Set<Integer>ho=pk.keySet();
		for(Integer lo:ho) {
			System.out.println(ho+ pk.get(lo));
		}

	}

}
