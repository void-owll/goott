package classes;

public class Student_04 {
	public static void main(String[] args) {
		// 기본 생성자로 객체를 생성하는 방법.
		Student student = new Student();
		student.hakbun = 2024001;
		student.name = "홍길동";
		student.major = "경제학과";
		student.phone = "010-1111-1234";
		student.addr = "서울시 구로구";
		student.getStudentInfo();
		
		System.out.println();
		
		// 인자 생성자로 객체를 생성하는 방법.
		Student student2 = new Student(2024002, "세종대왕", "국문학과", "010-2222-2345", "서울시 중구");
		student2.getStudentInfo();
		
	}
}
