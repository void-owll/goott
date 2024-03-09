package goott;

import java.util.Scanner;

/*
 * 키보드로 배열에 정수 데이터를 저장할 예정.
 * - 내림차순으로 정렬할 예정.
 *   예) 19, 43, 6, 97, 65
 *    => 97, 65, 43, 19, 6 
 */
public class ArrayExam_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수형 배열 크기 입력 : ");
		int[] sort = new int[sc.nextInt()];
		
		for (int i = 0 ; i < sort.length ; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			sort[i] = sc.nextInt();
		}
		//
		// 내림차순으로 정렬하기 ★★정보처리기사 실기에 자주 나옴
		int temp = 0;
		for (int i=0; i<sort.length ; i++) {
			for(int j=i+1; j<sort.length; j++) {
				if(sort[j] > sort[i]) {
					temp = sort[i]; //순서 바꾸는 구문
					sort[i] = sort[j];
					sort[j] = temp;  
				}
			}
		}
		
		// 출력
		for (int element: sort) {
			System.out.print(element + "\t");
		}
		
		sc.close();
		
	}
}
