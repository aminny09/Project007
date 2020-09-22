package fileRead;

import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
		
		String h="data/usa.txt";
		
		FileReader st=new FileReader(h);
		
	     int a=st.read();
	     
	     while(a!=-1) {
	    	 
	    	 char c=(char)a;
	    	 System.out.print(c);
	    	 
	    	 
	    	 a=st.read();
	     } 
	    	 st.close();
	     
	     
	     
		
	}

}
