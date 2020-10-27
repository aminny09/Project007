package polimorphismexercise;

public class A {

	public void substract(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public void substract(int d,int f,int e) {
      int g=d-f-e;
      System.out.println(g);
	}
	public void substract(int h,String l) {
		String k=h+l;
		System.out.println(k);
	}

}
