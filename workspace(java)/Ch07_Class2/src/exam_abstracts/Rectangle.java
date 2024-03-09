package exam_abstracts;

public class Rectangle implements Shape{
	int height;
	int width;
	
	@Override
	public double findArea() {
		return height * width;
	}
	public Rectangle() {
	}
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
}
