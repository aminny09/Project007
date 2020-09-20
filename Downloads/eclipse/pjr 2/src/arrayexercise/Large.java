package arrayexercise;

public class Large {
	public static void main(String[]args) {
		
		System.out.println(large());
	}

		static int [] st= {10, 21, 303, 50, 34, 409, 20, 11, 33,100};  

	 static int large ( ) {
		int max=st[0];
		for (int i=0;i<st.length;i++) {
		
			if(st[i]>max) {
				max=st[i];
			}
		}
		return max;

	}
	
}
