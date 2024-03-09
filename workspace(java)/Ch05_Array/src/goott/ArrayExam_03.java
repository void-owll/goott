package goott;

import java.util.Scanner;

/*
 * [문제] 내가 여행 가고 싶은 5개 나라를 
 * 		  키보드로 입력을 받아서 배열에 저장 후
 * 		  배열에 저장된 나라를 화면에 보여주세요.
 */
public class ArrayExam_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nation = new String[5];
		
		for (int i=0;i<=4;i++) {
			System.out.print((i+1) + "번째 나라를 입력하세요 : ");
			nation[i] = sc.next();
		}
		
		System.out.println();
		
		for (int i=0;i<=4;i++) {
			System.out.println((i+1) + "번째로 가고싶은 나라 : " + nation[i]);
		}
		
		/*
		 * 단축 for 문(개선된 for 문, 향상된 for 문)
		 * - jdk 1.5 버전부터 추가된 기능.
		 * - 주로 배열의 요소(값)를 처리(출력)할 때 사용함.
		 * 	 형식)
		 *  		for(자료형 변수명 : 배열명) {
		 *  			반복 실행 문장;
		 *  		}
		 *  
		 *   실행 방법
		 *   - 배열의 첫번째 인덱스(0)에 있는 데이터를 좌변에 있는 변수에 
		 *     저장하여 출력을 함.
		 *   - 데이터 수 만큼 자동으로 반복하여 출력을 해 줌.
		 *   
		 *   주의)
		 *   - 우변에 있는 배열명의 자료형과 좌변에 있는 변수명의 
		 *     자료형은 반드시 일치해야 함.
		 *   - 만약 일치하지 않으면 error 발생.
		 *   
		 */
		
		// 단축 for 문을 이용하여 배열을 출력해 보자.
		for(String name : nation) {
			System.out.println(name);
		}
		sc.close();
	}
}
