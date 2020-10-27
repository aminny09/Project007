package filehandlingexercise;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderexample {

	public static void main(String[] args) throws IOException {

		FileReader sourceFile=null;
		
		sourceFile=new FileReader("data/text.txt");
		
		int temp;
		
		while((temp=sourceFile.read())!=-1) {
			
			System.out.print((char)temp);
		}
		if(sourceFile !=null)
		sourceFile.close();
		}
		
	}


