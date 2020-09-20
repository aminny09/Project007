package interviewQuestion;

public class StringAllReverseLast {
	
	public  static void main(String []args) {
	
	String s="I live in jamaica";

	String [] words=s.split(" ");
	
	for(int i=0;i<words.length;i++){
		if(i!=words.length-1) {
			System.out.print(words[i] + " ");
		}
		//reverse
		else {
			for(int j=words[i].length()-1;j>=0;j--) {
				System.out.print(words[i].charAt(j));
			}
		}
	}
	
	}

}
