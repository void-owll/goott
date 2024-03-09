package goott;

// Exception_02 클래스에서 발생한 예외를
// 예외 처리 코드를 이용하여 처리해 보세요.

public class Exception_05 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		String str1 = "korea";
		
		String str2 = null;   // 값이 없는 상태
		
		try {
			// length() : 현재 문자열의 길이를 
			//            정수값으로 반환해 주는 메서드.
			System.out.println("str1 문자열의 길이 >>> " + str1.length());
			
			System.out.println("str2 문자열의 길이 >>> " + str2.length());
		
		}catch(Exception e) {
			
			System.out.println("null 값을 갖는 오류 발생");
			
			System.out.println("예외 정보 >>> " + e);
		}
		
		
		System.out.println("프로그램 종료");
		
	}
}
