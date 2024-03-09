package abstracts;

public class Student extends Person {

	String hakbun;
	String major;
	
	public Student() {  }  // 기본 생성자
	
	public Student(String hakbun, String name,
			String major) {
		
		this.name = name;
		this.hakbun = hakbun;
		this.major = major;
		
	}  // 인자 생성자

	// 부모 클래스의 추상 메서드를 재정의한 메서드.
	@Override
	void getInfo() {
		
		System.out.println("학생 학번 >>> " + hakbun);
		System.out.println("학생 이름 >>> " + name);
		System.out.println("학생 학과 >>> " + major);
	
	}  // getInfo() 메서드 end
	
}
