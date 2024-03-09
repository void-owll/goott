package goott;

public class Variable_04 {

	public static void main(String[] args) {
		
		// 변수 선언 및 변수 초기화
		byte su = 127;
		System.out.println("su >>> " + su );
		
		// 자료형의 형변환 작업 (묵시적 형변환)
		int num1 = su;
		System.out.println("num1 >>> " + num1 );
		
		int num2 = 130;
		System.out.println("num2 >>> " + num2 );

		// 자료형의 형변환 작업 (명시적 형변환)
		byte su2 = (byte)num2; 
		System.out.println("su2 >>> " + su2 );
		
		/*
		 * 형변환(casting)
		 * ==> 해당 데이터 값의 자료형을 다른 데이터 타입의 자료형으로
		 *     변환하는 것을 말함.
		 * - 형변환은 boolean 형을 제외한 7가지 자료형은 서로 형변환이 가능함.
		 * 
		 * 1. 묵시적 형변환
		 * 	  => 자료형의 크기가 작은 데이터를 큰 자료형의 변수에 저장하는 경우.
		 * 		 이 때는 형변환 작업을 안 해 주어도 됨.
		 * 2. 명시적 형변환
		 * 	  => 자료형의 크기가 큰 데이터를 작은 자료형의 변수에 저장하는 경우.
		 * 		 이 때는 반드시 형변환 작업을 해 주어야 함.
		 * 
		 * ※ 형변환 작업 시에는 자료의 손실이 발생할 수 있음.
		 */

	}

}
