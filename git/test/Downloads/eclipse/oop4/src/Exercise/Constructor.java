package Exercise;

public class Constructor {
	
	int id;
	String name;

	public static void main(String[] args) {
		
		
        Constructor st=new Constructor(600,"amin");
		
	}
	
	public Constructor(int x,String nm) {
		id=x;
		name=nm;
		System.out.println(id+name);
	}

}
