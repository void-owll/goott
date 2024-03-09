package method;

import java.util.Scanner;

// 콘솔 창에서 간단하게 계산하는 계산기 예제

public class MethodExam_06 {
	public static void plus(int a, int b) {
		System.out.println(a + b);
	}
	public static void minus(int a, int b) {
		System.out.println(a - b);
	}
	public static void multi(int a, int b) {
		System.out.println(a * b);
	}
	public static void div(int a, int b) {
		System.out.println(a / b);
	}
	public static void remain(int a, int b) {
		System.out.println(a % b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 키보드로 두 개의 정수와 연산자를 입력을 받자.
		System.out.print("첫 번째 정수 입력 : ");
		int su1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int su2 = sc.nextInt();
		
		System.out.print("연산자(+, -, *, /, %) 입력 : ");
		String op = sc.next();
		
		// 2. 연산자 변수에 입력된 연산기호를 가지고 
		// 	  해당 기호에 맞는 메서드를 호출해 주자.
		
		switch(op) {
		case "+":
			plus(su1,su2);
			break;
		case "-":
			minus(su1,su2);
			break;
		case "*":
			multi(su1,su2);
			break;
		case "/":
			div(su1,su2);
			break;
		case "%":
			remain(su1,su2);
			break;
		default:
			System.out.println("연산자 입력 오류!!");
				
		}
		sc.close();
		
		
	}
}
