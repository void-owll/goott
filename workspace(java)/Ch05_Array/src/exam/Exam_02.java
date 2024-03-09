package exam;

import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		System.out.println("5개의 숫자를 입력하세요.");
		for(int i=0 ; i<5 ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<5 ; i++) {
			for(int j=i+1 ; j<5 ; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("===내림차순으로 정렬===");
		for(int element : arr) {
			System.out.print(element + "\t");
		}
		sc.close();
	}
}
