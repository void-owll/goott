package goott;

import java.util.Scanner;

public class IfExam_05 {

	public static void main(String[] args) {
		/*
		 * [문제] 키보드로부터 입력 받은 점수가 60점 이상이면 
		 * 		  "합격입니다." 이라는 메시지를 화면에 출력해 보세요.  
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		if(score >= 60) {
			System.out.println("합격입니다.");
		}
		sc.close();
	}

}
