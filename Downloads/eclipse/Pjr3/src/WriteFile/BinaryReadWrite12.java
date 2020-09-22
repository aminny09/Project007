package WriteFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadWrite12 {

	public static void main(String[] args) throws IOException {

		String s="data/p1.jpg";
		
		FileInputStream st=new FileInputStream(s);
		
		String s1="data/p2.jpg";
		
		FileOutputStream gt=new FileOutputStream(s1);
		
		int i=st.read();
		
		while(i!=-1) {
			
			byte b=(byte)i;
		gt.write(b);
			
			i=st.read();
		}
		st.close();
		gt.close();
	}

}
