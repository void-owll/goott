package goott;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 파일 복사
 * - Koala.jpg : 원본 이미지 파일
 * - Copied.jpg : 복사된 이미지 파일
 */

/*
 * 1. FileInputStream / FileOutputStream
 *    - 1 바이트 단위로 파일을 처리하는 바이트 기반 입출력 파일 스트림.
 *    - 그림(이미지), 오디오 파일, 비디오 파일 등 모든 종류의 파일 처리가 가능함.
 *    
 * 2. FileReader / FileWriter
 *    - 2 바이트 단위로 파일을 처리하는 문자 기반 입출력 파일 스트림.
 *    - 문자 단위로 파일을 처리하기 때문에 그림, 오디오 파일 등은 처리가 불가능함.
 *    - 문자(2 바이트) 단위로 처리가 되기 때문에 한글이 들어 있는 파일에 처리가 가능함.
 */
public class FileIO_08 {

	public static void main(String[] args) throws Exception {
		InputStream fis = new FileInputStream("C:\\test\\Koala.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		OutputStream fos = new FileOutputStream("C:\\test\\Copied.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while(true) {
			int readByte = bis.read();
			if(readByte == -1) {
				break;
			}
			fos.write(readByte);
		}
		bos.close();
		bis.close();
		fos.close();
		fis.close();
		
		System.out.println("이미지 복사 완료");
	}
}
