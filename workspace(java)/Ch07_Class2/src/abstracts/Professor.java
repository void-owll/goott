package abstracts;

public class Professor extends Person {

	String major;
	
	
	public Professor() { }  // 기본 생성자
	
	public Professor(String name, String major) {
		
		this.name = name;
		this.major = major;
		
	}  // 인자 생성자
	
	
	// 부모 클래스의 추상 메서드를 재정의한 메서드.
	@Override
	void getInfo() {
		
		System.out.println(name + " 교수입니다.");
		System.out.println(major + "과목을 강의 중입니다.");
		
	}  // getInfo() 메서드 end

}
