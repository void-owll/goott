package object;

import java.util.Scanner;

public class Student_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 이름, 학번, 학과, 연락처, 주소를 입력하세요.....");
		Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
		
		//student.getStudentInfo();
		System.out.println(student.toString());
		sc.close();
				
	}
}
