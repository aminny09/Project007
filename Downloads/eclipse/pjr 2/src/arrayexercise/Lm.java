package arrayexercise;

public class Lm {
	
	public static void main (String []args) {
		int t=print();
		System.out.println(t);
	}
	
		
		static int [] d= {1,8,9,6,7};
		
		
		public static int print() {
			int ko=d[0];
			for(int t=0;t<d.length;t++) {
				if(d[t]>ko) {
					ko=d[t];
					
				}
			}
		return ko;
		}
	}
		