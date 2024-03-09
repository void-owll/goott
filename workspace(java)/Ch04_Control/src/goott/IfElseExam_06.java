package goott;

import java.util.Scanner;

/*
 * if ~ else 문 - 분기문(조건문)
 * - 조건식이 참이면 참인 경우 실행문을 실행하고,
 *   if ~ else 블럭을 빠져 나옴.
 * - 조건식이 거짓이면 거짓인 경우 실행문을 실행하고,
 * 	 if ~ else 블럭을 빠져 나옴.
 * 
 *   형식)
 *   	if(조건식) {
 *   		조건식이 참인 경우 실행 문장;
 *   	}else {
 *   		조건식이 거짓인 경우 실행 문장;
 *   	}
 */
public class IfElseExam_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요. : ");
		int num = sc.nextInt();
		if (num >= 50) {
			System.out.println("입력 받은 " + num + " 은(는) 50 이상의 수입니다.");
		} else {
			System.out.println("입력 받은 " + num + " 은(는) 50 미만의 수입니다.");
		}
		sc.close();
	}

}
