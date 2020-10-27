package day3;

public class Staticexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Staticexample c = new Staticexample( );
		int result;		
		result =c.substract (100,200 );
		System.out.println(result);
		  
	}
	public int substract(int x,int y) {
        int z;
        z = x-y;
         return z;
	}       
}
