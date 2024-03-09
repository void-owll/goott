package exam;

public class NameCard {
	String name;
	String phone;
	String address;
	String position;
	
	public NameCard() {
		// TODO Auto-generated constructor stub
	}
	
	public NameCard(String name, String phone, String address, String position) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.position = position;
	}
	
	public void printNameCard() {
		System.out.println("========================");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + address);
		System.out.println("직급 : " + position);
	}
	
}
