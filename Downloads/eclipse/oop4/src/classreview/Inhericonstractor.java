package classreview;

public class Inhericonstractor {
	
	int id;
	String name;
	
	
	public Inhericonstractor(int num,String nm) {
		id=num;
		name=nm;
		
		System.out.println("id num:"+id);
		System.out.println("name:"+name);
		
	}	
		public void add(int j,int k) {
			int z=j+k;
			System.out.println(z);
		}
	}

