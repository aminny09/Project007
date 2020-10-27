package polimorphismexercise;

public class Salary extends Employee{
	
	public int salary(  ) {
		System.out.println("manager salary:"+(base+2000));
       return salary();

	}
	public int salary1( ) {
		System.out.println("clark salary:"+(base+10000));
		return salary1();
	}
}
