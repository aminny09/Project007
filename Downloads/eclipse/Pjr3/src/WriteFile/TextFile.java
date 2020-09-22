package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class TextFile {

public static void main(String[] args) throws IOException {

	//1 file location				
   String s="data/myfile.txt";
   
	//2 create a filewriter object  
	FileWriter st=new FileWriter(s);
	
	//3 write something on your file write method
	st.write("This is my data file");
	
	//4 close this file
	st.close();
}
}
