package goott;

import java.util.Scanner;

/*
 * [문제] 키보드로 정수 하나를 입력 받아서 입력 받은 정수가 
 *        5의 배수이면 "이 정수는 5의 배수입니다." 라는
 *        메시지를 화면에 출력해 보세요.
 */
public class IfExam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 5 == 0) {
			System.out.println("이 정수는 5의 배수입니다.");
		}
		sc.close();

	}

}
