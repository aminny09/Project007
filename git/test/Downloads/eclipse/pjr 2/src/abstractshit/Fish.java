package abstractshit;

public  class Fish extends Animal {
	
	public Fish() {
		super(0);
		System.out.println("Fish does not have leg");

	}

	public void walk() {
		System.out.println("fish can not walk");
	}
	public void eat() {
		System.out.println("fish eat mud");
	}

}
