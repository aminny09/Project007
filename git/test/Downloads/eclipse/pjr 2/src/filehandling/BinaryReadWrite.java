package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadWrite {

	public static void main(String[] args) throws IOException {

		//1 file location
		String fr="data/p1.JPG";		
		//2 FileInputStream object
		FileInputStream st=new FileInputStream(fr);
	
		//1 file location
		String fw="data/p2.JPG";
		//2 FileOutputStream object
		FileOutputStream fog=new FileOutputStream(fw);
		
		 //3 read the file
		int i=st.read();
		
		while(i!=-1) {
			
			byte a=(byte)i;
			//write this byte to a file
			fog.write(a);
			
			i=st.read()
;		}
		st.close();
		fog.close();
		
	}

}
