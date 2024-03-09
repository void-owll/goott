package abstracts;

public abstract class SmartPhone {

	// 스마트폰의 공통적인 기능의 특성(속성)
	String call = "전화";
	String sns = "문자";
	String search = "검색";
	String game = "게임";
	
	// 각각의 기계(단말기)들의 특성
	String company, name, color, size, weight, price;
	
	void purpose() {
		System.out.println
			("사용 목적 : "+call+" / "+sns+" / "+search+" / "+game);
	}
	
	// 각각의 단말기(기계)들의 spec
	abstract void spec();
	
}
