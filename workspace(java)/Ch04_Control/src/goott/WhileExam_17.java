package goott;

// while 반복문을 이용하여 1 ~ 10 까지의 합을 구해 보자.
public class WhileExam_17 {

	public static void main(String[] args) {
		
		// 1. 변수 선언
		int su = 1;  // 반복문의 초기식
		int sum = 0; // 합을 저장할 변수를 항등식으로 초기화
		
		while(su <= 10000) { //조건식
			sum += su;
			su++;
		}
		System.out.println("1 ~ 10 까지의 합 >>> " + sum);
	}

}
