package goott;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 다중 catch 문
 * - catch 문을 여러 개 사용하여 처리하는 방식.
 * - catch 문은 순차적으로 위에서 아래로 실행이 됨.
 * - 주의) 예외를 처리하는 가장 최상위의 Exception
 *        클래스는 맨 마지막에 나와야 함.
 *        (만약 맨 첫 줄에 나오는 경우 error 발생)
 */


public class Exception_07 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		String str = "sejong";
		
		int[] arr = {10, 20, 30, 40, 50};
		
		try {
			num = sc.nextInt();  // 예외 발생할 가능성이 있는 코드
			
			System.out.println("str 문자열의 길이 >>> " + str.length());
		
			arr[5] = 60;
			
		}catch(InputMismatchException e1) {
			
			System.out.println("정수만 입력하세요...");
			System.out.println("예외 정보 >>> " + e1);
			
		}catch(NullPointerException e2) {
			
			System.out.println("null 값이 들어왔어요...");
			System.out.println("예외 정보 >>> " + e2);
			
		}finally {
			sc.close();
		}
		
		
		System.out.println("프로그램 종료");

	}

}
