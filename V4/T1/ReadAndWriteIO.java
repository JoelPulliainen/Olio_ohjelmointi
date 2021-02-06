package Tehtavat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadAndWriteIO {
    public void readFile(String FileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(FileName));
			String outputbuffer = "";
			while ((outputbuffer = br.readLine()) != null) {
				System.out.println(outputbuffer);
			}
			br.close();
			
		} catch (FileNotFoundException ex) {
			Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
