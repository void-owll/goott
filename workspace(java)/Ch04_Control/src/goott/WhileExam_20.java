package goott;

import java.util.Scanner;

/*
 * 1 ~ 100 사이의 정수 중에서 키보드로 5개의 정수를 입력을 받아서 
 * 5개의 정수 중에서 최대값을 화면에 보여주세요.
 * (예, 43. 17, 64, 98, 11) 
 */
public class WhileExam_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int temp = 0, su = 1;
		
		while (su <= 5) {
			
			System.out.print(su + "번째 정수 입력 : ");
			temp = sc.nextInt();
			
			if ( temp > max) {
				max = temp;
			}
			
			su++;
			
		}
		
		System.out.println("최댓값 : " + max);
		sc.close();
	}	

}
