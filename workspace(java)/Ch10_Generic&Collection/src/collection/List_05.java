package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Member;

public class List_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 수를 입력하세요 : ");
		int memberCount = sc.nextInt();
		sc.nextLine();
		List<Member> list = new ArrayList<Member>();
		//String id, String pwd, String name, String age, String phone, String addr
		
		// 1. 키보드로 회원 수 만큼 회원 정보를 입력받아서 ArrayList에 저장해 보자.
		
		for(int i=0; i<memberCount; i++) {
			System.out.println((i+1)+"번째 회원의 아이디, 비밀번호, 이름, 나이, 연락처, 주소");
			
			Member member = new Member(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			list.add(member);
			
		}
		
		// 2. 회원 정보를 ArrayList 에서 가져와서 화면에 출력해 보자.
		for(int i=0; i<list.size(); i++) {
			Member dto = list.get(i);
			System.out.print(dto.getId() + "\t");
			System.out.print(dto.getPwd() + "\t");
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getAge() + "\t");
			System.out.print(dto.getPhone() + "\t");
			System.out.println(dto.getAddr());
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
		sc.close();
	}

}
