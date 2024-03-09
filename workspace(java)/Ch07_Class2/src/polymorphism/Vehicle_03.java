package polymorphism;

public class Vehicle_03 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		driver.drive(bus);
		
		driver.drive(new Taxi());
		
		Subway subway = new Subway();
		driver.drive(subway);
	}
}
