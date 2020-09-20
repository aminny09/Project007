package Abstractexercise;

public  class Fish extends Animal {
	
	public Fish(int num) {
		super(num);
		System.out.println("Fish do not have leg");

	}

	public void walk() {
		System.out.println("fish can not walk");
	}
	public void eat() {
		System.out.println("fish eat mud");
	}

}
