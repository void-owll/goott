package goott;

import java.util.Scanner;

public class SwitchCaseExam_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int su = sc.nextInt();
		
		switch(su % 5) {
			case 0 :
				System.out.println("입력 받은 " + su + "은(는) 5의 배수입니다");
				break;
			case 1 :
				System.out.println("입력 받은 " + su + "은(는) 5의 배수가 아닙니다. 나머지가 1 입니다.");
				break;
			case 2 :
				System.out.println("입력 받은 " + su + "은(는) 5의 배수가 아닙니다. 나머지가 2 입니다.");
				break;
			case 3 :
				System.out.println("입력 받은 " + su + "은(는) 5의 배수가 아닙니다. 나머지가 3 입니다.");
				break;
			case 4 :
				System.out.println("입력 받은 " + su + "은(는) 5의 배수가 아닙니다. 나머지가 4 입니다.");
				break;
		} // 음수 입력 받으면, 5의 배수가 아닐 경우 해당되는 case가 없음 (-1 나누기 5의 나머지는 -1임)
		sc.close();
		

	}

}
