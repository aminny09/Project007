package filehandlingexercise;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite1 {

	public static void main(String[] args) throws IOException {

		
		String srt="data/news";
		
		FileWriter rt=new FileWriter(srt);
		
		rt.write("32k people has died in usa.");
		
		rt.close();
		
	}

}
