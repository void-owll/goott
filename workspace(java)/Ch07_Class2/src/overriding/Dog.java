package overriding;

/*
 * 메서드 재정의(Method overriding)
 * - 부모 클래스에서 정의한 메서드를 자식 클래스에서
 *   자식 클래스에 맞게 다시 작성(재정의)하는 것을 말함.
 *   
 * [메서드 재정의 특징]
 * 1. 반드시 상속 관계에서만 발생함.
 *    (메서드 다중 정의 : 동일한 클래스 내에서 발생)
 * 2. 부모 클래스의 원형 메서드를 자식 클래스에서 재정의(다시 작성).
 * 
 * [메서드 재정의 조건]
 * 1. 반드시 접근지정자, 리턴타입(반환형), 매개변수 갯수와 자료형
 *    모두 일치해야 함.
 *    (메서드 다중 정의 : 매개변수의 갯수나 자료형이 다름) 
 * 2. 접근 지정자는 확대 가능(축소 불가능)
 */
public class Dog extends Animal {
//	void sound() {
//		System.out.println("멍멍~~~");
//	}
	
	@Override
	void sound() {
		System.out.println("컹컹~~~");
	}
	
	//overloading
	void sound(int i) {
		System.out.println("으르렁");
	}
}
