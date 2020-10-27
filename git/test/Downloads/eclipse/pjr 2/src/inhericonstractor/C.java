package inhericonstractor;

public class C {
	
	public static void main(String[]args) {
		
		B st=new B(500);
		st.result(100,200);
		st.substract(500,200);
		int w=st.x;
		System.out.println(w);
		
	}

}
