package constractorshitexercise;

public class Employee11 {

	String name;
	int ssn;
	int salary;
	
	public Employee11(String nm,int num,int yearlysalary) {
		  name=nm;
		  ssn=num;
		  salary=yearlysalary;
		  System.out.println("name:" +name);
		  System.out.println("ssn:" +ssn);
		System.out.println("salary:" +salary);  
	}	  
		 
	public static double calculate(double sal) {
						double bonusofsalary =sal/10;
						return bonusofsalary;
		  }
	}

