package goott;
/*
 *  람다식(Lambda Expression)?
 *  - 메서드를 하나의 "식(expression)"으로 표현한 것.
 *  - 람다식으로 표현하면 메서드의 이름과 반환값이 없어지므로
 *    "익명(무명)함수"라고도 한다.
 *  - 함수명을 선언하고 사용하는 것이 아닌 식별자 없이 실행 가능한 함수를 말함.
 *  - 절차형 프로그래밍, 객체지향 프로그래밍과는 사뭇 다르게 
 *    함수의 구현과 호출만으로 프로그램을 만드는 방식인 "함수형 프로그래밍"에서 자주 사용이 됨.
 *  - jdk 1.8 부터 도입이 되었으며, 람다식을 익명함수로 만드는 것을 말함.
 *  
 *  - 자바에서 일반적으로 메서드를 사용하기 위해서는 
 *    항상 클래스를 객체로 생성한 후에 -> 참조변수를 이용하여 메서드를 호출하게 되어 있음.
 *    만약 모든 클래스에서 공통적으로 사용하는 메서드가 있다면 
 *    모든 클래스마다 해당 메서드를 정의해야 하는 불편함이 있음.
 *    이러한 이런 메서드를 독립적으로 만든 후에 사용한다면 편하지 않을까? 
 *  - 하지만 자바는 객체지향 언어이므로 모든 메서드는 클래스 또는 인터페이스 내부에 존재해야 함.
 *    그리고 해당 메서드르 사용하기 위해서는 해당 클래스의 객체를 먼저 생성한 후에 메서드를 호출해야 함.
 *  - 이를 해결하는 것이 "람다식"임.   
 *    자바는 새로운 메서드 문법을 정의하는 대신에 의미 있는 인터페이스의 문법을 활용하여 람다식을 표현할 수 있음.
 *  - 단 하나의 추상메서드를 포함하는 인터페이스를 함수형 인터페이스라고 함.
 *    이 함수형 인터페이스의 호출 및 기능을 구현하는 방법을 람다식이라고 함.
 *      
 */

/*
 * 람다식의 활용
 * 1. 구현 메서드의 약식 표현
 * 2. 메서드 참조.
 */

interface Super {
	void output();
}

class Sub implements Super {

	@Override
	public void output() {
		System.out.println("인터페이스 추상메서드 구현 클래스로 재정의 되었음.");
	}
	
}

public class Lambda_01 {
	public static void main(String[] args) {
		
		// 다형성을 이용한 객체 생성 방법
		Super sub = new Sub();
		sub.output();
		
		System.out.println();
		
		// 무명클래스를 이용한 객체 생성 방법
		Super super1 = new Super() {
			
			@Override
			public void output() {
				System.out.println("인터페이스 추상 메서드 무명 클래스로 재정의 되었음.");
			}
		};
		
		super1.output();
		System.out.println();
		
		// 함수형 프로그래밍 방법 - 람다식을 이용한 방법
		Super super2 = () -> {			// 인터페이스에 추상 메서드가 1개만 있을 때, 사용할 수 있다!! 
										// 왜냐? 무슨 메서드인지 어케 알고...
			System.out.println("인터페이스 추상 메서드 람다로 재정의 되었음.");
		};
		super2.output();
		
		
	}
}
