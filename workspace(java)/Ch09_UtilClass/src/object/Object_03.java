package object;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Object_03 {
	public static void main(String[] args) {
		// String 배열 객체 생성
		String[] str = new String[4];
		str[0] = "홍길동";
		str[1] = "hong";
		str[2] = "서울시 구로구";
		//str[3] = 300; // 자료형 불일치 error 발생
		str[3] = "010-1414-1548";
		
		for(String s : str) {
			System.out.println("str 배열요소 >> " + s);
		}
		System.out.println();
		
		// Object 배열 객체 생성
		Object[] obj = new Object[4];  // obj 자료형에는 뭐든지 들어간다!!
		obj[0] = "세종대왕";
		obj[1] = 135;
		obj[2] = true;
		obj[3] = 3.4567;
		
		for(Object o : obj) {
			System.out.println("obj 배열요소 >> " + o);
		}
	}
}
