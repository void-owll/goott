package goott;

/*
 * 에러(error)
 * - 하드웨어의 오동작 또는 고장으로 인한 오류.
 * - 에러가 발생하면 프로그램 종료.
 * - 정상 실행 상태로 돌아갈 수 없음.
 * 
 * 예외(exception)
 * - 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인한 오류.
 * - 예외가 발생하면 프로그램 종료.
 * - 예외 처리를 추가해 주면 정상 실행 상태로 돌아갈 수 있음.
 * - 프로그램을 위한 보험 처리. 위험한 상황에서 다른 코드를 보호하는 장치.
 * 
 * 예외의 종류
 * 1. 일반(컴파일) 예외
 *    - 예외 처리 코드가 없다면 컴파일이 되지 않는 예외.
 * 2. 실행 예외
 *    - 예외 처리 코드를 생략하더라도 컴파일이 되는 예외.
 *      즉, 컴파일 하는 과정에서 예외 처리 코드를 검사하지
 *      않는 예외를 말함.
 *    - 경험에 따라 예외 처리 코드를 작성할 필요가 없음.
 *    
 * 예외 처리의 목적
 * - 프로그램을 실행 시 발생할 수 있는 상황들을 미리 정해 놓고,
 *   예외가 발생했을 경우에 대비하는 코드를 작성하여 프로그램이
 *   정상적으로 작동하게 하기 위함.
 */

public class Exception_01 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int num1 = 10, num2 = 0;
		
		int result = num1 / num2;
		
		System.out.println("result >>> " + result);
				
				
		System.out.println("프로그램 종료");

	}

}
