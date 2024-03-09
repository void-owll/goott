package abstracts;

public class SmartPhone_03 {

	public static void main(String[] args) {
		
		Galaxy galaxy = new Galaxy();
		IPhone iPhone = new IPhone();
		
		galaxy.purpose();
		galaxy.spec();      // 추상 메서드 재정의
		
		System.out.println();
		
		iPhone.purpose();
		iPhone.spec();      // 추상 메서드 재정의

	}

}
