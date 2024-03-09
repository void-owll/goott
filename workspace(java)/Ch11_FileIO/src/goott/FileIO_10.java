package goott;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileIO_10 {

	public static void main(String[] args) {
		FileReader is = null;
		FileWriter os = null;
		try {
			is = new FileReader("C:\\NCS\\workspace(java)\\Ch11_FileIO\\src\\goott\\FileIO_05.java");
			os = new FileWriter("c:\\test\\sample\\sample.txt");
			while(true) {
				int byteCode = is.read();
				System.out.print((char)byteCode);
				if(byteCode == -1) break;
				os.write(byteCode);
			}
			
			System.out.println("FileIO_05.java --> sample.txt 마이그레이션 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
