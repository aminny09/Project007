package constractorshitexercise;
public class Employee {

 int ssn;
 String name;
 
  static int count=0;

public  Employee(int a,String nm) {
	ssn=a;
	name=nm;
	count++;
	
	
 System.out.println("ssn:"+ssn);
System.out.println("name:"+name);

}	 
 }