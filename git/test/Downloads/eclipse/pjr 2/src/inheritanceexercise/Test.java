package inheritanceexercise;

public class Test {
	
	public static void main(String[]args) {
	
		Labrador st=new Labrador("juna","black");
		st.speak();
		int result=st.getweight(40);
		System.out.println("breedweight:"+result);
		
	}

}
