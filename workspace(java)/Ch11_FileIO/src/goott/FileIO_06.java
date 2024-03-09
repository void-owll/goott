package goott;
//[문제] FileIO_05 클래스를 읽어 들여서 콘솔 창에 출력하세요.

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class FileIO_06 {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("C:\\NCS\\workspace(java)\\Ch11_FileIO\\src\\goott\\FileIO_05.java"); // reader 스트림으로 파일을 불러옴
			while(true) { 							// 출력을 위한 반복문
				int data = reader.read(); 			// reader 에서 한 글자를 읽어 data 로 저장(int 로 저장됨)
				
				if(data == -1) {					// 받아온 글자가 없으면 -1 이므로 while 문 종료
					break;
				}
				System.out.print((char)(data));		// reader 에서 읽어온 글자를 저장하는 data 를 char 형으로 변환하여 출력
			}
		} catch (Exception e) {
			
		} finally {
			try {
				reader.close();						// reader 스트림 닫기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}							
		}
	}
	 
}
