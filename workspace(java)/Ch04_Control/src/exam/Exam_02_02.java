package exam;

import java.util.Scanner;

public class Exam_02_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int max = sc.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 1; i <= max ; i++) {
			if ( i % 2 == 0 ) evenSum += i;
			else oddSum += i;
		}
		System.out.println("홀수합계 : " + oddSum);
		System.out.println("짝수합계 : " + evenSum);
		
		sc.close();
	}

}
