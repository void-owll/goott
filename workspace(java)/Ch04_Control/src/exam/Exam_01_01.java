package exam;

import java.util.Scanner;

public class Exam_01_01 {

	public static void main(String[] args) {
		/*
		 * [문제1] 국어, 영어, 수학, 자바 변수를 만들고
		 * 해당 변수에 점수를 입력 후 총점과 평균을 구하여
		 * 화면에 출력해 보세요.
		 * 조건1) 평균은 소숫점 이하 2자리까지만 출력할 것.
		 * 
		 * [입력 화면]
		 * 국어 점수 입력 : 
		 * 영어 점수 입력 : 
		 * 수학 점수 입력 : 
		 * 자바 점수 입력 : 
		 * 
		 * [출력 화면]
		 * 국어점수 : 80점
		 * 영어점수 : 85점
		 * 수학점수 : 90점
		 * 자바점수 : 70점
		 * 총    점 : 325점
		 * 평    균 : 81.25점
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		System.out.print("자바 점수 입력 : ");
		int java = sc.nextInt();
		
		int sum = kor + eng + math + java;
		double average = (double)sum/4.0;
		
		System.out.println("국어점수 : " + kor + " 점");
		System.out.println("영어점수 : " + eng + " 점");
		System.out.println("수학점수 : " + math + " 점");
		System.out.println("자바점수 : " + java + " 점");
		System.out.println("자바점수 : " + java + " 점");
		System.out.println("총    점 : " + sum + " 점");
		System.out.printf("평    균 : %.2f점", average);
		sc.close();

	}

}
