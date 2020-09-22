package exercise;

public class Stringjunkremove {
	
	public static void main(String []args) {
		
		String a="@##@##@#@566@@@@ java @#$$##%$3456 selenium";
		
		a=a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);
	}
}
