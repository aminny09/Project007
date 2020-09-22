package fileRead;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {

		String s="data/usa.txt";
		FileReader dr= new FileReader(s);
		
		int a=dr.read();
		
		while(a!=-1) {
			char v=(char)a;
			System.out.print(v);
			
			
			a=dr.read();
		}
		dr.close();


	}

}
