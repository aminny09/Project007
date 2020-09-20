package abstractshit;

public class Cat extends Animal implements Pet {
	
		String name;
		public Cat(String n) {
			super(4);
			name=n;
			System.out.println("Cat has leg:" +4);
			System.out.println("Cat name:"+name);
			
		}
		public Cat() {
			this("kitty");
		}
		public void play() {
			System.out.println("Cat can play");
			
			
		}
		public void eat() {
			System.out.println("Cat eat mouse");
			
		}
	}

