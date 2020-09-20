package arrayexercise;

public class BooleanArray {

	public static void main(String[] args) {
		
		//boolean []st= {true,false,true,true};
		
		boolean []st1=new boolean[4];
		 st1[0]=true;
		 st1[1]=false;
		 st1[2]=true;
		 st1[3]=false;
		 
		 System.out.println(st1[3]);
		 
		
		for(int i=0;i<st1.length;i++) {
			System.out.println(st1[i]);
		}

	}

}
