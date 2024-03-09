package exam;

public class Items {
	String name;
	int price;
	int amount;
	static final double VAT_RATE = 1.1;
	
	public Items() {
		// TODO Auto-generated constructor stub
	}
	public Items(String name, int price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public int getVat() {
		return (int) (getTotalPrice() / VAT_RATE);
	}
	
	public int getTotalPrice() {
		return price*amount;
	}
	
	
}
