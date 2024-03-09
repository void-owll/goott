package exam;

public class Temporary extends Employee {
	int time;
	int pay;
	public Temporary() {
		// TODO Auto-generated constructor stub
	}
	public Temporary(String name, int time, int pay) {
		super.setName(name);
		this.time = time;
		this.pay = pay;
	}
	@Override
	int getPays() {
		return time * pay;
	}
}

