package exam;

import java.util.Scanner;

public class Exam_02_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("** coffee 메뉴 ***");
		System.out.println("1. 아메리카노 - 3,000원");
		System.out.println("2. 카페라떼 - 4,000원");
		System.out.println("3. 마키아또 - 4,500원");
		System.out.println("4. 바닐라라떼 - 4,500원");
		System.out.print("위 메뉴 중 하나를 선택하세요. : ");
		int menu = sc.nextInt();
		String menuKor = ""; 
		System.out.print("주문수량 >> ");
		int amount = sc.nextInt();
		System.out.print("입금액 >> ");
		int paid = sc.nextInt();
		int value = 0;
		
		switch (menu) {
			case 1:
				value = 3000;
				menuKor = "아메리카노";
				break;
			case 2:
				value = 4000;
				menuKor = "카페라떼";
				break;
			case 3:
				value = 4500;
				menuKor = "마키아또";
				break;
			case 4:
				value = 4500;
				menuKor = "바닐라라떼";
				break;
		}
		
		int totalPrice = (int) ((value * 1.1) * amount);
		int change = paid - totalPrice;
		
		System.out.println();
		System.out.println("주문한 메뉴 : " + menuKor);
		System.out.printf("커피단가 : %,d원\n", value);
		System.out.println("주문수량 : " + amount);
		System.out.printf("입금액 : %,d원 \n",paid);
		System.out.printf("총 금액 : %,d원 \n",totalPrice);
		System.out.printf("거스름돈 : %,d원 \n",change);
		
		sc.close();
	}
		
		
				
				
}

