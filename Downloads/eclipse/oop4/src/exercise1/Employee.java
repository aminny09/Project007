package exercise1;
public class Employee {

 int ssn;
 String name;
 
   int count=0;

public  Employee(int a,String nm) {
	ssn=a;
	name=nm;
 System.out.println("ssn:"+ssn);
System.out.println("name:"+name);
System.out.println("total number of employee:"+count);
}	 
 }