package inheritance;

public class Student extends Person {
	String major;
	
	public Student() {	
		super();
	} // 기본 생성자
	public Student(String juMinNo, String name, int age, String job, String major) {
		super();
		this.juMinNo = juMinNo;
		this.name = name;
		this.age = age;
		this.job = job;
		this.major = major;
	}
	
	void getStudentInfo() {
		System.out.println("주민번호 >> " + juMinNo);
		System.out.println("이    름 >> " + name);
		System.out.println("나    이 >> " + age);
		System.out.println("직    업 >> " + job);
		System.out.println("학    과 >> " + major);
	}
	
}
