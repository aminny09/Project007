package exercise1;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student amin = new Student(  );
		boolean roll=amin.equal(500,500);
		System.out.println(roll);
	}

	public boolean equal (int x,int y) {
		   boolean result = x==y;
		   return result;
	}
}
