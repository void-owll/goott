package exam;

import java.util.Scanner;

public class Items_Exam_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품의 종류가 몇 가지인가요? : ");
		
		Items[] item = new Items[sc.nextInt()];
		int prod = 0;
		int vat = 0;
		int sum = 0;
	
		
		for(int i=0 ; i<item.length ; i++) {
			System.out.println((i+1)+"번째 품명, 단가, 수량을 입력하세요. ");
			item[i] = new Items(sc.next(), sc.nextInt(), sc.nextInt());
		}
		
		System.out.println("품명\t\t단가\t수량\t금액\t");
		System.out.println("------------------------------------------");
		for(int i=0 ; i<item.length ; i++) {
			System.out.print(item[i].name+"\t\t"+item[i].price+"\t"+item[i].amount+"\t");	
			System.out.printf("%,d원\n", item[i].getTotalPrice());
			sum += (item[i].amount * item[i].price);
		}
		
		
		prod = (int) (sum / Items.VAT_RATE);
		vat = sum - prod;
		
		System.out.println("------------------------------------------");
		System.out.printf("공급가액\t\t\t%,d원\n",prod);
		System.out.printf("부가세액\t\t\t%,d원\n",vat);
		System.out.println("------------------------------------------");
		System.out.printf("청구금액\t\t\t%,d원",sum);
		sc.close();
	}

}
