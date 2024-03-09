package abstracts;

public class IPhone extends SmartPhone {

	@Override
	void spec() {
		company = "애플"; name = "IPhone 14 Pro";
		color = "화이트"; size = "15cm";
		weight = "200g"; price = "155만원";
		
		System.out.println
			("제조사 : "+company+" / 단말기명 : "+name+
			 " / 색상 : "+color+" / 규격 : "+size+
			 " / 무게 : "+weight+" / 가격 : "+price);
		
	}

}
