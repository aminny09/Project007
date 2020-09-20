package stringexercise;

public class Stringexercise {

	public static void main(String[] args) {
		String x=new String("i love banngladesh.");
	int z=x.length();
	System.out.println(z);
	
	char c=x.charAt(4);
	System.out.println(c);
	
	String b=x.substring(7);
	System.out.println(b);
	
	boolean d=x.equals("amin,row");
	System.out.println(d);
	
	String a=x.substring(2,6);
	System.out.println(a);
	}
}
