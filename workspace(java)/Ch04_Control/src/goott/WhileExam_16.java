package goott;

/*
 * 2. 반복문 p
 *    - 반복해서 실행해야 할 때 사용하는 명령문.
 *    - 반복되는 일을 처리하기 위해 사용하는 명령문.
 *    - 반복문의 종류 
 *      while 반복문, do~while 반복문, for 반복문
 */

/*
 * while 반복문
 * - 조건식을 비교하여 참인 경우 계속해서 반복 실행문을 실행하고,
 *   조건식이 거짓인 경우에 반복문을 빠져나가는 명령문.
 * - while 반복문은 반복문의 횟수를 알 수 없는 경우에 많이 사용이 됨.
 * - 반복문에는 반드시 초기식, 조건식, 증감식이 존재해야 함.
 * 
 * 형식)
 * 		while(조건식) {
 * 			반복 실행할 문장;
 * 		}
 */
public class WhileExam_16 {

	public static void main(String[] args) {
		
		System.out.println("su >>> " + 1);
		System.out.println("su >>> " + 2);
		System.out.println("su >>> " + 3);
		System.out.println("su >>> " + 4);
		System.out.println("su >>> " + 5);
		System.out.println("su >>> " + 6);
		System.out.println("su >>> " + 7);
		System.out.println("su >>> " + 8);
		System.out.println("su >>> " + 9);
		System.out.println("su >>> " + 10);
		System.out.println();
		
		// while 반복문으로 1 ~ 10 까지 출력을 해 보자.
		int num = 1; // 반복문에서 초기식
		
		while(num <= 100) {
			System.out.println("num >>> " + num);
			num++;
		} // while 반복문의 end

		

	}

}
