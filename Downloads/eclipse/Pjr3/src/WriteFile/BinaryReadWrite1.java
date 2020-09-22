package WriteFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadWrite1 {
	
	public  static void main(String[]args) throws IOException {
		
		String s="data/allah.JPG";
		FileInputStream st=new FileInputStream (s);
		int count=0;
		
		String k="amin/allah.JPG";
		FileOutputStream dr=new FileOutputStream(k);
		
		int r=st.read();
		
		while(r!=-1) {
			byte f=(byte)r;
			dr.write(f);
			count++;
			
			r=st.read();
		}
		st.close();
		dr.close();
		System.out.println(count);
	}

}
