package inheritance;

public class Employee extends Person {
	int salary;
	void getEmployeeInfo() {
		System.out.println("주민번호 >> " + juMinNo);
		System.out.println("이    름 >> " + name);
		System.out.println("나    이 >> " + age);
		System.out.println("직    업 >> " + job);
		System.out.println("급    여 >> " + salary + "만원");
	}
	
}
