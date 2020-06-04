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
		
		String Datatransfer = "";
			try {
				BufferedReader br2 = new BufferedReader(new FileReader(readFileName));
				String outputbuffer1 = "";
				while ((outputbuffer1 = br2.readLine()) != null) {
					Datatransfer = outputbuffer1;
				}
				br2.close();
				
			} catch (FileNotFoundException ex) {
				Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
			} catch (IOException ex) {
				Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
			}
			try {
				BufferedWriter bv = new BufferedWriter(new FileWriter(writeFileName));
				bv.write(Datatransfer);
				bv.close();
			} catch (IOException ex) {
				Logger.getLogger(ReadAndWriteIO.class.getName()).log(Level.SEVERE, null, ex);
			}
	}
}
