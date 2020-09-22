package fileRead;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		String s="data/covid-19.txt";
		FileReader st=new FileReader(s);
		int i=st.read();
		while(i!=-1) {
			
			char c=(char)i;
			System.out.print(c);
		  i=st.read();
		}			
			st.close();			
	}
}
