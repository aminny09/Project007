package arrayexercise;

public class Arrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] x;
		x=new int [7];
		x[0]=5;
		x[1]=10;
		x[2]=15;
		x[3]=20;
		x[4]=25;
		x[5]=30;
		x[6]=35;
		int z=x.length;
		for(int i=0;i<z;i=i+1) {
		System.out.println(x[i]);
		}				
	}

}
