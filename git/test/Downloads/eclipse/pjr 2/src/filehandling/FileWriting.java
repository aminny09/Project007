package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException {

		//1. file location		
		String s="data/bio data.txt";
		
		//2 create a object
		FileWriter st=new FileWriter(s);
		
		//3 call the method
		st.write("I born in bd.");
	   
		//4 close the writer 
		st.close();
	}

}
