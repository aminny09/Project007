package exercise;

import java.util.HashSet;
import java.util.Set;

public class DuplicatedString {

	public static void main(String[] args) {

		
		String []st = {"a","b","c","d","c","e","f"};
		
		for(int a=0;a<st.length;a++) {
			
			for(int b=a+1;b<st.length;b++) {
				if(st[a]==st[b]) {
					
					System.out.println(st[a]);
				}				
			}
		}
			Set<String> gt=new HashSet<String>();
			
			for(String s:st) {
				if(gt.add(s)==false) {
					
					System.out.println(s);
				}
			}
			
		}
	

}
