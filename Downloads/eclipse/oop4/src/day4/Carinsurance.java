package day4;

public class Carinsurance {

	public static void main(String[] args) {

	 int basicinsurance=500;
	 int age = 25;
	 int accidents = 0;
	 
	 
		if(age<25) {
			System.out.println("Insurance premium:"+basicinsurance);
			System.out.println("how many accident did you have:");
			
		}
		switch(accidents) {		  
		case 1:System.out.println("Additional surcharge for accident:" +basicinsurance+50);
		case 2:System.out.println("Additional surcharge for accident:"+basicinsurance+120);
		case 3:System.out.println("Additional surcharge for accident:"+basicinsurance+220);
		case 4:System.out.println("Additional surcharge for accident:"+basicinsurance+370);
		case 5:System.out.println("Additional surcharge for accident:"+basicinsurance+570);
		}
		
		if(accidents>6) {
			System.out.println("no insurance");
		}
	}

}
