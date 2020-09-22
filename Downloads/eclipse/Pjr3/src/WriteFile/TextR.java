package WriteFile;

import java.io.FileReader;
import java.io.IOException;

public class TextR {

	public static void main(String[] args) throws IOException {

		String hp="amin/car.txt";
		
		FileReader st=new FileReader(hp);
		
		int z=st.read();
		
		while(z!=-1) {
			
			char c=(char)z;
			System.out.print(c);
			
			z=st.read();
		}
	}

}
