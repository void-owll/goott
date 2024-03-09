package inheritance;

public class Sonata extends Car{
	String model;
	// 아래의 변수가 Car로부터 상속되어 포함됨.
	// int cc;
	// int door;
	
	void getCarInfo() {
		System.out.println("모델명 >>> " + model);
		System.out.println("배기량 >>> " + cc);
		System.out.println("차량 문 수 >>> " + door);
	}

}
