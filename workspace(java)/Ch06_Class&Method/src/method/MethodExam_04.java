package method;

import java.util.Scanner;

public class MethodExam_04 {
	
	public static void add(int start, int end) {
		int sum = 0;
		for (int i = start; i<=end; i++) {
			sum += i;
		}
		System.out.println(start + " ~ " + end + " 까지의 합 >> " + sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("합을 구할 시작 정수 입력 : ");
		int startNo = sc.nextInt();
		
		System.out.print("합을 구할 마지막 정수 입력 : ");
		int endNo = sc.nextInt();
		add(startNo, endNo);
		sc.close();
	}
}
