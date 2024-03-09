package exam;

import java.util.Scanner;

public class Exam_01_02 {
	public static void main(String[] args) {
		/*
		 * [문제2] 임의의 정수 하나를 입력 받아서
		 * 그 수의 제곱, 세제곱을 구하여 화면에 출력해 보세요.
		 * 
		 * [입력 화면]
		 * 임의의 정수를 입력하세요. :
		 * 
		 * [출력 화면]
		 * 입력받은 정수 ==> 6
		 * 6의 제곱 ==> 36
		 * 6의 세제곱 ==> 216
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		System.out.println("입력받은 정수 ==> " + num);
		System.out.println(num + "의 제곱 ==> " + (num*num));
		System.out.println(num + "의 세제곱 ==> " + (num*num*num));
		sc.close();
		
	}
}
