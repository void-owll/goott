package accessTwo;

import accessOne.Super;

public class Sub extends Super{
	public static void main(String[] args) {
		Sub sub = new Sub();
		
		// System.out.println("num1 >> " + sub.num1); 	// private : 동일 클래스 아니면 접근 불가
		// System.out.println("num2 >> " + sub.num2); 	// default : 동일 패키지 아니면 접근 불가
		System.out.println("num3 >> " + sub.num3); 		// protected : 상속받을 경우 접근 가능
		System.out.println("num4 >> " + sub.num4); 		// public : 어디서든지 접근 가능
		
		
	}
}
