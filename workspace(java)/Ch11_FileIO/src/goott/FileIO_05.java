package goott;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/*
 * java 스트림의 종류
 * 1. 바이트 스트림 관련 클래스
 *    - 바이트 스트림 방식으로 데이터를 입출력하는 클래스.
 *      ==> xxxInputStream / xxxOutputStream
 * 
 * 2. 문자 스트림 관련 클래스
 *    - 문자 스트림 방식으로 데이터를 입출력하는 클래스.
 *      ==> xxxReader / xxxWriter
 *      
 * 3. 바이트 스트림 -> 문자 스트림으로 변환하는 클래스. 
 *      ==> InputStreamReader / OutputStreamReader
 *      
 */
public class FileIO_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Writer writer = null;
		
		try {
			writer = new FileWriter("c:/test/test2.txt");
			System.out.println("한 줄을 입력하세요 : ");
			String str = sc.nextLine();
			writer.write(str);
			writer.flush(); 		// buffer 에 있는 내용을 전부 한꺼번에 뿌려라.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 입출력 관련 파일은 종료시켜주는 것이 좋다.
			try {
				writer.close(); // 이 문장을 상위 try 블럭에 바로 쓰는 방법도 있음.!
				sc.close();		// 그렇게 하면 2중 try 문이 필요가 없다.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
