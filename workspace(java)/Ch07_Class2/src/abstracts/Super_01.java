package abstracts;

public class Super_01 {

	public static void main(String[] args) {
		
		// 추상 클래스는 객체 생성 불가능.
		// Super super = new Super();
		
		Sub sub = new Sub();
		
		sub.num1 = 35;
		
		System.out.println("calc() 메서드 호출 >>> " + sub.calc());
		
		sub.output();  // 추상메서드 재정의 호출

	}

}
