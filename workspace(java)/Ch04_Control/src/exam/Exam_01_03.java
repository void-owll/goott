package exam;

import java.util.Scanner;

public class Exam_01_03 {

	public static void main(String[] args) {
		/*
		 * [문제3] 키보드로 금액과 상품단가, 수량을 입력하면
		 * 부가세, 상품총액, 거스름돈을 화면에 보여주는
		 * 프로그램을 완성해 보세요.
		 * - 부가세 : (상품단가 * 수량)의 10%
		 * - 상품총액 : (상품단가 * 수량) + 부가세
		 * 
		 * [입력 화면]
		 * 입금액 입력 :
		 * 상품 단가 입력 :
		 * 상품 수량 입력 : 
		 * 
		 * [출력 화면]
		 * 지불한 금액 : 20000원
		 * 제품단가 : 3500원
		 * 수량 : 5
		 * 부가세 : 1750원
		 * 상품총액 : 19250원
		 * 거스름 돈 : 750원
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("입금액 입력 : ");
		int paid = sc.nextInt();
		System.out.print("상품 단가 입력 : ");
		int price = sc.nextInt();
		System.out.print("상품 수량 입력 : ");
		int count = sc.nextInt();
		
		int tax = (price * count) / 10;
		int totalPrice = tax + (price * count);
		int returnCharge = paid - totalPrice; 
		
		System.out.println();
		System.out.println("지불한 금액 : " + paid + "원");
		System.out.println("제품단가 : " + price + "원");
		System.out.println("수량 : " + count + "원");
		System.out.println("부가세 : " + tax + "원");
		System.out.println("상품총액 : " + totalPrice + "원");
		System.out.println("거스름 돈 : " + returnCharge + "원");
				
		sc.close();

	}

}
