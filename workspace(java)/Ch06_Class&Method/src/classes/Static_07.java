package classes;

// 정적 변수와 정적 메모리는 프로그램 실행과 동시에 메모리에 적재됨.
public class Static_07 {
	public static void main(String[] args) {
		System.out.println("num(static 변수) >>> " + Static.num);
		System.out.println("adder() 메서드 호출 >>> " + Static.adder(150, 37));
		Static static1 = new Static();
		System.out.println("su1(인스턴스) 변수 값 >>> " + static1.su1);
		System.out.println("su2(인스턴스) 변수 값 >>> " + static1.su2);
		static1.sum();	
	}
}