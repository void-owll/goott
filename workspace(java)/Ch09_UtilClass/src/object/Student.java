package object;
/*
 *  toString() 메서드 재정의
 *  - Object 클래스에서 상속을 받은 메서드를 유용한 정보가 반환이 되도록
 *    재정의 하는 것을 말함.
 *  - 해당 클래스의 멤버변수가 정보를 가지고 있는데 
 *    가지고 있는 데이터에 올바른 값이 담겼는지 확인하는 용도로 사용됨.
 */
public class Student {
	// 멤버변수
	String name;
	String hakbun;
	String major; //학과
	String phone;
	String addr;
	public Student() {	}
	public Student(String n, String h, String m, String p, String a) {
		name = n;
		hakbun = h;
		major = m;
		phone = p;
		addr = a;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", major=" + major + ", phone=" + phone + ", addr="
				+ addr + "]";
	}
//	void getStudentInfo() {
//		System.out.println("학생 이름 >> " + name);
//		System.out.println("학생 학번 >> " + hakbun);
//		System.out.println("학생 학과 >> " + major);
//		System.out.println("학생 연락처 >> " + phone);
//		System.out.println("학생 주소 >> " + addr);
//	}
}
