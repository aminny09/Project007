package Arrayexer;

public class Duplicate {

	public static void main(String[] args) {

		int [] x= {10,10,29,30,29,30,5,5,6,6};
		
		for(int a=0;a<x.length-1;a++) {
			for(int b=a+1;b<x.length;b++) {
				if(x[a]==x[b]){
					System.out.println("duplicate:"+x[b]);
				}
			}
		}
	}

}
