package arrayexercise;

public class Average {
	
	public static void main(String[]args) {
		
		int g=0;
		int [] x= {10,20,30,40,50,60};
		int l=x.length;
		for(int i=0;i<l;i=i+1) {
	     g=g+x[i];
		}
		int result=g/l;
		System.out.println(result);
		}
	}


