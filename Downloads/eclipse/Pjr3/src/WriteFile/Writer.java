package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) throws IOException {

		String x="amin/information.txt";
		
		FileWriter st=new FileWriter(x);
		st.write("I been living in usa since 2014");
					
		st.close();
	
	}

}
