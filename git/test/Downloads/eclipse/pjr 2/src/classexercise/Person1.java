package classexercise;

public class Person1 {
	
	public String getBMI(double weight,double height) {
		double  BMI = 703 * (weight/ (height*height));
		
		if(BMI<18.5){
			return "Below normal weight";
		}
		else if(BMI>=18 && BMI <25) {
			return "Normal weight";
		}
		else if(BMI>=25 && BMI <30) {
			return "overweight";		
		}
		else if(BMI>=30 && BMI <35) {
			return "Obesity";
		}
		else if(BMI>=35 && BMI<40) {
			return "Obesity";
		}
		else if(BMI>=40){
			return "Obesity";
		}
		else {
			return "Obesity";
		}
		}      
}
