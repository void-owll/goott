package classes;

/*
 * 1. 클래스를 대상으로 객체를 생성하는 과정.
 * 	  형식) 클래스이름 참조변수 = new 클래스이름(); 	==>  X
 * 			클래스이름 참조변수 = new 생성자();			==>  O
 * 
 * 2. 생성자(Constructor)?
	 * 1. 클래스를 대상으로 객체를 생성하는 역할을 하는 놈.
	 * 2) 클래스 이름과 동일함.
	 * 3) 클래스에 포함되어 있으며, 객체를 생성할 때 자동으로 딱 한 번만 호출이 됨. 
	 * 4) 클래스는 생성자를 통해서 객체로 생성이 됨.
	 * 
	 * 생성자 형식)
	 * 				[접근제한] 생성자이름(매개변수) {
	 * 					생성자 호출 시 실행될 문장;
	 * 				}
	 * 5) 생성자는 메서드 형태를 띄고 있음.
	 * 		==> 리턴타입(반환형) (X), void(X), 매개변수(O)
	 * 6) 모든 클래스는 반드시 한 개 이상의 생성자를 가지고 있음.
	 * 7) 사용자가 생성자를 정의하지 않으면, JVM이 컴파일 시점에서 
	 * 	  자동으로 기본 생성자를 만들어 줌.
	 * 
 * 3. 생성자의 목적 : 멤버변수들의 초기화를 목적으로 사용이 됨.
 * 
 * 4. 생성자 특징
 * 		1) 생성자 이름 == 클래스 이름
 *   	2) 메서드와 다르게 반환형이 없음.
 *   	3) 클래스에는 반드시 한 개 이상의 생성자를 가지고 있음.
 *   	4) 생성자 오버로딩이 가능함.
 *   	   (즉, 여러 개의 생성자가 존재할 수 있음)
 *      5) 생성자가 보이지 않으면 기본생성자가 숨어 있음.
 *      6) 기본 생성자라 함은 매개변수가 없는 생성자를 말함.
 *      7) 기본 생성자 외에 다른 생성자를 만들면, 숨어 있던 기본 생성자는 사라짐.
 *      8) 기본 생성자 외에 다른 생성자를 만들면, 무조건 기본 생성자를 만들어 줄 것.
 *         (만약 기본 생성자를 만들지 않으면 상속에서 문제가 발생함.)
 *          => 상속에서 추후 설명 예정.
 */
public class Student {
	// 멤버 변수 선언
	int hakbun;					//학번
	String name;				//이름
	String major;				//학과
	String phone;				//연락처
	String addr;				//주소
	
	public Student() { 			//매개변수가 없는 생성자 = "기본 생성자"
		// TODO Auto-generated constructor stub
	}
	
	public Student(int h, String n, String m, String p, String a) {	// 인자 생성자(매개변수가 있음)
		hakbun = h;
		name = n;
		major = m;
		phone = p;
		addr = a;
	}
	
	// 멤버 메서드 선언
	void getStudentInfo() {
		System.out.println("학생 학번 >>> " + hakbun);
		System.out.println("학생 이름 >>> " + name);
		System.out.println("학생 학과 >>> " + major);
		System.out.println("학생 연락처 >>> " + phone);
		System.out.println("학생 주소 >>> " + addr);
	}
	
}
