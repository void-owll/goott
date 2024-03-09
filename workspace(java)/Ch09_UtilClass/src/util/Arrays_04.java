package util;

import java.util.Arrays;

/*
 * 4. Arrays 클래스
 *    - 배열 객체를 처리해 주는 클래스.
 *    
 */
public class Arrays_04 {

	public static void main(String[] args) {
		String[] str = {"홍길동", "세종대왕", "유관순"};
		for(String s : str) {
			System.out.println("str 배열 요소 >> " + s);
		}
		System.out.println(str);
		System.out.println();
		
		// 1. fill() : 배열의 요소를 특정한 값(데이터)으로 채우는 메서드.
		// 같은 index(주소)는 바뀌지 않고, 값만 바뀐다.
		Arrays.fill(str, "김유신");
		
		for(String s : str) {
			System.out.println("str 배열 요소 >> " + s);
		}
		System.out.println(str);
		System.out.println();
		
		// 2. equals(객체, 객체) : 두 객체의 내용(데이터)이 같은지 틀린지를 비교하는 메서드.
		//  						==> 반환 타입은 boolean 타입
		String[] str1 = {"김유신", "김유신", "감유신"};
		if(Arrays.equals(str1,  str)) 	System.out.println("두 객체의 내용(데이터)은 같습니다.");
		else System.out.println("두 객체의 내용(데이터)은 다릅니다.");
		System.out.println(
				Arrays.equals(str1, str) == true 
				? "두 객체의 내용은 같습니다" 
				: "두 객체의 내용은 다릅니다"
		);
		System.out.println();
		
		// 3. sort() : 배열의 원소(데이터)를 정렬(오름차순)해 주는 메서드.
		int[] arr = {54, 66, 13, 97, 41};
		Arrays.sort(arr);
		for(int a : arr) {
			System.out.print(a + "\t");
		}
		System.out.println();
		
		for(int i=(arr.length)-1; i>=0; i--) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
