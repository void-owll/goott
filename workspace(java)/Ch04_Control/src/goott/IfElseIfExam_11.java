package goott;

import java.util.Scanner;

/*
 * [문제] 이름과 국어점수, 영어점수, 자바점수를 키보드로 입력을 받아서
 *     	  아래와 같이 성적을 화면에 출력해 보세요.
 *     
 *       출력화면 : 이	  름 : O O O
 *       		    국어점수 : OO 점	
 *       		    영어점수 : OO 점
 *       		    자바점수 : OO 점
 *       		    총    점 : OOO 점
 *       		    평    균 : OO.OO 점
 *       		    학    점 : O 학점
 *       
 *       학점 기준 : A학점(90점 이상),
 *       			 B학점(80-89점),
 *       			 C학점(70-79점),
 *       			 D학점(60-69점),
 *       			 F학점(59점 이하)
 *    			 
 */
public class IfElseIfExam_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("국어점수를 입력하세요 : ");
		int korScore = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int engScore = sc.nextInt();
		System.out.print("자바점수를 입력하세요 : ");
		int javaScore = sc.nextInt();
		int sumScore = korScore + engScore + javaScore;
		double averageScore = (double)sumScore / 3; //형변환하지 않으면 int의 나눗셈연산 => 몫이 되어버림.
													//고로 연산하기 전에 형변환해야 함.
													//double averageScore = sumScore / 3.0  이렇게 해도 됨
													//						=> 한쪽만이라도 실수형이면 됨
		char rank;
		
		if(averageScore >= 90) {
			rank = 'A';
		} else if(averageScore >= 80) {
			rank = 'B';
		} else if(averageScore >= 70) {
			rank = 'C';
		} else if(averageScore >= 60) {
			rank = 'D';
		} else {
			rank = 'F';
		}
		System.out.println();
		System.out.println("이    름 : " + name);
		System.out.println("국어점수 : " + korScore + " 점");
		System.out.println("영어점수 : " + engScore + " 점");
		System.out.println("자바점수 : " + javaScore + " 점");
		System.out.println("총    점 : " + sumScore + " 점");
		System.out.printf("평    균 : %.2f 점\n", averageScore); 
		System.out.println("학    점 : " + rank + "학점");
		sc.close();
	}

}
