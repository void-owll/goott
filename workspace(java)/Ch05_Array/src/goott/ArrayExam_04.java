package goott;

// 2. 배열의 초기값을 이용하여 배열 생성
public class ArrayExam_04 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		
		for (int element : arr1) {
			System.out.print(element+"\t");
			if (element >= 30) break;
		}
	}
}
