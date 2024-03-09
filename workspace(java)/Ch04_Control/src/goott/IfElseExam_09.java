package goott;

import java.util.Scanner;

public class IfElseExam_09 {

	public static void main(String[] args) {
		/*
		 * [문제3]키보드로부터 입력받은 정수가 5의 배수이면 "이 정수는 5의 배수입니다." 라는 
		 * 메시지를 화면에 출력을 하고, 5의 배수가 아니면 "이 정수는 5의 배수가 아닙니다."
		 * 라고 출력해 보세요. 단, 음수이면 "이 정수는 음수입니다."라는 메시지를 화면에 출력하세요.
		 * 
		 * 
		 * * 조건 정리
		 * 입력값이 음수이면 >> 음수입니다 를 출력
		 * 입력값이 양수이면 >> 5의 배수인지 아닌지를 출력
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("5의 배수 판별기 ---");
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num >= 0) {
			if (num % 5 == 0) {
				System.out.println(num +"은(는) 5의 배수입니다.");
			} else {
				System.out.println(num +"은(는) 5의 배수가 아닙니다.");
			}
		} else {
			System.out.println(num +"은 음수입니다.");
		}
		sc.close();
	}

}
