package interviewQuestion;

public class StringReverseLast {
	

	public static void main(String []args) {
		

  String st="i'm going to niagra falls";
  for(int i=st.length()-1;i>=0;i--) {
	  
   char c=st.charAt(i);
       if(c!=' ') {
	   System.out.print(c);
   }
   else {
	   break;
   
   }
  }
}}
  
