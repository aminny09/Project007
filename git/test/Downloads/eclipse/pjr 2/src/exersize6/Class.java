package exersize6;

public class Class {
	int result;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class st=new Class (200,"amin");
	}

	public Class(int x,String y) {
		result=x;
		name=y;
		System.out.println("id:"+result);
		System.out.println("class name:" +y);
		
		 
	}
}
