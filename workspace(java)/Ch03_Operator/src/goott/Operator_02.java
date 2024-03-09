package goott;

import javax.swing.JOptionPane;

public class Operator_02 {

	public static void main(String[] args) {
		
		// 1. 키보드로 데이터를 입력받는 방법(첫번째)
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 숫자 입력하세요"));
		//Integer.ParseInt(jop(Ctrl+Space+Enter).showi(Ctrl+Space+Enter))
		//Integer.ParseInt() ==> ()안의 값을 int로 변경해 줌.
		//JOptionPane.showInputDialog() 로 입력 받은 값은 String(문자열)이므로, int로 변경해야
		//연산이 가능한 정수로 바뀐다.
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("두번째 숫자 입력하세요"));
	
		System.out.println("덧셈연산 결과 >>> " + (num1 + num2));
		System.out.println("뺄셈연산 결과 >>> " + (num1 - num2));
		System.out.println("곱셈연산 결과 >>> " + (num1 * num2));
		System.out.println("나눗셈연산 결과 >>> " + (num1 / num2));
		System.out.println("나머지연산 결과 >>> " + (num1 % num2));
		

	}

}
