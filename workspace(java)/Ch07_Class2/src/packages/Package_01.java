package packages;

import model.Member;

/*
 * 패키지(package)?
 * - 서로 연관성이 있는 클래스들과 인터페이스들의 묶음을 말함.
 * - 패키지는 물리적으로 폴더 개념과 유사함.
 *   패키지는 서브 패키지를 가질 수 있으며, "." 으로 구분함.
 * - import 키워드 : 현재 패키지의 클래스에서 다른 패키지에 있는 클래스를 사용하고 싶은 경우 import 해야 함.
 *   				 (단, 동일한 패키지에 있는 다른 클래스를 사용할 경우에는 생략 가능) 
 *   
 *   형식) import 패키지명.서브패키지명.클래스명;
 *   
 * - import 단축 키 : ctrl + shift + o
 */


public class Package_01 {
	public static void main(String[] args) {
		Member member = new Member();
		
		// 회원의 정보를 저장.
		member.setId("hong");
		member.setPwd("1234");
		member.setName("홍길동");
		member.setAge("27");
		member.setPhone("010-1111-1234");
		member.setAddr("서울시 구로구");
		
		// 회원 정보 출력
		System.out.println("회원 아이디 >>> " + member.getId());
		System.out.println("회원 비밀번호 >>> " + member.getPwd());
		System.out.println("회원 이름 >>> " + member.getName());
		System.out.println("회원 나이 >>> " + member.getAge());
		System.out.println("회원 연락처 >>> " + member.getPhone());
		System.out.println("회원 주소 >>> " + member.getAddr());
		
	}
}
