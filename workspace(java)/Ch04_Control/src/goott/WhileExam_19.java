package goott;

public class WhileExam_19 {

	public static void main(String[] args) {
		// ABCDEFGHIJKLMN ... XYZ 까지 문자를 출력해 보자.
		
		char alpha = 'A';
		
		while (alpha <= 'Z' ) {
			System.out.print(alpha);
			alpha ++;
			
		}
		System.out.println();
		// ZYXEV... 
		
		char alpha2 = 'Z';
		while (alpha2 >= 'A') {
			System.out.print(alpha2);
			alpha2 --;
			
		}
	}

}
