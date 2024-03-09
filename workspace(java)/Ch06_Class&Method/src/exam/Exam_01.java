package exam;

import java.util.Scanner;

public class Exam_01 {

	public static void regStudent(int count, String[] name, int[] number, String[] sClass, String[] phone) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<count ; i++) {
			
			System.out.println(":::" +(i+1)+"번째 학생 등록:::");
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
			System.out.print("학번 입력 : ");
			number[i] = sc.nextInt();
			System.out.print("학과 입력 : ");
			sClass[i] = sc.next();
			System.out.print("전화번호 입력 : ");
			phone[i] = sc.next();
			
		}
	}
	
	public static void printStudent(int count, String[] name) {
		for(int i=0 ; i<count ; i++) {
			System.out.println((i+1) + " : " + name[i]);
		}
	}
	
	public static void printDetail(int count, String[] studentName, int[] studentNumber,String[] studentClass,String[]  studentPhone) {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 학생의 학번 입력 : ");
		int number = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			if(number == studentNumber[i]) {
				System.out.println("이름 : " + studentName[i]);
				System.out.println("학번 : " + studentNumber[i]);
				System.out.println("학과: " + studentClass[i]);
				System.out.println("전화번호 : " + studentPhone[i]);
			}
		}

	}
	
	public static void modifyInfo(int count, String[] studentName, int[] studentNumber,String[] studentClass,String[]  studentPhone) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 학생의 학번 입력 : ");
		int number = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			if(number == studentNumber[i]) {
				System.out.println(":::" +(studentName[i])+"학생 정보 수정:::");
				System.out.print("이름 입력 : ");
				studentName[i] = sc.next();
				System.out.print("학번 입력 : ");
				studentNumber[i] = sc.nextInt();
				System.out.print("학과 입력 : ");
				studentClass[i] = sc.next();
				System.out.print("전화번호 입력 : ");
				studentPhone[i] = sc.next();
			}
		}
	}
	
	public static boolean exitProgram() {
		Scanner sc = new Scanner(System.in);
		System.out.print("프로그램을 종료하시겠습니까? (y/n) : ");
		String keyInput = sc.next();
		boolean exit = false;
		if(keyInput.equalsIgnoreCase("y")) {
			exit = true;
		}
		return exit;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("::학생 관리 프로그램::");
		System.out.print("학생 수를 입력하세요 : ");
		int count = sc.nextInt();
		System.out.println("학생 수는 "+ count + " 명입니다.");
		
		String[] studentName = new String[count];
		int[] studentNumber = new int[count];
		String[] studentClass = new String[count];
		String[] studentPhone = new String[count];

		int menu = 0;
		while(true) {
			System.out.println(":: 메뉴를 선택해주세요 ::");
			System.out.println("1 : 학생등록");
			System.out.println("2 : 전체출력");
			System.out.println("3 : 학생조회");
			System.out.println("4 : 정보수정");
			System.out.println("5 : 프로그램 종료");
			System.out.print(" >> ");
			menu = sc.nextInt();
			
			if (menu == 1) {
				regStudent(count, studentName, studentNumber, studentClass, studentPhone);
			} else if(menu == 2) {
				printStudent(count, studentName);
			} else if(menu == 3) {
				printDetail(count, studentName, studentNumber, studentClass, studentPhone);
			} else if(menu == 4) {
				modifyInfo(count, studentName, studentNumber, studentClass, studentPhone);
			} else {
				boolean exit = exitProgram();
				if (exit) {
					break;
				}
			}
			System.out.println();
			System.out.println();
			
		}
		System.out.println("프로그램이 종료되었습니다.");
		sc.close();
	}
}
