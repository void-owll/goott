package goott;

/*
 * 실수자료형 : 소수점이 발생하는 자료형.
 * 
 * - float : 소수점 이하 6~7 자리까지 표현이 가능함.
 * - double : 소수점 이하 15~16 자리까지 표현이 가능함.
 */
public class Variable_05 {
	
	public static void main(String[] args) {
		double dNum = 123.45666;
		System.out.println("dNum >> " + dNum );
		
		float fNum = 1245.78954f; // (float)1245.78954 == 1245.78954f
		System.out.println("fNum >> " + fNum );

		/*
		 * float 자료형의 변수에 실수 값을 저장시 오류 발생.
		 * 이유 : 실수 자료형의 기본형은 double 형 이기 때문임.
		 * - 따라서 float 자료형의 변수에 실수 데이터를 저장 시
		 *   반드시 실수 값 앞에 (float)라고 형을 기재해 주거나
		 *   값 뒤에 f 를 붙여주면 됨. (생략 시 error 발생)
		 *   
		 * - 자료의 손실은 거의 발생하지 않음.
		 */
	}
}
