package goott;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileIO_03 {
	public static void main(String[] args) {
		InputStream is = null;
		int readByte;
		try {
			is = new FileInputStream("C:\\Windows\\system.ini");
			while( (readByte = is.read()) != -1) {
				System.out.print((char)readByte);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
