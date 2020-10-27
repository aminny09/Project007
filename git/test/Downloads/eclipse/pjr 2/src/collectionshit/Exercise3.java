package collectionshit;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Exercise3 {

	public static void main(String[] args) {

		Set<Float>s=new HashSet<Float>();
		
		s.add(10.10f);
		s.add(20.20f);
		s.add(30.30f);
		
		float sum=0f;
		Iterator<Float>r=s.iterator();
		for(Float t:s){
			
			sum=sum+t;
		}
			System.out.println(sum);
	}
}
			
