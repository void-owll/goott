package goott;

/*
 * 5. 배정연산자 / 단축배정연산자
 *    - 배정연산자(=)
 *      형식) 변수 = 변수 or 수식 or 값
 *      	  * 좌변에는 항상 변수명이 와야 한다.
 *      	  * 우변에는 숫자, 변수명, 수식이 와야 한다.
 *      
 *    - 단축배정연산자
 *      * 배정연산자를 간편하게 사용하는 연산자.
 */
public class Operator_08 {

	public static void main(String[] args) {
		// 배정연산자
		// 형식) 변수명 = 값(데이터)
		int su1 = 10, su2 = 28, result = 0;
		
		
		// 형식) 변수명 = 변수명
		su1 = su2;
		
		// 형식 ) 변수명 = 수식
		su1 = su2 + 27;
		
		System.out.println("su1 >>> " + su1); // 55
		System.out.println("su2 >>> " + su2); // 28
		
		// 단축배정연산자
		// result = result + 10;
		result += 10; // result == 누적변수 (자기자신에게 계속해서 값이 저장되는 변수)
		System.out.println("result >>> " + result);
		
		int su = 15;
		su += 5;
		System.out.println("su >>> " + su);
		
		su -= 5;
		System.out.println("su >>> " + su);
		
		su *= 5;
		System.out.println("su >>> " + su);
		
		su /= 5;
		System.out.println("su >>> " + su);
		
		su %= 5;
		System.out.println("su >>> " + su);

	}

}
