package filehandlingexercise;

import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {

		String dr="data/news";
		
		FileReader amg=new FileReader(dr);
		
	 int pk=amg.read();
	 
	 while(pk!=-1) {
		 
		 char c=(char)pk;
		 System.out.print(c);
		 
		 
		 pk=amg.read();
		 
	 }
		
	}

}
