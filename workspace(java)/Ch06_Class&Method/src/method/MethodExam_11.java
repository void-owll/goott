package method;

import java.util.Scanner;

// 개인별 성적 처리 - 무한반복
public class MethodExam_11 {
	
	public static int sumScore(int kor, int eng, int math) {
		return kor+eng+math;
	}
	
	public static double averageScore(int sum) {
		return sum/3.0;
	}
	
	public static String gradeScore(double average) {
		String grade = "";
		
		if(average >= 90) {
			grade = "A학점";
		}else if(average >= 80) {
			grade = "B학점";
		}else if(average >= 70) {
			grade = "C학점";
		}else if(average >= 60) {
			grade = "D학점";
		}else{
			grade = "F학점";
		}
		return grade;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("학생의 이름을 입력하세요 : ");
			String name = sc.next();
			System.out.print("국어점수를 입력하세요 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수를 입력하세요 : ");
			int math = sc.nextInt();
			
			int sum = sumScore(kor, eng, math);
			double average = averageScore(sum);
			String grade = gradeScore(average);
			
			//System.out.printf("이름 : %s\t 총점 : %d\t 평균 : %.2f\t 학점 : %s\t\n",name, sum, average,grade);
			System.out.println("이    름 : " + name);
			System.out.println("국어점수 : " + kor + "점");
			System.out.println("영어점수 : " + eng + "점");
			System.out.println("수학점수 : " + math + "점");
			System.out.println("총    점 : " + sum + "점");
			System.out.printf("평    균 : %.2f 점\n", average);
			System.out.println("학    점 : " + grade);
			System.out.println(("::::::::::::::::::::::::::::::::::::::::::::::"));
			System.out.println();
			
			// 계속 진행할지?, 종료를 할지 여부를 확인해야 함.
			System.out.print("계속 진행할까요?( Y:계속 / N:종료 ) : ");
			String res = sc.next();
			
			if (res.equalsIgnoreCase("n")) { // 문자열.equalsIgnoreCase("조건") = "조건"의 대소문자 구분을 하지 않음.
				break;
			}
			
			
		}
		System.out.println("수고 많이 하셨습니다.");
		
		sc.close();	
	}
}
