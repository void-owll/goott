package exam;

import java.util.Scanner;

public class Person_Exam_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 성별(male/female), 나이를 입력하세요.");
		
		String name = sc.next();
		String gender = sc.next();
		int age = sc.nextInt();
		
		Person person1 = new Person(name, gender, age);
		person1.getPersonInfo();
		
		sc.close();

	}

}
