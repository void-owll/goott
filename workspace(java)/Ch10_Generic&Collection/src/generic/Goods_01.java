package generic;

public class Goods_01 {

	public static void main(String[] args) {
		// Goods1 객체를 이용하여 Apple 객체를 추가하거나 가져오기
		// 이거 무조건 공부해야 함 ..
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());  
		Apple apple = goods1.getApple();
		apple.output();
		
		// Goods2 객체를 이용하여 Pencil 객체를 추가하거나 가져오기
		Goods2 goods2 = new Goods2();
		
		goods2.setPencil(new Pencil());
		Pencil pencil = goods2.getPencil();
		pencil.output();
		
	}

}
