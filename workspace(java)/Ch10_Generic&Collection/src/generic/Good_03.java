package generic;

public class Good_03 {

	public static void main(String[] args) {
		Good<Apple> good1 = new Good<Apple>();
		good1.setT(new Apple());
		Apple apple = good1.getT();
		apple.output();
		
		System.out.println();
		Good<Pencil> good2 = new Good<>();
		good2.setT(new Pencil());
		Pencil pencil = good2.getT();
		pencil.output();
		
	}

}
