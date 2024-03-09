package exam;

public class Permanent extends Employee {
	int pay;
	int bonus;
	
	public Permanent() {
		// TODO Auto-generated constructor stub
	}
	public Permanent(String name, int pay, int bonus) {
		super.setName(name);
		this.pay = pay;
		this.bonus = bonus;
	}
	@Override
	int getPays() {
		return pay + bonus;
	}
}
