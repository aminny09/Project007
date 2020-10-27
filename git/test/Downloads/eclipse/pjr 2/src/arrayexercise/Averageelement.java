package arrayexercise;

public class Averageelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int r=0;
		int [] x= {2,4,6,8,10};
		int l=x.length;
		for(int a=0;a<l;a=a+1) {
			 r=r+x[a];
		}
			int result=r/l;
			System.out.println(result);
		}
	}


