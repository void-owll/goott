package exam;

public class Exam_02_04 {

	public static void main(String[] args) {
		for ( char a = 1 ; a <= 26 ; a++ ) {
			for ( char b = 'A' ; b <= 'Z'+1-a ; b++) {
				System.out.print(b);
			}
			System.out.println();
		}

	}

}
