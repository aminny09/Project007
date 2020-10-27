package inhericonstructorexercise;

public class Tester {

	public static void main(String[] args) {
		
		Dog run=new Dog(5);
		run.eat(10, 30);
		run.running(40, 50);
		int r=run.food;
		System.out.println(r);
		
	}

}