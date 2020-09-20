package arrayexercise;

public class Duplicatevalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []x= {1,3,5,6,5,6,3};
		int z=x.length;
		for(int a=0;a<z-1;a=a+1) {
			for(int b=a+1;b<z;b=b+1) {
		if((x[a]==x[b])&&(a!=b)) {
			System.out.println("duplicate value:"+x[b]);
		}
			}
		}
		
	}

}
