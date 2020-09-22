package WriteFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadWrite {

	public static void main(String[] args) throws IOException {

		String a="data/p1.JPG";
		FileInputStream st=new FileInputStream(a);
		
		String b="data/allah.JPG";
		FileOutputStream srt=new FileOutputStream(b);
		int q=st.read();
		
		while(q!=-1) {
			byte y=(byte)q;
			srt.write(y);
			
			q=st.read();
		}
		st.close();
		srt.close();
	}

}
