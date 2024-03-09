package classes;

import java.util.Scanner;

public class Drink_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("자판기 음료 갯수를 입력하세요. : ");
		
		// 객체 배열 선언 및 객체 배열 메모리 할당 !!!
		Drink[] drinks = new Drink[6];
		// 음료(6개) - 콜라, 사이다, 옥수수수염차, 17차, 몬스터, 포카리스웨트 

		
		for(int i=0 ; i<drinks.length ; i++) {
			System.out.println("음료의 이름과 가격을 입력하세요......");
			System.out.println("=====================================");
			
			drinks[i] = new Drink(sc.next(), sc.nextInt());
		}
		System.out.println();
		System.out.print("돈을 넣어 주세요. : ");
		
		int coin = sc.nextInt();
		
		/*
		 * 입력 받은 coin(돈)과 객체 배열에 저장된 Drink
		 * 클래스의 멤버변수인 price(음료 가격)을 비교해서
		 * 가격이 작거나 같은 음료를 선택. ==> 반복해서 선택.
		 */
		
		for (int i =0 ; i<drinks.length; i++) {
			if(coin >= drinks[i].price) {
				System.out.print(drinks[i].name + "\t");
			}
		}
		sc.close();
		}
 }
