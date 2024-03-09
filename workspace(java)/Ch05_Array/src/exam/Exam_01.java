package exam;

import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = 1048576;
		int max = 0;
		
		System.out.print("배열 크기 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print((i+1)+"번째 값 입력 : ");
			arr[i] = sc.nextInt();
			if( arr[i] > max) max=arr[i];
			if( arr[i] < min) min=arr[i];
		}

		System.out.printf("max : %d, min : %d\n", max, min);
		
		sc.close();
		
	}
}
