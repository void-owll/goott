package method;

/*
 * [문제] 1 ~ 100 까지의 홀수의 합과 짝수의 합을 구하는
 * 		  메서드를 만들고, 호출하여 결과를 화면에 보여주세요.
 */
public class MethodExam_02 {
	
	public static void oddEvenSum() {
		int oddSum = 0;
		int evenSum = 0;
	
		for (int i=0; i<=100 ; i++) {
			if(i%2 == 0) evenSum += i;
			else oddSum += i;
		}
		
		System.out.println("짝수의 합 : " + evenSum);
		System.out.println("홀수의 합 : " + oddSum);
	}
	
	
	public static void main(String[] args) {
		oddEvenSum();
	}
}
