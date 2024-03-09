package classes;

public class Person_03 {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.getPersonInfo();
		
		System.out.println();
		
		person.name = "강감찬";
		person.age = 34;
		person.marriage = true;
		
		person.getPersonInfo();
	}
}
