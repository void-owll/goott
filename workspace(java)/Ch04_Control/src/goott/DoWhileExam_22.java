package goott;
/*
 * do ~ while 반복문
 * - 먼저 반복 실행문을 실행을 하고 난 후 조건식을 비교함.
 * 
 * 형식)
 * 		do {
 * 			반복 실행 문장;
 * 		} while (조건식);
 */
public class DoWhileExam_22 {

	public static void main(String[] args) {
		// 1 ~ 10 까지 화면에 출력을 해 보자. - while 반복문
		int su = 1;
		while (su >= 10) {
			System.out.println("su >> " + su++);
		}
		
		
		// 1 ~ 10 까지 화면에 출력을 해 보자. - do~while 반복문
		int num = 1;
		do {
			System.out.println("num >> " + num++);
		} while (num >= 10);
			
		
	}

}
