package method;

// 메서드 호출 시 반환형에 대한 내용
public class MethodExam_09 {
	public static int method1() {
		return 178;
	}
	
	//변수명이 반환되는 경우
	public static int method2(int su1, int su2) {		
		int sum = (su1*2) + (su2*2);
		return sum;
	}
	
	//수식이 반환되는 경우
	public static int method3(int su1, int su2) {
		return su1*su2;
	}
	
	//단순한 문자열을 반환하는 경우
	public static String method4() {
		return "세종대왕";
	}
	
	//문자열 변수를 반환하는 경우
	public static String method5(String str1, String str2) {
		String result = str1 + str2 + " 만세";
		return result;
	}
	
	//문자열 수식을 반환하는 경우
	public static String method6(String str1, String str2) {
		return str1 + str2;
	}
	
	public static void main(String[] args) {
		int su = method1();
		System.out.println("su >>> " + su);
		
		System.out.println("method1() 메서드 호출 후 반환된 값 >>> " + method1());
		System.out.println("method2() 메서드 호출 후 반환된 값 >>> " + method2(200, 142));
		System.out.println("method3() 메서드 호출 후 반환된 값 >>> " + method3(200, 142));
		System.out.println("method4() 메서드 호출 후 반환된 값 >>> " + method4());
		System.out.println("method5() 메서드 호출 후 반환된 값 >>> " + method5("대한", "민국"));
		System.out.println("method6() 메서드 호출 후 반환된 값 >>> " + method6("홍", "길동"));
		
	}
}
