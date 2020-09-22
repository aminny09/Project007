package binaryReadWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteRead {
	
	public static void main(String[]args) throws IOException {
		
		String h="data/images.JPG";
		
		FileInputStream st=new FileInputStream(h);
		
		String w="amin/Depresiton kill.JPG";
		FileOutputStream fr=new FileOutputStream(w);
		int count=0;
		int t=st.read();
		
		while(t!=-1) {
			byte f=(byte)t;
			fr.write(f);
			count++;
			t=st.read();

		}
		st.close();
		fr.close();
		System.out.println(count);
		
	}

}
