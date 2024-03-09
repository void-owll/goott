package goott;

/*
 * 단일문자형 : char형 ( 0 ~ 65535 ) ==> 2바이트
 * - 자바에서는 유니코드(UTF-8) 체계로 단일문자가 처리가 됨.
 */
public class Variable_06 {

	public static void main(String[] args) {
		char ch1 = 66;
		
		int ch2 = 66;
		char ch3 = (char)ch2;
		System.out.println("ch3 >>> " + ch3);
		System.out.println("ch1 >>> " + ch1 );
		System.out.println((char)(ch1 + 1 )); // 66 (B) + 1 => 67 (C)
		char ch4 = 'a';
		char ch5 = 'b';
		int ch6 = 69;
		char chKor = '감';
		int chkorToInt = (int)chKor;
		System.out.println(chkorToInt);
		
		System.out.println((ch4 + ch5));
		System.out.println((char)ch6);
		
		System.out.println((char)(ch4 + ch5));
		
		// char 형에 기본적으로 정수 형태로 저장되었다가,
		// 변수가 정수형이 아니라고 판단 되면 문자로 출력하고,
		// 합연산 등으로 인해 (정수 + 정수) 형태가 되면 정수로 출력해버리기 때문에
		// 이를 다시 (char)(정수 + 정수) 처럼 char형태로 형변환해야 함.
		
	}

}
