package filehandlingexercise;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {

		String dog=("data/text");
		
		FileWriter st=new FileWriter(dog);
		
		st.write("A collection of data or information is stored by a name.");
		
		st.close();
		
		
		
	}

}
