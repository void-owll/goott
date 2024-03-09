package exam;

import java.util.Scanner;

public class Exam_01_04 {
	public static void main(String[] args) {
		/*
		 * [문제4] 키보드로 임의의 숫자 4자리를 입력을 받는다.
		 * 오천원짜리 몇장, 천원짜리 몇장, 오백원짜리 몇개,
		 * 백원짜리 몇개, 오십원짜리 몇개, 십원짜리 몇개,
		 * 일원짜리가 몇개로 구성되어 있는지 화면에 출력해 보세요.
		 * 
		 * [입력 화면]
		 * 임의의 4자리 숫자 입력 : 
		 * 
		 * [출력 화면]
		 * 입력받은 숫자 ==> 8762
		 * 오천원 지폐 : 1장
		 * 천원 지폐 : 3장
		 * 오백원 동전 : 1개
		 * 백원 동전 : 2개
		 * 오십원 동전 : 1개
		 * 십원 동전 : 1개
		 * 일원 동전 : 2개
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 4자리 숫자 입력 : ");
		int input = sc.nextInt();
		int five000 = 0;
		int one000 = 0;
		int five00 = 0;
		int one00 = 0;
		int five0 = 0;
		int one0 = 0;
		int one = 0;

		five000 = input / 5000;
		one000 = input % 5000 / 1000;
		five00 = input % 1000 / 500;
		one00 = input % 500 / 100;
		five0 = input % 100 / 50;
		one0 = input % 50 / 10;
		one = input % 10;
		
		System.out.println("입력받은 숫자 ==> " + input);
		System.out.println("오천원 지폐 : " + five000 +"장");
		System.out.println("천원 지폐 : " + one000 +"장");
		System.out.println("오백원 동전 : " + five00 +"개");
		System.out.println("백원 동전 : " + one00 +"개");
		System.out.println("오십원 동전 : " + five0 +"개");
		System.out.println("십원 동전 : " + one0 +"개");
		System.out.println("일원 동전 : " + one +"개");
		sc.close();
	}
}
