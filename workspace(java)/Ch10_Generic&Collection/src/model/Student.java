package model;

public class Student {
	private String hakbun;
	private String name;
	private String major;
	private String phone;
	private String addr;
	
	public Student() {
	}
	public Student(String h, String n, String m, String p, String a) {
		hakbun = h;
		name = n;
		major = m;
		phone = p;
		addr = a;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
