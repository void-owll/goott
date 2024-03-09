package goott;

import java.util.Scanner;

public class ArrayExam_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기를 입력하세요 : ");
		
		String[] str = new String[sc.nextInt()];		// 배열 사이즈에 키 입력 바로 받기
		
		for (int i = 0 ; i<str.length; i++) {
			System.out.println((i+1) + "번째 문자열 입력 : ");
			str[i] = sc.next();
		}
		System.out.println();
		
		for(String element : str) {
			System.out.println(element);
		}
		System.out.print("검색할 문자열을 입력해 주세요. : ");
		String search = sc.next();
		
		for(int i=0 ; i<str.length ; i++) {
			if( search.equals(str[i]) ) {
				System.out.println("찾은 인덱스 >> str[" + i + "]" );
				System.out.println("찾은 문자열 >> " + str[i]);
			}
		}
		sc.close();
	}
}
