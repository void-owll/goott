package wrapper;
/*
 * Wrapper Class
 * - wrap : 감싸다, 포장하다.
 * - 기본 자료형을 클래스 타입으로 포장해 놓은 클래스.
 * - 기본 자료형보다 객체로 저장하기 때문에 더 다 양한 기능을 제공하기 위해 사용함.
 * - 기본 타입의 값을 내부에 두고 포장하기 때문에 포장(wrapper) 클래스라고 하기도 함.
 * - 기본 자료형 : byte, short, long, float, double, boolean, char, int
 * - wrapper class : Byte, Short, Long, Float, Double, Boolean, Character, Integer
 * 
 * [wrapper class 사용 이유]
 * 1. 매개변수로 객체가 요구될 때 
 * 2. 기본형 값이 아니라 객체로 저장해야 할 때
 * 3. 객체간 비교가 필요할 때
 * 
 *  ※ wrapper class 를 사용하는 더 큰 이유
 *   ==> 형변환이 자유롭다는 큰 특징이 있음.
 */
public class Wrapper_01 {

	public static void main(String[] args) {
		// 기본자료형은 단순한 연산을 하기 위한 용도로 사용이 됨.
		int su1 = 47;
		int su2 = 134;
		System.out.println("su1 + su2 >> " + (su1 + su2));
		System.out.println();
		
		// 포장 클래스(wrapper Class) 사용 방법
		
		Integer in1 = su1; 			// Boxing
		Integer in2 = su2;
		
		System.out.println("포장클래스 더하기 >> " + (in1 + in2));
		System.out.println();
		
		// 포장 클래스는 형변환이 자유롭다는 특징이 있음.
		
		System.out.println(in1.doubleValue());
		
		// 숫자 -> 문자열  toString() : 숫자를 문자열로 변경
		// String.valueOf(숫자) : 숫자를 문자열로 변경
		System.out.println("문자열 >> " + (in1.toString() + in2.toString()));
		System.out.println("문자열 >> " + (String.valueOf(su2) + 130));
		
		// 문자열 -> 숫자  Integer.parseInt("문자열")
		String str = "1235";
		System.out.println("문자열 -> 숫자 >> " + (Integer.parseInt(str) + 148) );
	}
}
