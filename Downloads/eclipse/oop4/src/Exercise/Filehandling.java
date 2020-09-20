package Exercise;

import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) throws IOException {

		String s="data/country.txt";
		
		FileWriter st=new FileWriter(s);
		
		st.write("I live in the usa");
		st.close();
	}

}

