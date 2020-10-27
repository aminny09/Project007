package Abstractexercise;

public abstract class Calculate1 {
	
	int a;
	
	public Calculate1(int c) {
		a=c;
		System.out.println(a);
	}
	public static void display() {
		System.out.println();
	}
	
	
	
	abstract public int addition(int x,int y);

}
