package exam_abstracts;

import java.util.Scanner;

public class Main_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태-정규직<P>, 임시직<T>를 입력하세요.");
		String pt = sc.next();
		
		if(pt.equalsIgnoreCase("p")) {
			System.out.println("이름, 기본급, 보너스를 입력하세요.");
			Permanent p = new Permanent(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println("=======================================");
			System.out.println("고용형태 : 정규직");
			System.out.println("이름 : " + p.getName());
			System.out.printf("급여 : %,d원\n", p.getPays());
		} else if(pt.equalsIgnoreCase("t")) {
			System.out.println("이름, 작업시간, 시간당 급여를 입력하세요.");
			Temporary t = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println("=======================================");
			System.out.println("고용형태 : 임시");
			System.out.println("이름 : " + t.getName());
			System.out.printf("급여 : %,d원\n", t.getPays());
		}
		
		sc.close();
	}

}
