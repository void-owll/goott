package exam;

import java.util.Scanner;

public class Exam_01_01 {
	public static void input(String[] name, int[] hakbun, String[] major, String[] phone, Scanner sc) {
		for(int i=0; i<name.length; i++) {
			System.out.println("::::: "+ (i+1)+"번째 학생 등록 :::::");
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
			System.out.print("학번 입력 : ");
			hakbun[i] = sc.nextInt();
			System.out.print("학과 입력 : ");
			major[i] = sc.next();
			System.out.print("연락처 입력 : ");
			phone[i] = sc.next();
		}
	}
	
	public static void output(String[] name, int[] hakbun, String[] major, String[] phone) {
		for(int i=0; i<name.length; i++) {
			System.out.println("::::: "+ (i+1)+"번째 학생 정보 :::::");
			System.out.println("이름 : " + name[i]);
			System.out.println("학번 : " + hakbun[i]);
			System.out.println("학과 : " + major[i]);
			System.out.println("연락처 : " + phone[i]);
			System.out.println();
		}
		
		System.out.println("::::: 모든 학생 출력 완료 :::::");
		}
	
	public static void search(String[] name, int[] hakbun, String[] major, String[] phone, Scanner sc) {
		System.out.print("수정할 학생의 학번을 입력하세요 : ");
		int num = sc.nextInt();
		for(int i=0 ; i<name.length; i++) {
			if(num == hakbun[i]) {
				System.out.print("학과 : ");
				major[i] = sc.next();
				System.out.print("연락처 : ");
				phone[i] = sc.next();
			}
		}
	}
	
	public static void modify(int[] hakbun, String[] major, String[] phone, Scanner sc) {
		int num = sc.nextInt();
		for(int i=0 ; i<hakbun.length; i++) {
			if(num == hakbun[i]) {
				System.out.println("학번 : " + hakbun[i]);
				System.out.println("학과 : " + major[i]);
				System.out.println("연락처 : " + phone[i]);
				System.out.println();
			}
		}
	}
	
	public static String end(Scanner sc) {
		System.out.print("종료하시겠습니까? (y/n) : ");
		return sc.next();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요. : ");
		int studentCount = sc.nextInt();
		
		String[] names = new String[studentCount];
		int[] hakbuns = new int[names.length];
		String[] majors = new String[names.length];
		String[] phones = new String[names.length];
		
		while(true) {
			System.out.println("1. 학생 등록");
			System.out.println("2. 전체 출력");
			System.out.println("3. 학생 조회");
			System.out.println("4. 정보 수정");
			System.out.println("5. 프로그램 종료");
			System.out.println();
			
			System.out.print("학생 관리 메뉴 중 하나를 선택하세요 : ");
			int menu = sc.nextInt();
			String endFlag = "";
			switch(menu) {
				case 1:
					input(names, hakbuns, majors, phones, sc); // scanner 를 넘겨줄 수 있다. >> 메서드안에서 스캐너 선언 필요 없어짐.
					break;
				case 2:
					output(names, hakbuns, majors, phones);
					break;
				case 3:
					search(names, hakbuns, majors, phones, sc);
					break;
				case 4:
					modify(hakbuns, majors, phones, sc);
					break;
				case 5:
					endFlag = end(sc);
					break;
				default:
					System.out.print("잘못된 입력입니다.\n >> 1~5 사이의 값을 입력하세요 : ");
			}
			if(endFlag.equalsIgnoreCase("y")) {
				break;
			}
			System.out.println("프로그램이 종료 되었습니다. 수고 하셨습니다.");
		}
		
				
	}
}
