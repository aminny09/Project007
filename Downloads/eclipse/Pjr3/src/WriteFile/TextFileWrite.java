package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWrite {

	public static void main(String[] args) throws IOException {
		
		String s="data/covid-19.txt";
		
		FileWriter st=new FileWriter(s);
		st.write("Corona should end soon");
		
		st.close();

	}

}
