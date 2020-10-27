package apps;

public class Test {

	public static void main(String []args) {
		Bank st=new Bank(100);
	   st.deposit(500);
	   int result=st.getBalance();
	   System.out.println(result);
	   st.withDraw(200);
	   int result2=st.getBalance();
	   System.out.println(result2);
}

}
