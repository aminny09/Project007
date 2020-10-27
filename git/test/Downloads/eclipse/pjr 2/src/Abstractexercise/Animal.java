package Abstractexercise;

public abstract class Animal {
	
	int leg;
	
	protected Animal(int num) {
		leg=num;
		
	}
		abstract public void eat();

		public void walk( ) {
			System.out.println("animal walk by the leg");
		}
	
		

}
