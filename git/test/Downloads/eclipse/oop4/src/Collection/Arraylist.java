package Collection;
import java.util.List;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		List<Integer> bt=new ArrayList<Integer>();
		
		for(int i=1;i<=20;i++)
		bt.add(i);
		System.out.println(bt);
		
		bt.remove(10);
		System.out.println(bt);
		
		bt.size();
		System.out.println(bt);
		
		for(int i=0;i<bt.size();i++) 
			System.out.println(bt.get(i));
		
			
		}
	    
		
			
		
	}


