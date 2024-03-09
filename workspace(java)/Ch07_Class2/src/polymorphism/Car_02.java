package polymorphism;

public class Car_02 {
	public static void main(String[] args) {
		// 필드의 다형성
		Car car = new Car();

		
		car.tire = new HanKookTire();
		car.run();
		
		car.tire = new KumHoTire();
		car.run();
	}
}
