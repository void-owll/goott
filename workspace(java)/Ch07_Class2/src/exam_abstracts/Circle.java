package exam_abstracts;

public class Circle implements Shape{
	int range;
	
	public Circle() {
	}
	
	public Circle(int range) {
		this.range = range;
	}
	
	@Override
	public double findArea() {
		return 3.14 * range * range;
	}
}
