package Exercise;

import java.io.FileReader;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args) throws IOException {

		String s="data/country.txt";
		
		FileReader st=new FileReader(s);
		
		int i=st.read();
		
		while(i!=-1) {
			
			char d=(char)i;
			System.out.print(d);
			
			
			
			i=st.read();
		}
		
	}

}
