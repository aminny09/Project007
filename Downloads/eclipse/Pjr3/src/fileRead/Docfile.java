package fileRead;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Docfile {

	public static void main(String[] args) throws IOException {

		String location="data/doc file.txt";
		FileReader st=new FileReader(location);
		
		int i=st.read();
		
		while(i!=-1) {
			
			char c=(char)i;
			
			System.out.print(c);
			i=st.read();
			
	}
st.close();
	
	}

}
