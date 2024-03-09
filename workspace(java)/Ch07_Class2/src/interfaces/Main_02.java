package interfaces;

interface Inter1 {
	
	void aa();
}

interface Inter2 {
	
	void bb();
}

interface Inter3 extends Inter1, Inter2 {
	
	// void aa();      // 상속이 된 추상 메서드
	// void bb();      // 상속이 된 추상 메서드
	void cc();
}

class Total implements Inter3 {

	@Override
	public void aa() {
		
		System.out.println("aa() 추상 메서드 재정의~~~");
		
	}

	@Override
	public void bb() {
		
		System.out.println("bb() 추상 메서드 재정의~~~");
		
	}

	@Override
	public void cc() {

		System.out.println("cc() 추상 메서드 재정의~~~");
	}
	
}

public class Main_02 {

	public static void main(String[] args) {
		
		Total total = new Total();
		
		total.aa(); total.bb(); total.cc();

	}

}
