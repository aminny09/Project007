package day3;

public class Student {

	int id;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student z=new Student (544,"amin");
	}

	public Student (int  number,String name) {
		             id = number;
		    		  name = name;
		    		  System.out.println("student id"+id);
		    		  System.out.println("student name"+name);
	}
}
