package goott;

import java.io.IOException;
import java.io.InputStream;

/*
 * java 에서의 입출력(IO : Input / Output) 방식
 * - 스트림(stream)이라는 방식을 이용함.
 * - 스트림의 사전적 의미 : 시냇물이라는 뜻을 가지고 있음.
 * 							즉, 데이터가 물 흐르는 것처럼 흐른다고 생각하면 됨.
 * - java 에서의 스트림 : 순서가 있는 일련의 연속된 데이터.
 * - 스트림의 종류
 *   1) 바이트 스트림 : 1 바이트 단위로 데이터를 입출력. (byte)
 *   2) 문자 스트림 : 2 바이트 단위로 데이터를 입출력. (char)
 * - java 입출력 관련 클래스 : java.io 패키지에 존재함.
 *   ==> 해당 패키지에 있는 클래스들을 이용하여 파일을 입출력함.
 * - checked 방식의 예외 처리가 적용됨.
 * - java 의 입출력은 단방향성 ==> 한쪽으로만 입력되고, 한쪽으로만 출력이 됨.
 * - FIFO(First In First Out) ==> 먼저 입력되고 먼저 출력이 됨.
 * 
 */
public class FileIO_01 {
	public static void main(String[] args) {
		System.out.println("한 문자를 입력하세요.....");
		// System.in : 표준 입력 장치(키보드)
		InputStream is = System.in;
		try {
			int readByte = is.read();
			System.out.println("읽어온 데이터(ASCII) >> " + readByte);
			System.out.println("읽어온 데이터(문자) >> " + (char)(readByte));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
