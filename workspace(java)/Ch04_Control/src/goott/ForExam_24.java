package goott;

public class ForExam_24 {

	public static void main(String[] args) {
		/*
		 * 1~100 사이의 홀수 합과 짝수 합을 출력하기
		 */
		int evenSum = 0;
		int oddSum = 0;
		
		for(int num=0; num <= 100; num++) {
			if(num % 2 == 0) evenSum += num;
			else oddSum += num;
		}
		System.out.println("짝수의 합 : " + evenSum);
		System.out.println("홀수의 합 : " + oddSum);
	}

}
