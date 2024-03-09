package goott;
/*
 * 3. 논리연산자
 *    - 논리곱(&&) : 주어진 조건이 모두 참인 경우에만 결과가 true
 *    				 그 나머지는 false 가 됨.
 *    - 논리합(||) : 주어진 조건 중에 어느 하나라도 참이면 true
 *    				 그 나머지는 false 가 됨.
 *    - 부정(!) : true -> false,  false -> true
 *    - 관계연산자의 결과값을 가지고 논리연산이 수행됨.
 */
public class Operator_06 {

	public static void main(String[] args) {
		int su1 = 10, su2 = 7;
		
		// 논리곱인 경우 : true && true ==> true
		boolean test = (su1 >= su2) && (su2 >= 5);
		System.out.println("test 결과 >>> " + test);
		
		// 논리곱인 경우 : true && false ==> false
		test = (su1 >= su2) && (su2 <= 5);
		System.out.println("test 결과 >>> " + test);
		
		// 논리합인 경우 : false || true ==> true
		test = (su1 <= su2) || (su2 >= 5);
		System.out.println("test 결과 >>> " + test);
	}

}
