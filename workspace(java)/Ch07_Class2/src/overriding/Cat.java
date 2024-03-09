package overriding;

public class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("하아악");
	}
}
