package abstracts;

public class Galaxy extends SmartPhone {

	
	
	@Override
	void spec() {
		company = "삼성"; name = "Galaxy S24";
		color = "화이트"; size = "22cm";
		weight = "350g"; price = "140만원";
		
		System.out.println
			("제조사 : "+company+" / 단말기명 : "+name+
			 " / 색상 : "+color+" / 규격 : "+size+
			 " / 무게 : "+weight+" / 가격 : "+price);
	}

}
