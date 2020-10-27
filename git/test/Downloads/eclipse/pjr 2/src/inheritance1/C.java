package inheritance1;

public class C {
	
	public static void main (String []args){
		
		B st=new B(100);
		st.add(10,20);
		st.calculate(50,60);
		int r=st.x;
		System.out.println(r);
	}

}
