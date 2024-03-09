package exam;

public class Person {
	String name;
	String gender;
	int age;
	
	public void getPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age + "세");
	}
	
	public Person(String name, String gender, int age) {
		this.name = name;
		this.age = age;
		if(gender.equalsIgnoreCase("male")) {
			this.gender = "남자";
		} else this.gender = "여자";
	}
	
	public Person() {}
}
