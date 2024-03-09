package inner;
/*
 * 다양한 형태의 클래스 선언 방법
 * 1. 일반적인 선언 방법
 *    ==> 하나의 java 파일에 class 키워드를 작성하여 클래스 선언.
 * 2. 무명 클래스(anonymous class) 선언
 *    ==> 이름이 없는 클래스 선언. interface 객체 생성 시 많이 사용한다.
 * 3. 중첩 클래스(inner class) 선언
 *    ==> 클래스 안에 또 다른 클래스 선언.
 */
public class Inter_01 {
	public static void main(String[] args) {
		Sub sub = new Sub(); 		// 일반적인 객체 생성
		System.out.println("sum() 메서드 호출 >> " + sub.sum(200,36));
		System.out.println("minus() 메서드 호출 >> " + sub.minus(200,36));
		
		Inter inter = new Inter() {	// 무명 클래스(anonymous class) 선언 
			
			@Override				// 무명 클래스 추가 시 저절로 나타나는 어노테이션
			public int sum(int n1, int n2) {
				return n1 + n2;
			}
			
			@Override
			public int minus(int n1, int n2) {
				return n1 - n2;
			}
		};			
		
		System.out.println("interface sum() 메서드 호출 >> " + inter.sum(300, 237));
		System.out.println("interface minus() 메서드 호출 >> " + inter.minus(300, 237));
		
	}
	
}
