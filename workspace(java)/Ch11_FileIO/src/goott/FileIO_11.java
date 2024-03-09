package goott;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileIO_11 {
	public static void main(String[] args) {
		File temp = new File("c:/Windows/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm"); // MM = 월, mm = 분, a = 오전/오후
		// listFiles() 
		//  ==> 디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를 확인하여 File 객체 배열로 반환해 주는 메서드.
		File[] contents = temp.listFiles();
		System.out.println("이름\t\t형태\t\t크기\t\t날짜\t\t시간");
		System.out.println("-----------------------------------------------------------------------------------------------");
		for(File file : contents) {
			if(!file.isDirectory())  System.out.print(file.getName()+"\t"+file.length());							// 폴더냐? 물어보는 것
			else System.out.println("<DIR>" + file.getName());
			System.out.print(sdf.format(new Date(file.lastModified())));	//lastModified() = 마지막 수정 시간과 날짜
			System.out.println();
		}
	}
}
