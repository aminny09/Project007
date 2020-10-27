package Arrayexer;

public class Dup1 {

	public static void main(String[] args) {

		int [] dr= {1,2,3,4,9,1,2,3,4,5,6,7,8,9};
		
		for(int x=0;x<dr.length;x++) {
			for(int i=x+1;i<dr.length;i++) {
				if(dr[x]==dr[i]) {
					System.out.println(dr[i]);
				}
			}
		}
	}

}
