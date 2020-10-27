package arrayexercise;

public class Dupl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []x= {4,2,7,3,2,3,7};
		int l=x.length;
		for(int i=0;i<l-1;i=i+1 ) {
		for(int j=i+1;j<l;j=j+1) {
		if(x[i]==x[j]){
		System.out.println("duplicate value:"+x[j]);
				}
		}
		}
		
	}

}
