package polymorphism;

public class Car {
	// 멤버 변수
	Tire tire; //Tire = 클래스, tire = 변수이름, 포함관계를 의미함.
	
	void run() {
		tire.roll();
	}
}
