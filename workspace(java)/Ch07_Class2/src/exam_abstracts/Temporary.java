package exam_abstracts;

public class Temporary extends Employee{
	int time;
	int pay;
	public int getTime() {
		return time;
	}
	public int getPay() {
		return pay;
	}
	public Temporary() {
	}
	public Temporary(String name, int time, int pay) {
		setName(name);
		this.time = time;
		this.pay = pay;
	}
	@Override
	int getPays() {
		return time * pay;
	}
}
