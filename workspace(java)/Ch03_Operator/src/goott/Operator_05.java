package goott;

/*
 * 2. 관계연산자(비교연산자)
 *    -  >= (크거나 같은지), > (큰지), <= (작거나 같은지),
 *       < (작은지), == (같은지), != (같지 않은지)
 *    -  결과값은 boolean 형으로 나옴 ==> true / false
 *    -  관계연산자는 제어문(조건문)에서 가장 많이 사용되는 연산자.
 *    
 */
public class Operator_05 {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 5;
		System.out.println("(num1 >= num2) 결과 >>> " + (num1 >= num2));
		System.out.println("(num1 > num2) 결과 >>> " + (num1 > num2));
		System.out.println("(num1 == num2) 결과 >>> " + (num1 == num2));
		System.out.println("(num1 != num2) 결과 >>> " + (num1 != num2));
		System.out.println("(num1 <= num2) 결과 >>> " + (num1 <= num2));
		System.out.println("(num1 < num2) 결과 >>> " + (num1 < num2));

	
	}
}
