package overriding;

public class Animal_01 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		Horse horse = new Horse();
		horse.sound();
		dog.sound(1);
	}

}
