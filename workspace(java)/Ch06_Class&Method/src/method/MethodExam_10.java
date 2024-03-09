package method;

import java.util.Scanner;

/*
 * 성적 처리 프로그램
 * main() 메서드에서는 키보드로 이름, 국어점수, 영어점수, 수학점수를
 * 입력을 받고, 총점 메서드, 평균 메서드, 학점 메서드를 호출하여
 * 성적을 처리 후에 화면에 성적 결과를 출력해 보자.
 */
public class MethodExam_10 {
	
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
		
		sc.close();
	}
}
