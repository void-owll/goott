package singleton;

public class Member_01 {
	public static void main(String[] args) {
		Member member1 = Member.getInstance();
		Member member2 = Member.getInstance();
		Member member3 = Member.getInstance();
		Member member4 = Member.getInstance();
		Member member5 = Member.getInstance();
		Member member6 = Member.getInstance();
		Member member7 = Member.getInstance();
		Member member8 = Member.getInstance();
		Member member9 = Member.getInstance();
		Member member10 = Member.getInstance();
		System.out.println("member1 주소 >> " + member1);
		System.out.println("member2 주소 >> " + member2);
		System.out.println("member3 주소 >> " + member3);
		System.out.println("member4 주소 >> " + member4);
		System.out.println("member5 주소 >> " + member5);
		System.out.println("member6 주소 >> " + member6);
		System.out.println("member7 주소 >> " + member7);
		System.out.println("member8 주소 >> " + member8);
		System.out.println("member9 주소 >> " + member9);
		System.out.println("member10 주소 >> " + member10);
	}
}
