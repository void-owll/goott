package classes;

import java.util.Scanner;

public class Member_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 정보를 입력하세요. (ID, 이름, 나이, 연락처, 직업)");
		System.out.print(">>> ");
		Member mem1 = new Member(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next());
		mem1.getMemberInfo();
		sc.close();
	}
}
