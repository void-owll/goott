package goott;

import java.util.Scanner;

public class examxexamexam {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		Scanner sc = new Scanner(System.in);
		for(int element: arr) {
			if(element <= 30) {
				System.out.print("값이 30 이하이므로 재할당 > ");
				element = sc.nextInt();
			}
			System.out.println(element);
		}
		sc.close();
	}
}
