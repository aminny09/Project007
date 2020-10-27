package Abstractexercise;

public class Cat extends Animal implements Pet {
	
		String name;
		public Cat(String n,int num) {
			super(4);
			name=n;
			System.out.println("cat has leg:" +4);
			
		}
		public Cat(String nm) {
			super(4);
			name=nm;
		}
		public void name() {
			System.out.println("cat name: "+ "kitty");
			
			
		}
		public void eat() {
			System.out.println("Cat eat mouse");
			
		}
	}

