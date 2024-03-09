package inheritance;

public class Person_03 {

	public static void main(String[] args) {
//		Student student = new Student();
//		 ㄴ 기본 생성자가 없는 경우 Error 발생
		Student student = new Student("001101-2234567", "홍길동", 27, "대학생", "회계학과");
		student.getStudentInfo();
		
		System.out.println();
		
		Employee employee = new Employee();
		employee.juMinNo = "740517-1234567";
		employee.name = "홍길동";
		employee.age = 51;
		employee.job = "회사원";
		employee.salary = 1000;
		employee.getEmployeeInfo();
				
				
	}

}
