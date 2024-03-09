package goott;

import java.util.Scanner;

/*
 * 다중 if ~ else 문 - 분기문(조건문)
 * - 여러 개의 조건 중에 맞는 조건에 해당하는 문장을 실행하는 구조.
 * 
 *   형식)
 *   if(조건식1) {
 *   	조건식1이 참인 경우 실행 문장;
 *   }else if{
 *   	조건식
 *   }else{
 *   	if(조건식2) {
 *   		조건식1이 거짓이고 조건식2가 참인 경우 실행 문장;
 *   	} else {
 *   		if(조건식3) {
 *   			조건식1, 2가 거짓이고 조건식3이 참인 경우 실행 문장;
 *   		} else {
 *   			조건식1, 2, 3이 모두 거짓인 경우 실행 문장;
 *   		}
 *   	}
 *   }
 *   
 *   ==> 
 *   if(조건식1) {
 *   	조건식1이 참인 경우 실행 문장;
 *   } else if(조건식2) {
 *   	조건식1이 거짓이고 조건식2가 참인 경우 실행 문장;
 *   } else if(조건식3) {
 *   	조건식1, 2가 거짓이고 조건식3이 참인 경우 실행 문장;
 *   } else {
 *   	조건식1, 2, 3이 모두 거짓인 경우 실행 문장;
 *   }
 *   
 */
public class IfElseIfExam_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 3 사이의 숫자 중에서 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("입력 받은 숫자는 1입니다.");
		} else if (num == 2) {
			System.out.println("입력 받은 숫자는 2입니다.");
		} else if (num == 3) {
			System.out.println("입력 받은 숫자는 3입니다.");
		} else {
			System.out.println("입력 받은 숫자는 1 ~ 3 이외의 숫자입니다.");
		}
		sc.close();
		

	}

}
