package goott;

import java.util.Scanner;

public class IfElseExam_08 {

	public static void main(String[] args) {
		/*
		 * [문제2] 키보드로부터 입력 받은 정수가 홀수인지 아니면 짝수인지 판별하여
		 * 		   화면에 메시지를 출력해 보세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("홀짝 판별기 ---");
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num % 2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		sc.close();
	}

}
