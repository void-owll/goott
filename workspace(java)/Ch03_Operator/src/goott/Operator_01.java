package goott;

/*
 * 연산 : 주어진 식을 계산하여 결과를 얻어내는 과정.
 * 
 * 피연산자 : 연산자의 작업 대상. (예 : 20 + 10 ==> 20, 10을 피연산자라고 함)
 * 
 * java에서의 연산자의 종류
 * - 산술연산자
 * - 관계연산자(비교연산자)
 * - 논리연산자
 * - 단항연산자 / 삼항연산자
 * - 배정연산자 / 단축배정연산자
 * - 비트연산자
 * - 쉬프트연산자
 */

/*
 * 1. 산술연산자
 *    덧셈 +, 뺄셈 -, 곱셈 *, 나눗셈 /, 나머지 %
 */
public class Operator_01 {

	public static void main(String[] args) {
		
		int su1 = 13, su2 = 4;
		
		// 덧셈연산
		System.out.println("덧셈결과 >>> " + (su1 + su2));
		System.out.println(); // 빈 줄 추가
		
		// 뺄셈연산
		System.out.println("뻴셈결과 >>> " + (su1 - su2));
		System.out.println(); // 빈 줄 추가
		
		// 곱셈연산
		System.out.println("곱셈결과 >>> " + (su1 * su2));
		System.out.println(); // 빈 줄 추가
		
		// 나눗셈연산
		System.out.println("나눗셈결과(몫) >>> " + (su1 / su2));
		System.out.println(); // 빈 줄 추가
		
		// 나머지연산
		System.out.println("나머지결과 >>> " + (su1 % su2));
		System.out.println(); // 빈 줄 추가

		/*
		 * 나머지(%) 연산자
		 * - 나머지를 구하는 연산자.
		 * - 홀수, 짝수를 판별할 때 많이 사용됨.
		 * - 배수 판별 시에도 사용됨.
		 */
	}

}
