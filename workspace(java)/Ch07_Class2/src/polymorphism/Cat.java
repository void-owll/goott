package polymorphism;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("애옹");
	}
	void prn() {
		System.out.println("출력용 메서드 입니다.");
	}
}
