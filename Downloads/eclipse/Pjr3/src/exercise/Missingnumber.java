package exercise;

public class Missingnumber {

	public static void main(String[] args) {

		
		int[] x= {1,2,10,5,6,4,7,9,3};
		
		int sum=0;
		
		for(int a=0;a<x.length;a++) {
			sum=sum+x[a];
			
		}
			System.out.println(sum);
			
			int sum1=0;
			
			for(int b=1;b<=10;b++) {
				sum1=sum1+b;
				
			}
			System.out.println(sum1);
			
			System.out.println(sum1-sum);
		}
	}


