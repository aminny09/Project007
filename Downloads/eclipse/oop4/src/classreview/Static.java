package classreview;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static st=new Static();
		double d=st.add(20.30,10.30);
		System.out.println(d);
	}
	
	public double add(double x,double y) {
		double z=(x+y);
		return z;
	}

}
