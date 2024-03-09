package goott;

public class Operator_03 {

	public static void main(String[] args) {
		// 1. 키보드로 데이터를 입력받는 방법(두번째)
		// 실행버튼 오른쪽의 화살표 ▽ > Run configurations... > Arguments 탭 > Program Arguments
		// 안의 내용을 입력받는 방법임.
		// 별로 좋은 입력방법이 아님....
		int num1 = Integer.parseInt(args[0]);
		
		int num2 = Integer.parseInt(args[1]);
		System.out.println("덧셈연산 결과 >>> " + (num1 + num2));
		System.out.println("뺄셈연산 결과 >>> " + (num1 - num2));
		System.out.println("곱셈연산 결과 >>> " + (num1 * num2));
		System.out.println("나눗셈연산 결과 >>> " + (num1 / num2));
		System.out.println("나머지연산 결과 >>> " + (num1 % num2));
	}

}
