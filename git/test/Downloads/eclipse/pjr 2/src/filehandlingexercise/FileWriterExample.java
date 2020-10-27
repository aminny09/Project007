package filehandlingexercise;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args)throws IOException{

		FileWriter st;
		st=new FileWriter("targetfile.txt");
		
	st.write("hello there,\n ");
	st.write("here is some text. ");
	st.write("we are writing\n ");
	st.write("the text to the file.");
	
	st.close();
	}

}
