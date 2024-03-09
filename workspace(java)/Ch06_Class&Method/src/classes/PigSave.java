package classes;

// 돼지 저금통
public class PigSave { 		// piggy bank, coin box 등의 표현이 있음.
	private int balance;	// private를 통해 캡슐화
	public PigSave() {
		// TODO Auto-generated constructor stub
	}
	
	public PigSave(int balance) {
		this.balance = balance;
	}
	
	// 입금을 하는 메서드
	public void deposit(int money) {
		System.out.println("돼지 저금통에 입금을 합니다.");
		balance += money;
		System.out.println("현재 잔액 >>> " + balance + "원");
	}
	
	// 출금을 하는 메서드
	public void withdraw(int money) {
		if(money > balance) {
			System.out.println("잔액이 부족합니다....");
			return;		// 현재 실행중인 메서드를 종료시키는 명령어
		}
		
		System.out.println("돼지 저금통에 출금을 합니다.");
		balance -= money;
		System.out.println("현재 잔액 >>> " + balance + "원");
	}
}
