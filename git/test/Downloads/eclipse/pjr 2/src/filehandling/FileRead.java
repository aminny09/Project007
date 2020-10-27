package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {

		String t="data/bio data.txt";
		
		FileReader st=new FileReader(t);
		
		int s=st.read();
	
		while(s!=-1) {
			
			char r=(char)s;
			System.out.print(r);
			
			s=st.read();

    }
  }
}