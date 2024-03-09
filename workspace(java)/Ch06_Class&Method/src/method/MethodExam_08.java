package method;
/*
 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 * ★★★★★★★★★쌉 중 요 한 내 용★★★★★★★★★★★★★★
 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 * 
 */
public class MethodExam_08 {
	public static void change(int[] array) { // 주소값을 받았으므로 같은 배열을 가리키고
		System.out.println("array >>> " + array);
		for(int i=0 ; i < array.length ; i++ ) {	// 같은 주소값의 값을 변경했기 때문에 배열의 값이 바뀜
			array[i] = array[i] * 10;
		}
	}
	
	public static void main(String[] args) {
		
		
		// 2. call by reference 방식
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println("change() 메서드 호출 전...");
		System.out.println("arr >> " + arr);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("arr[" + i + "] >>> " + arr[i]);
		}
		
		System.out.println();
		change(arr); //arr 안에는 arr[] 배열의 주소값이 들어 있으므로, 주소값이 change()메서드로 넘어감.
		System.out.println("change() 메서드 호출 후...");
		System.out.println("arr >> " + arr);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("arr[" + i + "] >>> " + arr[i]);
		}
		
	}
}
