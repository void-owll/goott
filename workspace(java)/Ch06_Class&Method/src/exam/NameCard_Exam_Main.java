package exam;

import java.util.Scanner;

public class NameCard_Exam_Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("이름, 전화번호, 주소, 직급을 입력하세요. ");
		NameCard member1 = new NameCard(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
		member1.printNameCard();

		int age = Integer.parseInt(sc.nextLine());
		String address = sc.nextLine();
		
		
		sc.close();
	}
		
}
