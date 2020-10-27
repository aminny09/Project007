package inheritance;

public class E {

	int id;
	String name;
	
	  E( ){
     this(1,"java");
     }	
	
	  E (int y,String nm){
		this.id=y;
		this.name=nm;
		System.out.println("id:"+id);
		System.out.println("name:"+name);
	}
}

