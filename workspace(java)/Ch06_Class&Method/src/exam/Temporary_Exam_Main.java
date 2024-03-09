package exam;

import java.util.Scanner;

public class Temporary_Exam_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
		Temporary temp1 = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());
		
		System.out.println("=====================");
		System.out.printf("이름 : %s\n", temp1.name);
		System.out.printf("총급여 : %,d원\n", temp1.totalSalary());
		System.out.printf("공제액 : %,d원\n", temp1.deDuction());
		System.out.printf("실지급액 : %,d원\n", temp1.actualSalary());
		sc.close();
		

	}

}
