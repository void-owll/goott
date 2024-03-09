package classes;
/*
 * [문제] 회원 객체의 멤버를 구성하여 멤버에 인자 생성자를 이용하여 초기값을
 * 		  할당 후 회원의 정보를 화면에 보여주세요.
 * 		  (회원 구성 요소 : 회원 아이디, 회원 이름, 회원 나이, 
 * 							회원 연락처, 회원 직업) 
 */
public class Member {
	String id;
	String name;
	int age;
	String phone;
	String job;
	
	public void getMemberInfo() {
		System.out.println("아이디 : "+ id);
		System.out.println("이  름 : "+ name); // TODO 
		System.out.println("나  이 : "+ age);
		System.out.println("연락처 : "+ phone);
		System.out.println("직  업 : "+ job);
	}
	
	public Member(String id, String name, int age, String phone, String job) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.job = job;
	}
	
	public Member() {	}
	
}
