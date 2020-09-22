package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class Write12 {
	
	public static void main(String []args) throws IOException {
		
		String s="data/usa.txt";
		
		FileWriter st=new FileWriter(s);
		
		st.write("ny state");
		
		st.close();
	}

}
