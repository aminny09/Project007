package inheritanceexercise;

public class Tax {

	public static void main(String[] args) {

		Taxi fair=new Taxi();
		int t=fair.multiplcation(500,10);
		System.out.println(t);
		
		Taxi1 st=new Taxi1 ();
		st.calculate(100, 10);

	}

}
