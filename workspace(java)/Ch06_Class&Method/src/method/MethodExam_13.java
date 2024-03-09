package method;

/*
 * 메서드 다중정의(Method Overloading)
 * - 동일한 클래스에서 동일한 이름의 메서드가 여러 개 정의되는 자바 문법.
 * - 일관된 이름으로 정의할 수 있어서 개발자(사용자)에게 코드의 직관성을 제공한다.
 * 
 *  [메서드 다중정의 규칙]
 *  1. 메서드 이름이 동일해야 함.
 *  2. 매개변수의 갯수가 달라야 함. 
 *     매개변수의 갯수가 같은 경우에는 매개변수의 자료형이 달라야 함.
 *  3. 리턴타입(반환형)은 무관함. 
 */
import java.util.Scanner;

public class MethodExam_13 {
	public static int sum(int k, int e) {
		return k+e;
	}
	public static int sum(int k, int e, int m) {
		return k+e+m;
	}
	public static int sum(int k, int e, int m, int j) {
		return k+e+m+j;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int math = sc.nextInt();
		System.out.print("자바점수를 입력하세요 : ");
		int java = sc.nextInt();
		
		System.out.println();
		
		System.out.println("2과목 총점 >>> " + sum(kor, eng));
		System.out.println("3과목 총점 >>> " + sum(kor, eng, math));
		System.out.println("4과목 총점 >>> " + sum(kor, eng, math, java));
		
		sc.close();
	}
}
