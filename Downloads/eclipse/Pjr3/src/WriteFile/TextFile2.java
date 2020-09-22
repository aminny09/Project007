package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class TextFile2 {

	public static void main(String[] args) throws IOException {

		String s="data/doc file.txt";
		
		FileWriter st=new FileWriter(s);
		st.write("carthoon name is donal duck");
		
		st.close();
	}

}
