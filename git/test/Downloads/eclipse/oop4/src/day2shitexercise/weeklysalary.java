package day2shitexercise;

public class weeklysalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result;
		result = calculateweeklysalary(3000);
		System.out.println(result);
	}

	public static double calculateweeklysalary (double yearlysalary) {
		        int weeksinyear = 52;
		        double weeklysalary = yearlysalary/weeksinyear;
		        return weeklysalary;
	}
}
