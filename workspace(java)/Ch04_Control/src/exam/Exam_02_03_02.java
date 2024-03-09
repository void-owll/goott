package exam;

import java.util.Scanner;

public class Exam_02_03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("별의 최대 갯수를 입력하세요. : ");
		
		int starCount = sc.nextInt();
		
		int line;		// 별을 찍을 전체 라인 수

		for(int i=1; i<=(starCount*2-1);i++) {
			line = (i<=starCount) ? i : (starCount*2 - i);
			for (int j=1; j<=line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
