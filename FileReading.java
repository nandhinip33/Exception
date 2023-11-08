package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main (String [] args) throws IOException {
		try {
		File f = new File("D:\\name.txt");
		FileReader fr = new FileReader(f);
		int temp =0;
		while((temp=fr.read())!=0) {
			System.out.print((char) temp);
		}
		}
		catch(FileNotFoundException ar) {
			ar.printStackTrace();
		}
	}

}
