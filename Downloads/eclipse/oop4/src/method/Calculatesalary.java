 package method;

public class Calculatesalary {
	
	public static void main(String[]args) {
		
	double result=calculateweeklysalary(52000);
	System.out.println(result);
	}
	
	public static double calculateweeklysalary(double salary) {
		int weekinyear = 52;
		double weeklysalary=salary/weekinyear;
		return weeklysalary;
	}

}
