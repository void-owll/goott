package exam;

import java.util.Scanner;

public class Exam_02_01 {

	public static void main(String[] args) {
		/*
		 * [문제] 지방, 탄수화물, 단백질, 칼로리의 합계를
		 * 계산하는 프로그램
		 * - 지방 1그램 = 9칼로리
		 * - 단백질 , 탄수화물 1그램 = 4칼로리
		 * - 총 칼로리 = 지방*9 + 단백질*4 + 탄수화물*4
		 * 
		 * [출력 화면]
		 * 지방의 그램을 입력하세요 : 25
		 * 탄수화물의 그램을 입력하세요 : 520
		 * 단백질의 그램을 입력하세요 : 45
		 * 총칼로리 : 2,485 cal   //printf 이용
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("지방의 그램을 입력하세요 : ");
		int fat = sc.nextInt();
		
		System.out.print("탄수화물의 그램을 입력하세요 : ");
		int carbohydrate = sc.nextInt();
		
		System.out.print("단백질의 그램을 입력하세요 : ");
		int protein = sc.nextInt();
		
		int kcal = 9*fat + 4*carbohydrate + 4*protein;
		
		System.out.printf("총칼로리 : %,d Kcal", kcal);
		
		sc.close();
	}

}
