package filehandlingexercise;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
		String s="data/File Handling Shit";
		
		FileReader st=new FileReader(s);
		
		int e=st.read();
		
		while(e!=-1) {
			
			char c=(char)e;
			System.out.print(c);
			
			e=st.read();
			
		}
	}
}
