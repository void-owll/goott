package string;
/*
 * String 클래스의 특징
 * 1. 문자열 객체를 처리하는 클래스.
 * 2. 객체 생성 방법 - 2가지
 *    1) 일반 변수 선언 방법으로 객체 생성.
 *    	  예) String str1 = "홍길동";
 *    		  String str2 = "홍길동";
 *    2) new 키워드를 이용하여 객체 생성.
 *    	  예) String str3 = new String("홍길동");
 *    	      String str4 = new String("홍길동");
 *    
 */
public class String_01 {

	public static void main(String[] args) {
		// 1. 일반 변수 선언 방법으로 객체 생성.
		String str1 = "홍길동";
		String str2 = "홍길도";
		System.out.println("str1 값 >> " + str1);
		System.out.println("str1 주소값 >> " + System.identityHashCode(str1));
		System.out.println("str2 값 >> " + str2);
		System.out.println("str2 주소값 >> " + System.identityHashCode(str2));
		
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		String str5 = "홍길동";
		System.out.println("str3 주소값 >> " + System.identityHashCode(str3));
		System.out.println("str4 주소값 >> " + System.identityHashCode(str4));
		System.out.println("str5 주소값 >> " + System.identityHashCode(str5));
		
	}

}
