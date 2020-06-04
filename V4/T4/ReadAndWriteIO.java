package Tehtavat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
	
	public void readAndWrite(String readFileName, String writeFileName) {
			try {
				BufferedReader br2 = new BufferedReader(new FileReader(readFileName));
				BufferedWriter bv = new BufferedWriter(new FileWriter(writeFileName));
				String outputbuffer1 = "";
				while ((outputbuffer1 = br2.readLine()) != null) {
					
					if(outputbuffer1.trim().length() < 30) {
						bv.write(outputbuffer1);
						bv.write("\n");
					}
				}
				br2.close();
				bv.close();
				
			} catch (FileNotFoundException ex) {
				Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
			} catch (IOException ex) {
				Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
			}

	}
}
