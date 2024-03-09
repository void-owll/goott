package string;

public class String_02 {
	public static void main(String[] args) {
		String str1 = "Hello ";
		String str2 = "Java";
		System.out.println("str1 >> " +System.identityHashCode(str1));
		System.out.println("str2 >> " +System.identityHashCode(str2));
		System.out.println();
		
		// 문자열 결합(+)
		str1 += str2;
		System.out.println("str1 >> " +System.identityHashCode(str1) + " / 값 >> " + str1);
		System.out.println("str2 >> " +System.identityHashCode(str2));
		
	}
	
}
