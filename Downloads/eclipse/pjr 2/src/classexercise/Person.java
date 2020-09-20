package classexercise;

public class Person {

		
		double weight;
		double height;
		
		public Person(double w,double h) {
			weight=w;
			height=h;
		}
			
		public  String getStatus(  ){
			
	  double BMI=703*(weight/(height*height));
		  	   
		   if(BMI<18.5) {
			   return "Below normal weight";
		   }
		   else if(BMI>=18.5 && BMI<25){
		   return "Normal weight";
		   }
			   
			 else if(BMI >= 25 && BMI<30) {
				 return "Overweight";
						
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
	
	public static void main(String[]args) {
		Person st=new Person(160,66);
		String result=st.getStatus();
		System.out.println(result);
		
		
		
	}
}
