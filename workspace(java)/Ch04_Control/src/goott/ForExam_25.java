package goott;

import java.util.Scanner;

public class ForExam_25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		
		
		for (int count = 0 ; count <= input ; count++) {
			if (count % 2 == 0) evenSum += count;
			else oddSum += count;
		}
		System.out.println(input + "까지의 홀수의 합 : " + oddSum);
		System.out.println(input + "까지의 짝수의 합 : " + evenSum);
		
		sc.close();
	}

}
