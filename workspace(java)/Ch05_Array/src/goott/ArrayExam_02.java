package goott;

import java.util.Scanner;

/*
 * 5개의 정수를 저장할 배열을 만들고, 키보드로 배열에
 * 5개의 데이터를 저장 후, 해당 배열을 화면에 출력해 보자.
 */
public class ArrayExam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		for (int i=0 ;i<=4; i++) {		// 5번 입력받아 배열에 저장하는 반복문
			System.out.print((i+1) + "번째 정수 입력 : ");
			score[i] = sc.nextInt();
		}
		
		for (int i=0 ;i<=4; i++) {		// 배열의 내용을 출력하는 반복문
			System.out.println("arr["+i+"] : "+score[i]);
		}
		
		sc.close();
	}
}
