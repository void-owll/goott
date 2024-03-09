package exam;

import java.util.Scanner;

public class Rectangle_Exam_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형의 가로, 세로를 입력하세요.");
		Rectangle rec1 = new Rectangle(sc.nextInt(), sc.nextInt());
		
		System.out.println("========================================");
		System.out.println("사각형의 넓이 : "+rec1.area());
		System.out.println("사각형의 둘레 : "+rec1.girth());	
	
		sc.close();
	}
}
