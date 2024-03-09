package goott;

/*
 * 4. 단항연산자 / 삼항연산자
 * 	  - 단항연산자 : 1개의 항을 대상으로 연산을 수행.
 *    - 삼항연산자 : 3개의 항을 대상으로 연산을 수행.
 * 
 */
public class Operator_07 {

	public static void main(String[] args) {
		 
		// 단항연산자(++, --)
		int su1 = 10, su2 = 10;
		
		System.out.println("su1++ >>" +  su1++ ); // su1 (10) 출력후에 11 이 됨.
		System.out.println("++su2 >>" +  ++su2 ); // su2 (10)이 11이 된 후에 출력됨.
		
		/*
		 * 단항연산자(++, --)
		 * - 전위연산자 : 단항연산자가 변수명 앞에 오는 경우(++su1)
		 * 				  변수의 값을 하나 증가 또는 감소시킨 후 처리
		 * - 후위연산자 : 단항연산자가 변수명 앞에 뒤는 경우(su1--)
		 * 				  변수의 값 처리 후 변수를 하나 증가 또는 감소
		 */
		
		int su3 = 10, su4 = 20;
		System.out.println(++su3 + su4++); // 11 + 20 = 31, su3 == 11, su4 == 21		
		System.out.println((++su3 % 3) + (su3 * ++su4)); // 0 + 264(12*22)
		
		/*
		 * 삼항연산자
		 * 
		 * 형식) (조건=관계연산자) ? 수식1 : 수식2
		 * 			=> 수식1 : 조건이 참인 경우 실행할 문장
		 * 			=> 수식2 : 조건이 거짓인 경우 실행할 문장
		 * 
		 * - 간단하게 조건문을 대신하여 사용할 수 있는 연산자.
		 */
		
		int num1 = 1, num2 = 33;
		String result = (num1 >= num2) ? "num1 값이 크다" : "num2 값이 크다";
		System.out.println(result);

	}

}
