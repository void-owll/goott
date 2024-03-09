package exam;

public class Exam_06 {
	public static void main(String[] args) {
		int[][] arr = new int[5][];
		int count = 1;
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<=i; j++) {
				arr[i] = new int[i+1];
				arr[i][j] = count++;
				System.out.printf("%2d\t",arr[i][j]);
			}
			System.out.println();
		}	
	}
	
}
