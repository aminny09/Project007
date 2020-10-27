package abstractshit;

public class Animaltest {

	public static void main(String[] args) {

		Fish d = new Fish();
		d.eat();
		d.walk();
		 
		Cat c = new Cat("kitty");
		 c.eat();
		 c.walk();
		 
		 Animal a = new Fish();
		 a.eat();
		 a.walk();
		 
		 Animal e = new Spider();
		 e.walk();
		 e.eat();
		
		 Pet p = new Cat();
		 p.play();
		 
		 
		
		
	}

}
