package classreview;

public class Constractor {
	
	int x;
	String y;
	
	public static void main(String[]args) {
		
	Constractor st=new Constractor(566,"amin");
	
	}
			
	public  Constractor(int nm,String name) {
		x=nm;
		y=name;
		System.out.println("id:"+nm);
		System.out.println("name:"+name);
		
	}

	}


