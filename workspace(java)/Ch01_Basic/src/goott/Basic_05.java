package goott;

public class Basic_05 {

	public static void main(String[] args) {	
		//숫자 + 숫자 => 숫자(+의 역할 : 덧셈)
		System.out.println(10 + 23);
		//문자 + 숫자 => 문자(+의 역할 : 문자열 연결). 역순도 동일
		//문자 + 문자 => 문자
		//변수형 오류 나던 파이썬과 다르게 연산이 잘 되네?
		System.out.println("10" + 23);
		System.out.println(10 + "23");
		System.out.println("10" + "23");
		System.out.println("10" + 4 + 7); //1047
		System.out.println(4 + 7 + "10"); //1110
		System.out.println("10" + (4 + 7)); //1011
	}
}
