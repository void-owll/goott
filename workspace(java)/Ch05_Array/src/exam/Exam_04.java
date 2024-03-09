package exam;

public class Exam_04 {
	public static void main(String[] args) {
		int count = 1;
		int[][] arr = new int[5][5];
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = count++;
			}
		}
		
		// (배열에서는) 출력문을 따로 만들어 두자.
		// 문제가 생길 여지를 안 주기 위함.
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
