package Abstractexercise;

public class Animaltest {

	public static void main(String[] args) {

		Fish d = new Fish(0);
		d.eat();
		d.walk();
		 
		Cat c = new Cat("Fluffy",4);
		 c.eat();
		 c.name();
		 
		 Animal a = new Fish(0);
		 a.eat();
		 a.walk();
		 
		 Animal e = new Spider(8);
		 e.walk();
		 e.eat();
		 Pet p = new Cat("kitty");
		 p.name();
		
		
	}

}
