package goott;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileIO_02 {
	public static void main(String[] args) {
		// 바이트 스트림 방식
		InputStream is = null;
		try {
			is = new FileInputStream("C:/test/test.txt");
			while(true) {
				int readByte = is.read();
				
				System.out.println("읽은 데이터 : " + (char)(readByte) + ", 남은 바이트 수 : " + is.available());
				
				if(readByte == -1) {
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
