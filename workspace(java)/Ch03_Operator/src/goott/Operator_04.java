package goott;

import java.util.Scanner;

public class Operator_04 {

	public static void main(String[] args) {
		// 1. 키보드로 데이터를 입력받는 방법(세번째)

		Scanner sc = new Scanner(System.in); // System.in : 표준입력장치(키보드)
		System.out.print("첫 번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		int num2 = sc.nextInt();

		System.out.println("덧셈연산 결과 >>> " + (num1 + num2));
		System.out.println("뺄셈연산 결과 >>> " + (num1 - num2));
		System.out.println("곱셈연산 결과 >>> " + (num1 * num2));
		System.out.println("나눗셈연산 결과 >>> " + (num1 / num2));
		System.out.println("나머지연산 결과 >>> " + (num1 % num2));
		
		sc.close(); //scanner는 종료를 시켜 주어야 함

	}

}
