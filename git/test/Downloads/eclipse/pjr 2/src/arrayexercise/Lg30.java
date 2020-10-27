package arrayexercise;

public class Lg30 {

	public static void main(String[] args) {

		int y=print();
		System.out.println(y);
	}

	static int [] xo= {9,7,8,6,5};
   public static int print() {
	   int so=xo[0];
	   for(int x=0;x<xo.length;x++) {
	   if(xo[x]>so) {
		   so=xo[x];
		    
	   }
   }
	   return so;
}
}