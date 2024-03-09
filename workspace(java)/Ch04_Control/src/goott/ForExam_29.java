package goott;

/*
 * 아래와 같이 화면에 출력을 해 보자.
 * 1.	*******
 * 		*******
 * 		*******
 * 		*******
 * 
 * 2.	*
 * 		**
 * 		***
 * 		****
 * 		*****
 * 
 * 3. 	*****
 * 		****
 * 		***
 * 		**
 * 		*
 */
public class ForExam_29 {

	public static void main(String[] args) {
		 for(int i =1 ; i <= 4; i++ ) {
			 for(int j = 1 ; j <= 7 ; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 
		 for(int i = 1; i <= 5; i++) {
			 for(int j = 1 ; j <= i ; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 
		 for(int i = 1; i <= 5; i++) { 				// for(int i=5; i>=1; i--)
			 for(int j = 1 ; j <= (6-i) ; j++) { 	// for(int j=1; j<=i; j++)
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}

}
