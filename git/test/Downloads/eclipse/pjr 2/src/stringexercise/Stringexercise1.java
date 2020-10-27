package stringexercise;

public class Stringexercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String d=new String("i live in queens");
		
		char a=d.charAt(5);
		System.out.println(a);
		
		String e=d.substring(2,10);
		System.out.println(e);
		
		boolean b=d.equals("r,r");
		System.out.println(b);
		
		int t=d.length();
		System.out.println(t);
	}

}
