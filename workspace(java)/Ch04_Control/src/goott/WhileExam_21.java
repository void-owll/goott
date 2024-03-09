package goott;

import java.util.Scanner;

/*
 *  while문을 이용하여 -1이 입력될 때까지
 *  정수를 계속 입력을 받아서 합을 구하고,
 *  -1이 입력이 되면 while문을 빠져 나와서
 *  평균을 구하는 프로그램을 만들어 보자.
 */
public class WhileExam_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0; // 평균을 구하기 위해 필요함
		int sum = 0; // 합을 구하기 위해 필요함
		System.out.print("계속적으로 정수를 입력을 하고 마지막에 -1을 입력하세요.... :");
		int su = sc.nextInt();
		
		while(su != -1) {
			sum += su;
			count ++;
			su = sc.nextInt();
		}
		System.out.println("입력된 정수의 갯수는 : " + count);
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + (double)sum/count);
		
		
		sc.close();
		
	}

}
