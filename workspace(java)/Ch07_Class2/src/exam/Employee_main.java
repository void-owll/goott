package exam;

import java.util.Scanner;

public class Employee_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태- 정규직<P>, 임시직<T>를 입력하세요.");
		String employeeType = sc.next();
		
		if(employeeType.equalsIgnoreCase("p")) {
			System.out.println("이름, 기본급, 보너스를 입력하세요.");
			Permanent p = new Permanent(sc.next(), sc.nextInt(), sc.nextInt());
			
			System.out.println("=====================");
			System.out.println("고용형태 : 정규직");
			System.out.println("이름 : " + p.getName());
			System.out.printf("급여 : %,d원", p.getPays());
		} else if(employeeType.equalsIgnoreCase("t")) {
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
			Temporary t = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println("=====================");
			System.out.println("고용형태 : 임시직");
			System.out.println("이름 : " + t.getName());
			System.out.printf("급여 : %,d원", t.getPays());
			
		}
		
		sc.close();
	}

}
