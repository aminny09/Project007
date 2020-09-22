package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class TextW {

	public static void main(String[] args) throws IOException {

		String fast="amin/car.txt";
		
		FileWriter st=new FileWriter(fast);
		
		st.write("I have audi q5");
		
		st.close();
		
	}

}
