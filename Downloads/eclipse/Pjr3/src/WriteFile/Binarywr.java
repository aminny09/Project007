package WriteFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarywr {

	public static void main(String[] args) throws IOException {

		String s="data/allah.jpg";
		
		FileInputStream st=new FileInputStream(s);
		
		String se="data/rahman.jpg";
		
		FileOutputStream ht=new FileOutputStream(se);
		
		int a=st.read();
		
		while(a!=-1) {
			
		   byte b=(byte)a;
		   ht.write(b);	   
			
			a=st.read();
			
		}
		st.close();
		ht.close();
	}

}
