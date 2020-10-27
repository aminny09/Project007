package polimorphismshitexercise;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager st=new Manager(4000);
		int a=st.salary();
		System.out.println(a);
		
	    Clark st1=new Clark(4000);
		int y=st1.salary();
		System.out.println(y);
		
		
	
	}

}