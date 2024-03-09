package goott;

// java 에서의 출력 양식

public class Basic_06 {

	public static void main(String[] args) {
		// System.out.println()
		// System.out.print()
		// System.out.printf()    f:format
		
		// %d = 정수 출력 시
		System.out.printf("%d + %d = %d\n", 10, 20, (10+20));
		
		// %o = 8진수 출력 시
		System.out.printf("10의 8진수는 >>> %o\n", 10);
		
		// %x = 16진수 출력 시
		System.out.printf("15의 16진수는 >>> %x\n", 15);
		// %f = 실수 출력 시
		System.out.printf("%f\n", 3.2582);
		System.out.printf("%.3f\n", 3.2582);
		System.out.printf("%d\n", 10000000);
		System.out.printf("%,d\n", 10000000);
	}

}
