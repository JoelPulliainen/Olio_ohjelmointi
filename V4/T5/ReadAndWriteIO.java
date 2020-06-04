package Tehtavat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReadAndWriteIO {
	public void readFile(File FileName) {
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
					if(outputbuffer1.trim().length() < 30 && outputbuffer1.trim().length() != 0 && outputbuffer1.indexOf("v") != -1) {
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

	public void unzipZipFile(String Zipfile) throws IOException {
		File destinationDir = new File("unzip");
        if (!destinationDir.exists()) {
            destinationDir.mkdir();
        }
		byte[] bufferforfiledata = new byte[1024];
        ZipInputStream zis = new ZipInputStream(new FileInputStream(Zipfile));
        ZipEntry zipEntry = zis.getNextEntry();
        while (zipEntry != null) {
            File newFile = newFile(destinationDir, zipEntry);
            FileOutputStream fos = new FileOutputStream(newFile);
            int len;
            while ((len = zis.read(bufferforfiledata)) > 0) {
                fos.write(bufferforfiledata, 0, len);
            }
            fos.close();
            zipEntry = zis.getNextEntry();
        }
        zis.closeEntry();
        zis.close();
    }


	public static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
        File destFile = new File(destinationDir, zipEntry.getName());
         
        String destDirPath = destinationDir.getCanonicalPath();
        String destFilePath = destFile.getCanonicalPath();
        System.out.println(destinationDir);
        System.out.println(destFile);
        if (!destFilePath.startsWith(destDirPath + File.separator)) {
            throw new IOException();
        }
         
        return destFile;
    }

}
	


