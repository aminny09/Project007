package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String []args) throws IOException{
		
		String s="data/usa.txt";
		
		FileWriter st=new FileWriter(s);
		
		st.write("Hi mr trump");
		
		st.close();
		
	
		
	}
}
