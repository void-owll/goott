package goott;

import java.util.Scanner;

public class IfExam_04 {

	public static void main(String[] args) {
		/*
		 * [문제] 키보드로 입력 받은 정수 값이 음수이면 
		 * 		  "입력 받은 정수는 음수입니다." 라는 메시지를 
		 * 		  화면에 출력해 보세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		if(num < 0) {
			System.out.println("입력 받은 정수는 음수입니다.");
		}
		sc.close();
	}

}
