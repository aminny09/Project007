package stexercise;

public class Twoargument {
public static void main(String[]args) {

	boolean result=print("cat","cat");
	System.out.println(result);
}

   public static boolean print(String x,String y) {
	       boolean z=x.equals(y);
	       return z;
      
}
}