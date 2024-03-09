package goott;
/*
 * 1. 구형 메서드의 약식 표현.
 * 
 */

interface SuperA{
	void method1();
	// 반환타입 X, 매개변수 X
}

interface SuperB{
	void method2(int su);
	// 반환타입 X, 매개변수 O
}

interface SuperC{
	int method3();
	// 반환타입 O, 매개변수 X
}

interface SuperD{
	double method4(int su, double su2);
	// 반환타입 O, 매개변수 O
}



public class Lambda_02 {
	public static void main(String[] args) {
		// 1-1. 무명 클래스로 객체 생성
		SuperA a = new SuperA() {
			
			@Override
			public void method1() {
				System.out.println("무명 클래스 ==> 반환타입 X, 매개변수 X");
			}
		};

		a.method1();
		System.out.println();
		
		// 1-2. 람다 식으로 표현
		SuperA a2 = () -> {
			System.out.println("람다식 ==> 반환타입 X, 매개변수 X");
		};
		a2.method1();
		System.out.println();
		
		// 람다식에서 메서드 호출 시 실행 문장이 한줄 인 경우에는 { } 생략 가능함.
		SuperA a3 = () -> System.out.println("람다식 ==> 반환타입 X, 매개변수 X (중괄호 생략)");
		a3.method1();
		System.out.println();
		
		
		// 2-1. 무명 클래스로 객체 생성.
		SuperB b = new SuperB() {
			
			@Override
			public void method2(int su) {
				System.out.println("무명 클래스 ==> 반환타입 X, 매개변수 O / su >> " + su);
			}
		};
		
		b.method2(47);
		System.out.println();
		
		// 2-2. 람다식으로 표현.
		SuperB b2 = (int su) -> {
			System.out.println("람다식 ==> 반환타입 X, 매개변수 O / su >> " + su);
		};
		
		b2.method2(88);
		System.out.println();
		
		SuperB b3 = (su) -> {		// 매개변수 타입 생략이 가능함. -> 어차피 인터페이스에서 정해두었으니까!
			System.out.println("람다식 ==> 반환타입 X, 매개변수 O / 매개변수 타입 생략 / su >> " + su);
		};
		b3.method2(47);
		System.out.println();
		
		SuperB b4 = (su) ->	// 한 줄이면 중괄호 생략 가능!
			System.out.println("람다식 ==> 반환타입 X, 매개변수 O / 중괄호 생략 / su >> " + su);
		
		b4.method2(47);
		System.out.println();
		
		SuperB b5 = su ->	// 매개변수가 하나면 괄호도 생략 가능함.
		System.out.println("람다식 ==> 반환타입 X, 매개변수 O / 매개변수 괄호 생략 / su >> " + su);
	
		b5.method2(47);
		System.out.println();
		
		// 3-1. 무명 클래스로 객체 생성.
		SuperC c = new SuperC() {
			
			@Override
			public int method3() {
				return 27;
			}
		};
			
		System.out.println("무명 클래스 ==> 반환타입 O, 매개변수 X  >> " + c.method3()); 
		System.out.println();
		// 3-2. 람다로 표현.
		SuperC c2 = () -> {
			return 66;
		};
		
		System.out.println("람다 클래스 ==> 반환타입 O, 매개변수 X  >> " + c2.method3());
		System.out.println();
		
		// 3-2. 람다로 표현.
		SuperC c3 = () -> 66;		// return 한 줄밖에 없으면, 중괄호와 return 도 생략이 된다.
		
		
		System.out.println("람다 클래스 ==> 반환타입 O, 매개변수 X  >> " + c2.method3());
		System.out.println();
		
		// 4-1. 무명 클래스로 객체 생성.
		SuperD d = new SuperD() {
			
			@Override
			public double method4(int su1, double su2) {
				return su1 + su2;
			}
		};
			
		System.out.println("무명 클래스 ==> 반환타입 O, 매개변수 O  >> " + d.method4(40, 128)); 
		System.out.println();
		
		// 4-2. 람다로 표현.
		SuperD d1 = (su1, su2) -> su1 + su2;
		
		System.out.println("람다 클래스 ==> 반환타입 O, 매개변수 O  >> " + d1.method4(70, 401.05));
		System.out.println();
		
	}
}
