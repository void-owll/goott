package string;

// String 클래스에서 주로 사용하는 메서드
public class String_03 {
	public static void main(String[] args) {
		// 1. toUpperCase() : 소문자 -> 대문자
		//    toLowerCase() : 대문자 -> 소문자
		String str= "java program";
		
		System.out.println("str 문자열을 대문자로 변환 >> " + str.toUpperCase());
		System.out.println("str 문자열을 소문자로 변환 >> " + str.toUpperCase().toLowerCase());
		System.out.println();
		
		// 2. length() : 문자열의 길이를 정수값으로 반환해 주는 메서드.
		System.out.println("str 문자열의 길이 >> " + str.length());
		System.out.println();
		
		// 3. concat() : 문자열을 결합하는 메서드.
		String str1 = "JAVA ";
		String str2 = str1.concat("PROGRAM");
		System.out.println("str2 >> " + str2);
		System.out.println();
		
		
		// 4. equalsIgnoreCase() : 대소문자를 구분하지 않고 일치하는지 확인하는 메서드.
		if(str1.equalsIgnoreCase(str2)) System.out.println("두 문자열은 같은 문자열이다.");
		else System.out.println("두 문자열은 다른 문자열이다.");
		System.out.println();
		
		// 5. charAt(index) : 문자열에서 특정 단일 문자를 추출하는 메서드.
		String juminNo = "123456-3345678";
		char gender = juminNo.charAt(7);
		System.out.println(gender == '2' || gender == '4' ? "여자입니다" : "남자입니다");
		
		
	}
}
