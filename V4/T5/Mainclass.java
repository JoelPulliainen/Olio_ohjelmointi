package Tehtavat;

import java.io.File;
import java.io.IOException;

public class Mainclass {
	
	public static void main (String[] args) {
		System.out.println( System.getProperty( "user.dir" ) );
		ReadAndWriteIO io = new ReadAndWriteIO();
		try {
			io.unzipZipFile("zipinput.zip");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File s = new File("unzip/testi.txt");
		io.readFile(s);
	}
}
