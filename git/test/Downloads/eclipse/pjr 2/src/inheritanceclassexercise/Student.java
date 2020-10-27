package inheritanceclassexercise;

public class Student {

	String first;
	String last;
	int age;
   static int count=0;
	
	public Student(String name,String nm,int num ) {
		first=name;
		last=nm;
		age=num;
		count++;
	}
	
	public void display() {
		
		System.out.println("first name:"+first);
		System.out.println("last name:"+last);
		System.out.println("age:"+age);
		
	}
}
