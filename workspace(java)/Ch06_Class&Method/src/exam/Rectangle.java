package exam;

public class Rectangle {
	int width;
	int height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int area() {
		return width*height;
	}
	public int girth() {
		return width*2+ height*2;
	}
}
 