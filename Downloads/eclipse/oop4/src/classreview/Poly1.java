package classreview;

public class Poly1 extends Poly {
	
	public void printsalary(int salary) {
		System.out.println(salary+230);
	}
	
	public void printsalary(int salary,int bonus) {
		System.out.println(salary+bonus);
	}
	
	public void printsalary(int salary,int bonus,int tip) {
		System.out.println(salary+bonus+tip);
	}
	
	public void printsalary(int salary,double bonus) {
		System.out.println(salary+bonus);
		
	}

}