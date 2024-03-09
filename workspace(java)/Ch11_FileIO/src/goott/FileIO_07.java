package goott;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/*
 * 보조 스트림 관련 클래스
 * - 보조 스트림 : 다른 스트림과 연결되어 여러 가지 편리한 기능을 제공해 주는 스트림을 말함.
 * - 보조 스트림은 중간에 메모리 버퍼(buffer)와 작업을 함으로써
 *   실행의 성능을 향상시킬 수 있음.
 *   예를 든다면 프로그램은 직접 하드 디스크에 데이터를 보내지 않고, 메모리 버퍼에 데이터를 보냄으로써
 *   쓰기 속도가 향상이 됨.
 *   버퍼는 데이터가 쌓이기만을 기다렸다가 버퍼가 꽉 차게 되면 데이터를 한꺼번에 하드 디스크로 보내 줌으로써
 *   출력 횟수를 줄여죽 됨.
 * - 스트림의 기능(성능)을 향상시키는 클래스.
 * - Buffered*** : 버퍼를 제공해 주는 보조 스트림 관련 클래스.
 * - 버퍼(buffer) : CPU 와 IO 간의 속도 차이를 보완해 주는 놈.
 */
public class FileIO_07 {
	public static void main(String[] args) throws Exception {

		// 1. 바이트 스트림 방식으로 이미지 파일을 읽어 오자.
		
		InputStream is = new FileInputStream("C:\\test\\Koala.jpg");
		long start, end;
		start = System.nanoTime();		
		while(is.read() != -1 ) {
			
		}
		end = System.nanoTime();
		
		System.out.printf("바이트 스트림을 이용한 경우 >> %,d ns", (end-start));
		System.out.println();
		// 2. 바이트 스트림에 보조 스트림을 연결하여 이미지 파일을 읽어 오자.
		InputStream is1 = new FileInputStream("C:\\test\\Koala.jpg");
		BufferedInputStream bis = new BufferedInputStream(is1);
		start = System.nanoTime();		
		while(bis.read() != -1 ) {
			
		}
		end = System.nanoTime();
		System.out.printf("보조 스트림을 이용한 경우   >>    %,d ns", (end-start));
		
		is.close();
		bis.close();
		is1.close();
	}
}
