package classes;

public class PigSave_09 {
	public static void main(String[] args) {
		PigSave save = new PigSave(0);
		
		save.deposit(30000);		// 입금 메서드 호출
		save.deposit(40000);		// 입금 메서드 호출
		save.withdraw(40000);		// 출금 메서드 호출 
		save.deposit(20000);		// 입금 메서드 호출
		save.withdraw(60000);		// 입금 메서드 호출
		
		// 이렇게 변수에 직접 접근하면 안 됨.
		// save.balance = 100000;
	}
}
