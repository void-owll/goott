package exam;

public class Exam_05 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		//나의 풀이법
		System.out.println("내 풀이법");
		for(int i=0; i<arr.length ;i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (i+1)+(j*5);
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		///////////////////////////// 선생님 풀이법
		System.out.println("선생님 풀이법");
		int count = 1;
		int[][] score = new int[5][5];
		for(int i=0 ; i<score.length ; i++) {
			for(int j=0 ; j<score[i].length ; j++) {
				score[j][i] = count++;
			}
		}
		
		for(int i=0 ; i<score.length ; i++) {
			for(int j=0 ; j<score[i].length ; j++) {
				System.out.printf("%2d\t",score[i][j]); // %02d 입력 시 01 02 이렇게뜸
			}
			System.out.println();
		}
	}
}
