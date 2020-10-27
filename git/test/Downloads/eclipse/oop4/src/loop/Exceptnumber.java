package loop;

public class Exceptnumber {

	public static void main(String[] args) {

		for(int t=10;t<=20;t++) {
			if(t==15)continue;
			System.out.println(t);
		}
		
		for(int y=10;y<=20;y++) {
			if(!(y==15)) {
				System.out.println(y);
				
			}
		}
	}

}
