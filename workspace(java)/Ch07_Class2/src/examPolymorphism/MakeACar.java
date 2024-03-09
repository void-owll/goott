package examPolymorphism;

public class MakeACar {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.tire = new KumhoTire();
		car.drive();
		
		car.tire = new Michelin();
		car.drive();
	}

}
