package goott;

import java.util.Scanner;

public class ArrayExam_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 배열 크기 입력 : ");
		String[] str = new String[sc.nextInt()];
		
		/*
		 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * !!매우 중요한 개념!!
		 * 
		 * 배열의 이름은 heap 메모리 영역의 배열이 만들어진 곳의
		 * 시작 주소값을 가지고 있기 때문에, 아래의 문장은
		 * 다른 배열의 배열명에 주소값을 복사해 주는 명령어임.
		 * 즉, 배열의 공유가 이루어지게 됨.
	 	 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★

		 */
		String[] strCopy = str;		// 주소 값을 복사(heap 내에 같은 배열을 가리킴)
		
		System.out.println("str 주소 값 : " + str);
		System.out.println("strCopy 주소 값 : " + strCopy);
		
		// strCopy 배열에 초기값 할당
		for(int i=0 ; i<strCopy.length; i++) {
			System.out.print((i+1)+"번째 문제열 입력 : ");
			strCopy[i] = sc.next();
			
		}
		for (String element : str) {
			System.out.println(element);
		}
		sc.close();
	}
}
