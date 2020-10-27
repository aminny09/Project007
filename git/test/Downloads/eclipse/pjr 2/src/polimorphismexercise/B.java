package polimorphismexercise;

public class B extends A {
	
	public void substract(int a,int b) {
		int c=a-b-100;
		System.out.println(c);
		
	}
	public void substract(int x,double y) {
		double r=x-y;
		System.out.println(r);
	}

	public void substract(int g,float d) {
		float n=g+d;
		System.out.println(n);
	}


}
