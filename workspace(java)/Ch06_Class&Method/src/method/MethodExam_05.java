package method;

import java.util.Scanner;
/* 
 * [문제] 키보드로 입력 받은 수까지의 홀수의 합과 
 * 		  짝수의 합을 구하는 메서드를 만들고
 * 		  메서드를 호출하여 처리 후 화면에 보여주세요.
 */
public class MethodExam_05 {
	public static void add(int end) {
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 0 ; i <= end ; i++) {
			if(i%2 == 0) evenSum += i;
			else oddSum += i;
		}
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마지막 숫자 : ");
		int endNo = sc.nextInt();

		add(endNo);
		
		sc.close();
	}
	
}
