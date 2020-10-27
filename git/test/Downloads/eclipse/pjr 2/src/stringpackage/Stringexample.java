package stringpackage;

public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String me=new String("we are lerning java.");
		int x=me.length();
		System.out.println(x);
		
		char c=me.charAt(8);
		System.out.println(c);
		
		String d=me.substring(7);
		System.out.println(d);
		
		String r=me.substring(7,15);
		System.out.println(r);
		
		boolean b = me.equals("r,w");
		System.out.println(b);
	}

}
