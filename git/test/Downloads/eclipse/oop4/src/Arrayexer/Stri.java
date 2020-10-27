package Arrayexer;

public class Stri {
	public static void main(String[]args) {
	
 String [] ar= {"a","b","a","b","c","c"};
 
   for(int x=0;x<ar.length-1;x++) {
	   for(int y=x+1;y<ar.length;y++) {
		   if(ar[x]==ar[y]) {
			   System.out.println(ar[y]);
		   }
	   }
   }

	}}
