package singleton;				// 자바의 디자인 패턴 중 하나인 Singleton 패턴임.

public class Member {			
	private Member() {			// 외부에서 기본생성자를 직접적으로 접근하지 못함
	}
	private static Member instance = null;
	
	public static Member getInstance() {
		if (instance == null) {
			instance = new Member();
		}
		return instance;
	}
	
}
