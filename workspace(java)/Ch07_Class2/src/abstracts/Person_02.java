package abstracts;

public class Person_02 {

	public static void main(String[] args) {
		
		Student student = 
			new Student("2024_001", "홍길동", "컴퓨터공학과");
		
		Professor professor = 
					new Professor("세종대왕", "국문학과");
		
		student.getInfo();
		
		System.out.println();
		
		professor.getInfo();

	}

}
