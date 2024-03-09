package generic;

public class Goods_02 {
	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.setObject(new Apple());
		
		Apple apple = (Apple)(goods.getObject());
		apple.output();
		System.out.println();
		
		/*
		 * 데이터를 저장할 때는 상관이 없지만, 저장된 데이터를 각각의 타입(Apple, Pencil)을 꺼내 오기 위해서는 
		 * 저장된 형태로 캐스팅(형변환)을 해야 함. 
		 * 필드 자체가 Object 타입이기 때문에 get() 메서드로 가져오는 타입 또한 항상 Object 타입이 됨.
		 * 
		 * 따라서 Apple 객체를 저장했을 때는 get() 메서드로 가져온 Object 타입을 Apple 타입으로,
		 * Pencil 객체를 저장했을 때는 Pencil 타입으로 형변환해야 함.
		 * 정확하게 해당 객체 타입으로 형변환을 해 주는 경우에는 문제가 발생하지 않지만, 
		 * 다를 객체 타입으로 형변환을 해 주게 되면
		 * 실행 중에 예외(ClassCastException)가 발생할 수 있음.
		 * 
		 * 이렇게 되면 정상적으로 프로그램이 종료되지 않는 문제가 발생할 수 있음.
		 * 
		 *  Object 타입으로 선언된 변수에 데이터가 들어가는 경우, 
		 *  해당 변수에 있는 값을 꺼내고 싶은 경우에는 반드시 형변환(캐스팅) 작업이 필요함.
		 *  이러한 형변환 작업이 자주 일어나게 되면 프로그램 성능이 저하될 수 있음.
		 *  이러한 문제점을 해결하는 것이 제네릭(generic).
		 */
	}
	
}
