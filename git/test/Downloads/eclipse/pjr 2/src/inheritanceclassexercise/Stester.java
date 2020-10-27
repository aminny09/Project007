package inheritanceclassexercise;

public class Stester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 st= new Student1("md","amin",27);
		 st.display();
		Student1 st1=new Student1("lalon","shah", 28);
		st1.display();
		Student1 st2=new Student1("bob","marly", 29);
		st2.display();
		Student1 st3=new Student1("roton","das",30);
		st3.display();
		Student1 st4=new Student1("john","pinkman",31);
		st4.display();
		int d=st.count;
		 System.out.println("student"+d);
	}

}
