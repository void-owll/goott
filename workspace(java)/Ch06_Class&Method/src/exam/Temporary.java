package exam;

public class Temporary {
	String name;
	int time;
	int pay;
	
	public Temporary() {
		// TODO Auto-generated constructor stub
	}
	public Temporary(String name, int time, int pay) {
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	public int totalSalary() {
		return time*pay;
	}
	
	public int deDuction() {
		return (int) (totalSalary() * 0.03);
	}
	
	public int actualSalary() {
		return totalSalary() - deDuction();
	}
	
}
