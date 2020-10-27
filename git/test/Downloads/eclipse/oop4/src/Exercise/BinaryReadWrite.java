package Exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadWrite {

	public static void main(String[] args) throws IOException {

		String s="data/images.jpg";
		
		FileInputStream st=new FileInputStream(s);
		
		String d="data/depress kill.jpg";
		
		FileOutputStream gt=new FileOutputStream(d);
		
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
