package exam_abstracts;

public class Permanent extends Employee{
	int salary;
	int bonus;
	
	public Permanent() {
	}
	public Permanent(String name,int salary, int bonus) {
		setName(name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getSalary() {
		return salary;
	}

	public int getBonus() {
		return bonus;
	}
	
	@Override
	int getPays() {
		return salary + bonus;
	}
	
}
