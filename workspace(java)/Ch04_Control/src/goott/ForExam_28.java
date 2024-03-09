package goott;
/* 
 * 다중 for 문을 이용하여 구구단을 만들어 보자
 */
public class ForExam_28 {

	public static void main(String[] args) {

		/*

		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for (int j = 1; j <= 9; j++) {
				System.out.println(dan + " * "+ j + " = " + (dan*j));
			}
			System.out.println();
		}
		*/
		 
		
		// 행 열 맞춰서 구구단 출력하기
		for (int j = 1; j <= 9; j++) {
			for (int i = 2 ; i <= 9; i++) {
				System.out.print(i + " * " + j +  " = " +(i*j)+ "\t" );
			}
			System.out.println();
		}
		
	}

}
