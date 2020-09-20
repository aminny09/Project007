package Arrayexer;

public class Ava {

	public static void main(String[] args) {

		
		double [] x= {12.10,10.20,5.8,5.90};
		
		double us=0;
		for(int i=0;i<x.length;i++) {
			us=us+x[i];					
			
		}
		double result=us/x.length;
		System.out.println(result);
		
	}

}
