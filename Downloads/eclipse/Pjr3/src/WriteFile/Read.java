package WriteFile;

import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {


		String dr="amin/information.txt";
		
		FileReader st=new FileReader(dr);
	   int count=0;
        int r=st.read();
		
		while(r!=-1) {
			char c=(char)r;
			System.out.print(c);
			count++;
			r=st.read();		
		}
		System.out.println(count);
	}
}
