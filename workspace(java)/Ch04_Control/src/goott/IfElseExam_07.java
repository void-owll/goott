package goott;

import java.util.Scanner;

public class IfElseExam_07 {

	public static void main(String[] args) {
		/*
		 * [문제1] 키보드로부터 점수를 입력받아서 입력 받은 점수가 
		 * 		   60점 이상이면 "합격입니다" 라는 메시지를 화면에 표시하고,
		 * 		   60점 미만이면 "불합격입니다" 라는 메시지를 화면에 출력하세요.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("합불판별기");
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다");
		}
		sc.close();
	}

}
