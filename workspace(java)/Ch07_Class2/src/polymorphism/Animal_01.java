package polymorphism;

public class Animal_01 {

	public static void main(String[] args) {
		// 일반적으로 객체 생성 방법
		// Cat cat = new Cat();
		// cat.sound();
		
		// 다형성을 이용한 객체 생성 방법
		Animal cat = new Cat();	// 조상 타입(Animal)의 참조 변수(cat)를 이용해서 자식의 객체(Cat) 생성
		cat.sound();
		
		// 다형성을 이용하여 객체 생성 후 자손 객체에 접근 시
		// 자손에서 만든 멤버에는 접근할 수 없다.
		
		// cat.prn();
		
		// 자식 클래스에서 만든 메서드가 부모클래스에는
		// 존재하지 않기 떄문에 다형성의 원칙에 맞지 않음.
		// Cat cat = new Animal(); 			// 에러 발생
	}

}
