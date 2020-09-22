package WriteFile;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {

	public static void main(String[] args) throws IOException {

		//1 file location
		String s="data/myfile.txt";
		
		//2 create the filereader object
		FileReader st=new FileReader(s);
		
		//3 read the file using read method
		int x=st.read();
		
		while(x!=-1) {
			char c=(char)x;
			System.out.print(c);
			
			x=st.read();
		}
		
		//4 close the file
	
		
		
	}

}
