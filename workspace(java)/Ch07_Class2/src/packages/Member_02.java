package packages;

import java.util.Scanner;

import model.Member;

/*
 * [문제] 회원 수를 키보드로 입력을 받고, 회원 수만큼 회원의 정보를 
 * 		  키보드로 입력을 받아서 객체 배열에 저장을 하고,
 *   	  저장된 회원의 정보를 화면에 보여주세요.
 */
public class Member_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원의 수를 입력하세요 : ");
		Member[] member = new Member[Integer.parseInt(sc.nextLine())];
		
		for(int i=0; i<member.length; i++) {
			member[i] = new Member();
			System.out.println("============================");
			System.out.print((i+1)+"번째 회원의 ID : ");
			member[i].setId(sc.nextLine());
			System.out.print((i+1)+"번째 회원의 PW : ");
			member[i].setPwd(sc.nextLine());
			System.out.print((i+1)+"번째 회원의 이름 : ");
			member[i].setName(sc.nextLine());
			System.out.print((i+1)+"번째 회원의 나이 : ");
			member[i].setAge(sc.nextLine());
			System.out.print((i+1)+"번째 회원의 연락처 : ");
			member[i].setPhone(sc.nextLine());
			System.out.print((i+1)+"번째 회원의 주소 : ");
			member[i].setAddr(sc.nextLine());
			
		}
		System.out.println("=회원정보===================================================");
		System.out.println("NO.\tID.\tPW.\t이름.\t나이.\t연락처.\t\t주소.\t");
		for(int i=0; i<member.length; i++) {
			System.out.println((i+1) + "\t" + member[i].getId() +"\t" + member[i].getPwd() + "\t" 
					+ member[i].getName() +"\t" + member[i].getAge() +"\t" 
					+ member[i].getPhone() +"\t" + member[i].getAddr());	
		}
		sc.close();
	}
}
