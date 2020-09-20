package examplenoargumentorargument;

public class Argument {

	int id;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Argument st= new Argument (2,"Amin");
	}

	public Argument (int number,String name) {
	  id = number;
	  name = name;
	  System.out.println("Argument id"+id);
	  System.out.println("Argument name"+name );
	}
		    }