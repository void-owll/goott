package goott;

/*
 * [문제] 1 ~ 100 까지의 홀수의 합과 
 * 		  짝수의 합을 구하여 화면에 보여주세요.
 */
public class WhileExam_18 {

	public static void main(String[] args) {

		int count = 1;
		int oddSum = 0;
		int evenSum = 0;
		
		while (count <= 100) {
			if(count % 2 == 0) {
				evenSum += count;
//				System.out.println("evenSum >> " + evenSum);	// 테스트문
			}else {
				oddSum += count;
//				System.out.println("oddSum >> " + oddSum);	// 테스트문
			}
			count++;
		}
		System.out.println("짝수의 합 >> " + evenSum);
		System.out.println("홀수의 합 >> " + oddSum);
	}
}
