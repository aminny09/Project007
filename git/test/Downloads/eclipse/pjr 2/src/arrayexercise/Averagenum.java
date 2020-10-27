package arrayexercise;

public class Averagenum {
	
	public static void main(String[]args) {
		
		int a=0;
		int []x= {2,6,4,8,10,12};
		int l=x.length;
		for(int i=0;i<l;i=i+1) {
		a=a+x[i];
		}
		int result=a/l;
		System.out.println(result);
	}

}
