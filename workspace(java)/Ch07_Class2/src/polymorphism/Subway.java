package polymorphism;

public class Subway implements Vehicle {

	@Override
	public void run() {
		System.out.println("기차가 달립니다.");
	}

}
