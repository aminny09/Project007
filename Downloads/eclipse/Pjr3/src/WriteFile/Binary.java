package WriteFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binary {

	public static void main(String[] args) throws IOException {

		String dt="data/ireland.JPG";
		FileInputStream st=new FileInputStream(dt);
		
		String dr="amin/ireland.JPG";
		FileOutputStream gt=new FileOutputStream(dr);
		
		int count=0;
		
		int d=st.read();
		
		while(d!=-1) {
			byte w=(byte)d;
			gt.write(w);
			d=st.read();
			count++;

		}
		st.close();
		gt.close();
		System.out.println(count);
		
	}

}
