package method;

public class Opsitenumber {

	public static void main(String[]args) {
	
		Opsitenumber st=new Opsitenumber();
	  int result=st.print(300);
	System.out.println(result);
	}
	
	public int print(int x) {
		int z=-(-x);
		return z;
	}
}
