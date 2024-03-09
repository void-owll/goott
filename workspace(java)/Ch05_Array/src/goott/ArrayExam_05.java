package goott;

import java.util.Scanner;

/*
 * length 명령어
 * - 배열의 크기(길이)를 알려주는 명령어.
 * - 배열의 크기(길이)를 정수값으로 알려줌.
 *   형식)
 *   	배열명.length
 *  		예)
 *   			int size = arr.length;
 */
public class ArrayExam_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		System.out.println("arr 배열의 크기 >>> " + arr.length);
		
		for( int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 >>> ");
			arr[i] = sc.nextInt();
		}
		
		for(int element : arr) {
			System.out.println(element);
		}
		sc.close();
	}
}
