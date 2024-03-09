package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Student;
/*
 * [문제] List_05 클래스처럼 Student 객체를 만들어서 
 * 		  키보드로 학생 수를 입력을 받고, 
 * 		  입력 받은 학생 수 만큼 학생의 정보를 입력을 받아서 ArrayList에
 * 		  저장 후 화면에 출력해 보세요.
 *  	  (조건 - 학생정보는 학번, 이름, 학과, 연락처, 주소)
 */
public class List_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생 수 입력
		System.out.print("입력할 학생 수는 몇 명? : ");
		Integer studentCount = sc.nextInt();
		sc.nextLine();
		//학생 리스트 생성
		List<Student> studentList = new ArrayList<Student>();
		
		//학생 정보 입력
		for(int i=0 ; i<studentCount ; i++) {
			System.out.println((i+1)+"번째 학생의 정보를 입력하세요.");
			System.out.println("학번, 이름, 학과, 연락처, 주소...");
			Student student = new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
			studentList.add(student);
		}
		System.out.println();
		
		//학생 정보 출력
		for(int i=0; i<studentList.size(); i++) {
			Student dto = studentList.get(i); 		// 리스트에 저장된 객체(정확히는 주소값)를 dto 에 담아서 접근 가능하게 만듬.
													// dto = Data Transfer Object. 데이터를 전송하기 위한 객체.
			System.out.print((i+1)+"번째 학생의 정보입니다. \n");
			System.out.print(dto.getHakbun() + "\t");
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getMajor() + "\t");
			System.out.print(dto.getPhone() + "\t");
			System.out.print(dto.getAddr() + "\n");
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
		//출력 완료
		System.out.println(":: 출력이 완료되었습니다. ::");
		
		//스캐너 종료
		sc.close();
		
		
		
	}
}
