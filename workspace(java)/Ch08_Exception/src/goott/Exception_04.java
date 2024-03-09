package goott;

/*
 * 예외 처리
 * - 실행하는 단계에서 발생한 오류(예외)를
 *   프로그램적으로 처리한다는 의미.
 *   
 * - 관련 키워드
 *   1. try ~ catch ~ finally  블럭
 *   2. throws 키워드
 */

/*
 * 1. try ~ catch ~ finally  블럭
 * 
 *    형식)
 *    		try {
 *    			예외가 발생할 가능성이 있는 코드;
 *    		}catch(예외클래스 참조변수) {
 *    			예외가 발생한 경우 실행되는 코드;
 *    			참조변수 : 예외와 관련된 정보를 넘겨받는 변수.
 *    		}finally {
 *    			// 생략이 가능함.
 *    			예외와 상관없이 실행되어야 하는 코드;
 *    		}
 */

public class Exception_04 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int num1 = 10, num2 = 0;
		
		int result = 0;
		
		try {
			
			result = num1 / num2;  // 예외가 발생할 가능성이 있는 코드
			
		}catch(Exception e) {
			
			System.out.println("0으로 나눈 예외 발생");
			
			System.out.println("예외 정보 >>> " + e);
		}
		
		
		System.out.println("result >>> " + result);
				
				
		System.out.println("프로그램 종료");


	}

}
