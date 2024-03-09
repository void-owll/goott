package exam_abstracts;

import java.util.Scanner;

public class Main_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요. (1. 원형, 2. 사각형)");
		System.out.print("도형 선택 >>> ");
		int shapeType = sc.nextInt();
		
		if(shapeType == 1) {
			System.out.print("반지름 입력 >>> ");
			Circle c = new Circle(sc.nextInt());
			System.out.println("=====================");
			System.out.printf("원의 면적 : %.1f\n", c.findArea());
		} else if(shapeType == 2) {
			System.out.print("가로 >>> ");
			int width = sc.nextInt();
			System.out.print("세로 >>> ");
			int height = sc.nextInt();
			Rectangle r = new Rectangle(height, width);
			System.out.println("=====================");
			System.out.printf("사각형의 면적 : %.1f\n", r.findArea());
		} 
		sc.close();
	}
}
